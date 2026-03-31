package json;
import org.json.JSONObject;
import org.json.XML;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class JsonToXml {
    public static void main(String[] args) throws IOException {
        // Read JSON file as a string
        String jsonContent = Files.readString(new File("src/user.json").toPath());
        JSONObject jsonObject = new JSONObject(jsonContent);

        // Convert JSON to XML
        String xml = XML.toString(jsonObject);

        // Print XML
        System.out.println(xml);
    }
}
