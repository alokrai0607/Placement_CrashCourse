package DSA;


//Rotation Count in Rotated Sorted Array: Find out how many times a sorted array has been rotated. Assume there are no duplicates.

public class findRotationCount {
	public static int findRotCount(int[] arr) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;

		while (low <= high) {
			// Case 1: If the array is already sorted
			if (arr[low] <= arr[high]) {
				return low;
			}

			int mid = low + (high - low) / 2;
			int next = (mid + 1) % n; // Calculate the index of the next element

			// Case 2: If the mid element is the smallest (rotation point)
			if (arr[mid] <= arr[(mid + n - 1) % n] && arr[mid] <= arr[next]) {
				return mid;
			}

			// Case 3: Decide whether to go to the left half or the right half
			if (arr[mid] <= arr[high]) {
				high = mid - 1;
			} else if (arr[mid] >= arr[low]) {
				low = mid + 1;
			}
		}

		return -1; // Invalid input or array is not rotated
	}

	public static void main(String[] args) {
		int[] arr = { 7, 9, 11, 12, 15, 2, 5 }; // Example rotated sorted array
		int rotationCount = findRotCount(arr);
		System.out.println("The array has been rotated " + rotationCount + " times.");
	}
}
