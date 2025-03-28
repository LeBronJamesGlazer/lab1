import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // Read an integer from input


        long startTime = System.nanoTime(); // Start measuring execution time
        int result = factorial(n);
        long endTime = System.nanoTime(); // End measuring execution time

        System.out.println("Factorial of " + n + " is " + result);
        System.out.println("Execution time: " + (endTime - startTime) / 1_000_000.0 + " ms");

    }
    public static int factorial(int n) {
        /**
         * This method calculates the factorial of a number using recursion.
         * Time Complexity: O(n), where n is the input number.
         * The function calls itself n times, reducing the number by 1 each time.
         *
         * @param n The number to calculate factorial for.
         * @return The factorial of n.
         */
        if(n == 1) // Base case: factorial of 1 is 1
            return 1;
        return n * factorial(n-1); // Recursive case: n * factorial(n-1)
    }
}