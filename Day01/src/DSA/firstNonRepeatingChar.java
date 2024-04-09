package DSA;

import java.util.HashMap;
import java.util.Map;

//First Non-Repeating Character: Find the first non-repeating character in a string.

public class firstNonRepeatingChar {
	public static char firNonRepChar(String str) {
		// Create a HashMap to store character frequencies
		Map<Character, Integer> charFreq = new HashMap<>();

		// Traverse the string and update character frequencies
		for (char ch : str.toCharArray()) {
			charFreq.put(ch, charFreq.getOrDefault(ch, 0) + 1);
		}
		// Iterate over the string to find the first non-repeating character
		for (char ch : str.toCharArray()) {
			if (charFreq.get(ch) == 1) {
				return ch; // Found the first non-repeating character
			}
		}
		return '\0'; // If no non-repeating character found, return null character
	}

	public static void main(String[] args) {
		String str = "leetcode"; // Example string
		char firstNonRepeating = firNonRepChar(str);
		if (firstNonRepeating != '\0') {
			System.out.println("The first non-repeating character in '" + str + "' is: " + firstNonRepeating);
		} else {
			System.out.println("No non-repeating character found in '" + str + "'.");
		}
	}
}
