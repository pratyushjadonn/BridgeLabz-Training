package json;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CreateJsonObject {
	public static void main(String[] args) {
		//creating json object
		JsonObject obj=new JsonObject();
		//adding properties
		obj.addProperty("name","Bhumika Chaudhary");
		obj.addProperty("age",21);
		//creating json array
		JsonArray subjects=new JsonArray();
		subjects.add("Cryptography");
		subjects.add("Industrial Management");
		obj.add("subjects",subjects);
		System.out.println(obj);
	}

}
