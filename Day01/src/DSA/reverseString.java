package DSA;



public class reverseString {
    public static String revString(String s) {
        char[] arr = s.toCharArray(); // Convert string to char array for mutability
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // Swap characters
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr); // Convert char array back to string
    }

    public static void main(String[] args) {
        String str = "hello"; // Example string to reverse
        String reversed = revString(str);
        System.out.println("Reversed string: " + reversed);
    }
}
