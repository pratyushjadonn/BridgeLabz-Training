package stream_api;

import java.util.*;
import java.util.stream.*;

public class TransformNames {
	public static void main(String[] args) {

		List<String> customers = Arrays.asList("rahul", "Anita", "mohan", "Priya");

		customers.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
	}
}
