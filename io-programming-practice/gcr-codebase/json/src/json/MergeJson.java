package json;

import com.google.gson.JsonObject;

public class MergeJson {
	public static void main(String[] args) {
		JsonObject json1=new JsonObject();
		json1.addProperty("name","Bhumika");
		json1.addProperty("age",21);
		
		JsonObject json2=new JsonObject();
		json2.addProperty("email","bhumi333333@gmail.com");
		json2.addProperty("city","Agra");
		
		for(String key:json2.keySet()) {
			json1.add(key,json2.get(key));
		}
		System.out.println(json1);
	}

}
