package DSA;



public class isPrime {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        int number = 17; // Example number to check for primality
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
