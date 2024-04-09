package DSA_Day02;

public class TrappingRainWater {
	
	public static int trap(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxLeft = 0;
		int maxRight = 0;
		int waterTrapped = 0;

		while (left < right) {
			if (height[left] <= height[right]) {
				maxLeft = Math.max(maxLeft, height[left]);
				waterTrapped += maxLeft - height[left];
				left++;
			} else {
				maxRight = Math.max(maxRight, height[right]);
				waterTrapped += maxRight - height[right];
				right--;
			}
		}

		return waterTrapped;
	}

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(trap(height)); // Output: 6
	}
}
