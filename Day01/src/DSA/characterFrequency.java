package DSA;

import java.util.HashMap;
import java.util.Map;

//Character Frequency Count: Given a string, count the frequency of each character using an object/hashmap.

public class characterFrequency {
	public static Map<Character, Integer> charFrequency(String str) {
		Map<Character, Integer> frequencyMap = new HashMap<>();

		// Iterate through the string and update the frequency map
		for (char ch : str.toCharArray()) {
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
		}
		return frequencyMap;
	}

	public static void main(String[] args) {
		String str = "hello world"; // Example string
		// Get the frequency map
		Map<Character, Integer> frequencyMap = charFrequency(str);
		// Print the frequency of each character
		System.out.println("Character frequencies:");
		for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
