import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        long startTime = System.nanoTime(); // Start measuring execution time
        int result = binominalCoefficient(n, k); // Compute C(n, k)
        long endTime = System.nanoTime(); // End measuring execution time

        System.out.println(result);
        System.out.println("Execution time: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }

    public static int binominalCoefficient(int n, int k) {
        /**
         * Recursively calculates the binomial coefficient C(n, k).
         * It follows the formula: C(n, k) = C(n-1, k-1) + C(n-1, k).
         * Base cases: C(n, 0) = C(n, n) = 1.
         *
         * Time Complexity: O(2ⁿ) (exponential growth due to recursive branching)
         * Space Complexity: O(n) (recursion depth)
         *
         * @param n The total number of elements.
         * @param k The number of elements to choose.
         * @return The binomial coefficient C(n, k).
         */
        if (n == k || k == 0) { // Base case: C(n, 0) = C(n, n) = 1
            return 1;
        }
        return binominalCoefficient(n - 1, k - 1) + binominalCoefficient(n - 1, k);
    }
}