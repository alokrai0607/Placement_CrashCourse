package Day01Assignment;

public class StringReversal {

	public static String reverseWithString(String input) {
		String reversed = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		return reversed;
	}

	public static String reverseWithStringBuilder(String input) {
		StringBuilder reversed = new StringBuilder(input);
		return reversed.reverse().toString();
	}

	public static String reverseWithStringBuffer(String input) {
		StringBuffer reversed = new StringBuffer(input);
		return reversed.reverse().toString();
	}

	public static void main(String[] args) {
		String original = "JavaWorld";

		String reversedString = reverseWithString(original);
		System.out.println("String reversed using String: " + reversedString);

		String reversedStringBuilder = reverseWithStringBuilder(original);
		System.out.println("String reversed using StringBuilder: " + reversedStringBuilder);

		String reversedStringBuffer = reverseWithStringBuffer(original);
		System.out.println("String reversed using StringBuffer: " + reversedStringBuffer);
	}
}
