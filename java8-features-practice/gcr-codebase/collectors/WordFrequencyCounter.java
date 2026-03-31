package collectors;

import java.util.*;
import java.util.stream.*;

public class WordFrequencyCounter {
	public static void main(String[] args) {

		String text = "java is fun and java is powerful";

		Map<String, Integer> wordCount = Arrays.stream(text.split("\\s+"))
				.collect(Collectors.toMap(word -> word, word -> 1, Integer::sum // merge duplicates
				));

		wordCount.forEach((word, count) -> System.out.println(word + " : " + count));
	}
}
