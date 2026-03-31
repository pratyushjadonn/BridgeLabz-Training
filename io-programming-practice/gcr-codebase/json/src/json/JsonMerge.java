package json;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class JsonMerge {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Read the two JSON files
            JsonNode json1 = mapper.readTree(new File("src/user.json"));
            JsonNode json2 = mapper.readTree(new File("src/student.json"));

            // Merge json2 into json1
            if (json1.isObject() && json2.isObject()) {
                ObjectNode merged = ((ObjectNode) json1).deepCopy();
                merged.setAll((ObjectNode) json2); // keys from json2 overwrite json1 if duplicate

                // Write merged JSON to a new file
                mapper.writerWithDefaultPrettyPrinter().writeValue(new File("merged.json"), merged);
                System.out.println("Merged JSON saved as merged.json");
            } else {
                System.out.println("Both JSON files must be JSON objects (not arrays).");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
