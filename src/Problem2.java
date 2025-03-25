import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); // Size of the array
        int[] arr = new int[N];

        // Reads array elements
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        long startTime = System.nanoTime(); // Start measuring execution time
        double avg = average(arr, N);
        long endTime = System.nanoTime(); // End measuring execution time

        System.out.println(avg); // Print the average value
        System.out.println("Execution Time: " + (endTime - startTime) / 1_000_000.0 + " ms"); // Convert nanoseconds to milliseconds

    }
    /**
     * This method calculates the sum of an array using recursion.
     * Time complexity: O(n), where n is the number of elements.
     * The function calls itself n times, reducing the problem size by 1 each time.
     *
     * @param arr The array of integers.
     * @param N The number of elements to consider.
     * @return The sum of the first n elements in the array.
     */
    public static int sum(int [] arr, int N){
        if (N == 0) // Base case
            return 0;
        return arr[N - 1] + sum(arr, N - 1); // Add last element to the sum of previous elements
    }
    /**
     * This method calculates the average of an array.
     * @param arr The array of integers.
     * @param N The number of elements in the array.
     * @return The average of the array elements.
     */
    public static double average(int [] arr, int N){
        return (double) sum(arr, N) / N;// Compute the average
    }

}