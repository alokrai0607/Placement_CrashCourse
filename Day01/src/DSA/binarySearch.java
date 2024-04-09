package DSA;

public class binarySearch {
	public static int binSearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target)
				return mid;
			else if (arr[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15 }; // Example sorted array
		int target = 7; // Example target value
		int result = binSearch(arr, target);
		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found in the array.");
		}
	}
}
