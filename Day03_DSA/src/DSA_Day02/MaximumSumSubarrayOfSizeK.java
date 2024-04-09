package DSA_Day02;

public class MaximumSumSubarrayOfSizeK {
	public static int maxSubArray(int[] nums, int k) {
		int maxSum = 0;
		int windowSum = 0;

		for (int i = 0; i < k; i++) {
			windowSum += nums[i];
		}

		maxSum = windowSum;

		for (int i = k; i < nums.length; i++) {
			windowSum += nums[i] - nums[i - k]; 
			maxSum = Math.max(maxSum, windowSum); 
		}

		return maxSum;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
		int k = 4;
		System.out.println(maxSubArray(nums, k));
	}
}
