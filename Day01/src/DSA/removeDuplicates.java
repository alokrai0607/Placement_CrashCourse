package DSA;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {
	public static String removeDupli(String str) {
		StringBuilder result = new StringBuilder();
		Set<Character> seen = new HashSet<>();

		for (char ch : str.toCharArray()) {
			if (!seen.contains(ch)) {
				result.append(ch);
				seen.add(ch);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String input = "tree traversal"; // Example input string
		String output = removeDupli(input);
		System.out.println("Original string: " + input);
		System.out.println("String after removing duplicates: " + output);
	}
}
