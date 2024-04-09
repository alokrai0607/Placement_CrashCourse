package DSA_Day02;

public class ValidPalindromeII {
	public static boolean validPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
			}
			left++;
			right--;
		}
		return true;
	}

	private static boolean isPalindrome(String s, int start, int end) {
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "aba"; // true
		String s2 = "abca"; 
		String s3 = "abcde"; // false
		System.out.println(validPalindrome(s1));
		System.out.println(validPalindrome(s2));
		System.out.println(validPalindrome(s3));
	}
}
