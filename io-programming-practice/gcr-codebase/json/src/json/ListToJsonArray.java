package json;
import java.util.*;

import com.google.gson.Gson;
class Student{
	String name;
	int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
}
public class ListToJsonArray {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student("Amit", 22));
        list.add(new Student("Bhumika", 21));
        list.add(new Student("Rahul", 26));
        Gson gson=new Gson();
        String jsonArray=gson.toJson(list);
        System.out.println(jsonArray);
		
	}

}
