import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        long startTime = System.nanoTime(); // Start measuring execution time
        int result = fibonacci(number);
        long endTime = System.nanoTime(); // End measuring execution time

        System.out.println( number + "th number in Fibonacci sequence is " + result);
        System.out.println("Execution time: " + (endTime - startTime) / 1_000_000.0 + " ms");

    }

    public static int fibonacci(int n) {
        /**
         * This method calculates the Fibonacci number at position n using recursion.
         * Time Complexity: O(2^n), since each function call branches into two new calls.
         * This approach is inefficient for large values of n due to repeated calculations.
         *
         * @param n The position in the Fibonacci sequence.
         * @return The Fibonacci number at position n.
         */
        if (n == 1 || n == 0) { // Base cases: Fibonacci(0) = 0, Fibonacci(1) = 1
            return n;
        }
        return fibonacci(n - 1) + fibonacci( n - 2); // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
    }
}