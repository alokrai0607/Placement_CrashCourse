package DSA_Day02;

public class ContainerWithMostWater {
	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxArea = 0;

		while (left < right) {
			int minHeight = Math.min(height[left], height[right]);
			int width = right - left;
			int area = minHeight * width;
			maxArea = Math.max(maxArea, area);

			if (height[left] <= height[right]) {
				left++;
			} else {
				right--;
			}
		}

		return maxArea;
	}

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(height)); // Output: 49
	}
}
