package Day06Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class transformedListMain {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "grape", "orange", "kiwi");

		System.out.println("Original list: " + strings);

		List<String> transformedList = strings.stream().filter(s -> s.length() >= 4).map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println("Transformed list: " + transformedList);
	}
}
