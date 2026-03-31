package json;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.*;
import java.util.*;

public class IplCsvCensor {

    // Method to mask team names: replace last word with ***
    private static String maskTeamName(String team) {
        if (team == null || team.isEmpty()) return team;
        String[] parts = team.split(" ");
        parts[parts.length - 1] = "***";
        return String.join(" ", parts);
    }

    // Method to redact player name
    private static String redactPlayer(String player) {
        return "REDACTED";
    }

    // Process JSON input
    private static void processJSON(String inputFile, String outputFile) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode root = mapper.readTree(new File(inputFile));
            if (root.isArray()) {
                for (JsonNode node : root) {
                    ObjectNode obj = (ObjectNode) node;
                    // Mask team names
                    obj.put("team1", maskTeamName(obj.get("team1").asText()));
                    obj.put("team2", maskTeamName(obj.get("team2").asText()));
                    obj.put("winner", maskTeamName(obj.get("winner").asText()));
                    // Redact player of the match
                    obj.put("player_of_match", redactPlayer(obj.get("player_of_match").asText()));
                }
            }
            // Write censored JSON
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile), root);
            System.out.println("Censored JSON written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Process CSV input
    private static void processCSV(String inputFile, String outputFile) {
        CsvMapper csvMapper = new CsvMapper();
        try {
            CsvSchema schema = CsvSchema.emptySchema().withHeader();
            List<Map<String, String>> rows = new ArrayList<>();

            try (Reader reader = new InputStreamReader(new FileInputStream(inputFile), "UTF-8")) {
                MappingIterator<Map<String, String>> it = csvMapper.readerFor(Map.class).with(schema).readValues(reader);
                while (it.hasNext()) {
                    rows.add(it.next());
                }
            }

            // Apply censorship
            for (Map<String, String> row : rows) {
                row.put("team1", maskTeamName(row.get("team1")));
                row.put("team2", maskTeamName(row.get("team2")));
                row.put("winner", maskTeamName(row.get("winner")));
                row.put("player_of_match", redactPlayer(row.get("player_of_match")));
            }

            CsvSchema outputSchema = CsvSchema.builder()
                    .addColumn("match_id")
                    .addColumn("team1")
                    .addColumn("team2")
                    .addColumn("score_team1")
                    .addColumn("score_team2")
                    .addColumn("winner")
                    .addColumn("player_of_match")
                    .build().withHeader();

            try (Writer writer = new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8")) {
                csvMapper.writer(outputSchema).writeValues(writer).writeAll(rows);
            }

            System.out.println("Censored CSV written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Example usage
        processJSON("src/ipl_data.json", "ipl_data_censored.json");
        processCSV("src/ipl_data.csv", "ipl_data_censored.csv");
    }
}
