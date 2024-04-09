package DSA;

//String Rotation Check: Given two strings, check if one is a rotation of the other using only one 
//call to a substring method (e.g., “waterbottle” is a rotation of “erbottlewat”).
public class isRotation {
	public static boolean isRot(String str1, String str2) {
		// Check if lengths are equal and not empty
		if (str1.length() == str2.length() && str1.length() > 0) {
			String concatenated = str1 + str1;
			return concatenated.contains(str2);
		}
		return false;
	}

	public static void main(String[] args) {
		String str1 = "waterbottle"; // Example string 1
		String str2 = "erbottlewat"; // Example string 2

		if (isRot(str1, str2)) {
			System.out.println(str2 + " is a rotation of " + str1);
		} else {
			System.out.println(str2 + " is not a rotation of " + str1);
		}
	}
}
