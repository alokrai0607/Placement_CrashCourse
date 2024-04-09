package DSA;

import java.util.HashMap;
import java.util.Map;

public class hasUniqueCharacters {
	public static boolean hasUniqCharacters(String str) {
		Map<Character, Integer> charCount = new HashMap<>();

		// Iterate through the string and update character counts
		for (char ch : str.toCharArray()) {
			charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
		}

		// Check if any character occurs more than once
		for (int count : charCount.values()) {
			if (count > 1) {
				return false; // Not all characters are unique
			}
		}

		return true; // All characters are unique
	}

	public static void main(String[] args) {
		String str = "alokraishivam"; // Example string

		if (hasUniqCharacters(str)) {
			System.out.println("All characters in '" + str + "' are unique.");
		} else {
			System.out.println("Not all characters in '" + str + "' are unique.");
		}
	}
}
