package DSA;

public class SecondLargestElement {
	public static int findSecondLargest(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 20, 8, 15 };
		int secondLargest = findSecondLargest(arr);
		System.out.println("Second Largest Element: " + secondLargest);
	}
}
