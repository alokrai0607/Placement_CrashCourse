package DSA;

public class revString {
	public static String reverseString(String str) {
		StringBuilder reversed = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}

		return reversed.toString();
	}

	public static void main(String[] args) {
		String str = "hello"; // Example string
		String reversed = reverseString(str);
		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + reversed);
	}
}
