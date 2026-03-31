package json;

import java.io.FileReader;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ReadAllKeys {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("src/Student.json");

            //parse JSON file
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();

            //loop through all keys and values
            for(String key:jsonObject.keySet()) {
            	System.out.println(key+" : "+jsonObject.get(key));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
