package json;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ValidateEmail {
    public static void main(String[] args) {

        try {
            // Load schema
            String schemaContent = new String(
                    Files.readAllBytes(Paths.get("src/user-schema.json")));
            JSONObject schemaJson = new JSONObject(new JSONTokener(schemaContent));

            Schema schema = SchemaLoader.load(schemaJson);

            // Load JSON data
            String jsonData = new String(
                    Files.readAllBytes(Paths.get("src/user.json")));
            JSONObject jsonObject = new JSONObject(new JSONTokener(jsonData));

            // Validate
            schema.validate(jsonObject);

            System.out.println("Email is VALID");

        } catch (Exception e) {
            System.out.println("Email is INVALID");
            e.printStackTrace();
        }
    }
}
