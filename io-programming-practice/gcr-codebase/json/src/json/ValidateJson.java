package json;
import com.fasterxml.jackson.databind.ObjectMapper;
public class ValidateJson {
    public static void main(String[] args) {
        String json = "{ \"name\" : \"Bhumika Chaudhary\", \"age\" : 21 }";
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readTree(json);  // validation
            System.out.println("Valid JSON");
        } catch (Exception e) {
            System.out.println("Invalid JSON");
        }
    }
}
