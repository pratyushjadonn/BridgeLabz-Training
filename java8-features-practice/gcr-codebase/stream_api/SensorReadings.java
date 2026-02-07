package stream_api;

import java.util.*;

public class SensorReadings {
	public static void main(String[] args) {

		List<Double> readings = Arrays.asList(22.5, 30.1, 18.9, 35.6, 25.0);

		double threshold = 25.0;

		readings.stream().filter(r -> r > threshold).forEach(r -> System.out.println("High reading: " + r));
	}
}
