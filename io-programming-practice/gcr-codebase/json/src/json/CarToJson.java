package json;

import com.google.gson.Gson;

class Car{
	String brand;
	String model;
	int year;
	public Car(String brand,String model,int year) {
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
}
public class CarToJson{
	public static void main(String[] args) {
		Car car=new Car("Toyota","Camry",2022);
		//convert to json
		Gson gson=new Gson();
		String json=gson.toJson(car);
		System.out.println(json);
	}
}
