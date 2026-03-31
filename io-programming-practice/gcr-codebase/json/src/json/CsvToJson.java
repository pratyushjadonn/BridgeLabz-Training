package json;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CsvToJson {
    public static void main(String[] args) throws IOException {
        File csvFile = new File("src/user.csv");
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader(); // first row as header
        MappingIterator<Map<String, String>> it = csvMapper.readerFor(Map.class)
                .with(schema)
                .readValues(csvFile);

        List<Map<String, String>> csvData = it.readAll();

        // Convert to JSON
        ObjectMapper jsonMapper = new ObjectMapper();
        jsonMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/user.json"), csvData);

        System.out.println("CSV converted to JSON successfully!");
    }
}
