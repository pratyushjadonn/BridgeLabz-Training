package json;

import com.google.gson.*;
import java.util.*;

public class FilterJson {
	public static void main(String[] args) {

		String json = "[{\"name\":\"Amit\",\"age\":22},{\"name\":\"Rahul\",\"age\":28},{\"name\":\"Neha\",\"age\":30}]";

		JsonArray array = JsonParser.parseString(json).getAsJsonArray();

		for (JsonElement element : array) {
			JsonObject obj = element.getAsJsonObject();
			int age = obj.get("age").getAsInt();

			if (age > 25) {
				System.out.println(obj);
			}
		}
	}
}
