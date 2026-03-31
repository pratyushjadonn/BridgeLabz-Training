package json;
import java.io.FileReader;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
public class ReadJson {
	public static void main(String[] args) {
		try {
			FileReader reader=new FileReader("src/Student.json");
			
			//parse json
			JsonObject jsonObject=JsonParser.parseReader(reader).getAsJsonObject();
			
			//extract specific files
			String name=jsonObject.get("name").getAsString();
			String age=jsonObject.get("age").getAsString();
			
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
