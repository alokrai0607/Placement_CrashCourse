package DSA;

//Rotate an array to the right by "K" steps: Rotate an array in place with minimal extra space. 
//The solution should consider various edge cases and optimize for time complexity.

public class rotateArray {
	public static void rotArray(int[] nums, int k) {
		int n = nums.length;

		// Handle cases where k is greater than array length
		k = k % n;

		// Reverse the entire array
		reverse(nums, 0, n - 1);

		// Reverse the first k elements
		reverse(nums, 0, k - 1);

		// Reverse the remaining elements
		reverse(nums, k, n - 1);
	}

	// Utility function to reverse elements in the array from start to end index
	private static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 }; // Example array
		int k = 3; // Number of steps to rotate
		rotArray(nums, k);
		System.out.println("Rotated array: " + java.util.Arrays.toString(nums));
	}
}
