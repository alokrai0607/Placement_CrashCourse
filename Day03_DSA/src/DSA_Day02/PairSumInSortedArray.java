package DSA_Day02;

public class PairSumInSortedArray {
	public static boolean hasPairWithSum(int[] arr, int sum) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int currentSum = arr[left] + arr[right];
			if (currentSum == sum) {
				return true; // Pair found
			} else if (currentSum < sum) {
				left++; // Move left pointer to the right
			} else {
				right--; // Move right pointer to the left
			}
		}
		return false; // No pair found
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 9;
		System.out.println(hasPairWithSum(arr, sum)); // Output: true
	}
}
