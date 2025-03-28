import java.util.Scanner;

public class Problem3 {

    /**
     * This method checks if a number is prime using recursion.
     * Time complexity: O(sqrt(n)), since we only check divisibility up to sqrt(n).
     *
     * @param n The number to check.
     * @param divisor The current divisor (starting from 2).
     * @return True if n is prime, otherwise false.
     */
    public static boolean isPrime(int n, int divisor) {
        if (n <= 1) return false; // 0 and 1 are not prime
        if (divisor * divisor > n) return true; // No divisors found, so it's prime
        if (n % divisor == 0) return false; // Found a divisor, so it's composite
        return isPrime(n, divisor + 1); // Check the next divisor
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read input number

        long startTime = System.nanoTime(); // Start measuring execution time
        boolean result = isPrime(n, 2);
        long endTime = System.nanoTime(); // End measuring execution time

        System.out.println(result ? "Prime" : "Composite"); // Print result
        System.out.println("Execution Time: " + (endTime - startTime) / 1_000_000.0 + " ms"); // Convert nanoseconds to milliseconds

        scanner.close(); // Close the scanner
    }
}