import java.util.Scanner;

public class Problem7 {
    public static void reversOrder(int N , Scanner input) {
        /**
         * Recursively reads and prints numbers in reverse order.
         * It reads an integer, calls itself for the next number,
         * and prints only when returning from recursion.
         *
         * Time Complexity: O(n) (each number is processed once)
         * Space Complexity: O(n) (due to recursion call stack)
         *
         * @param n Number of elements to read
         * @param input Scanner object for reading input
         */
        if (N == 0) {
            return;
        }
        int n = input.nextInt();
        reversOrder(N - 1, input); // Recursive call before printing (stores numbers in call stack)
        System.out.print(n + " "); // Print numbers after recursion unwinds (reversing order)
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        reversOrder(N , input);

        long startTime = System.nanoTime(); // Start measuring execution time
        long endTime = System.nanoTime(); // End measuring execution time
        System.out.println("Execution time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        input.close();

    }
}