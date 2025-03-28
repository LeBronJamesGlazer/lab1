import java.util.Scanner;

public class Problem1 {

    /**
     * This method finds the minimum element in an array using recursion.
     * Time complexity: O(n), where n is the number of elements.
     * The function calls itself n times, reducing the problem size by 1 each time.
     *
     * @param arr The array of integers.
     * @param n The number of elements to consider.
     * @return The minimum value in the array.
     */
    public static int Min(int[] arr, int n) {
        if (n == 1) // Base case: if only one element is left, return it
            return arr[0];
        return Math.min(arr[n - 1], Min(arr, n - 1)); // Compare last element with recursive result
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the size of the array
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        long startTime = System.nanoTime(); // Start measuring execution time
        int minValue = Min(arr, n);
        long endTime = System.nanoTime(); // End measuring execution time

        System.out.println("Minimum Value is: " + minValue); // Print the minimum value
        System.out.println("Execution Time: " + (endTime - startTime) / 1_000_000.0 + " ms"); // Convert nanoseconds to milliseconds

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}


