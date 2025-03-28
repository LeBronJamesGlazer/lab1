import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        long startTime = System.nanoTime(); // Start measuring execution time
        int result = GCD(a, b);
        long endTime = System.nanoTime(); // End measuring execution time

        System.out.println(result);
        System.out.println("Execution time: " + (endTime - startTime) / 1_000_000.0 + " ms");


    }
    public static int GCD(int a, int b) {
        /**
         * Recursively calculates the Greatest Common Divisor (GCD) using Euclidean Algorithm.
         * Formula: GCD(a, b) = GCD(b, a % b)
         * Base Case: If b == 0, return a.
         * Time Complexity
         O(\log(\min(a, b)))

         *
         * @param a First number
         * @param b Second number
         * @return Greatest Common Divisor (GCD) of a and b
         */
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}