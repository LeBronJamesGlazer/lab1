import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int power = input.nextInt();

        long startTime = System.nanoTime(); // Start measuring execution time
        double result = power(base, power);
        long endTime = System.nanoTime(); // End measuring execution time

        System.out.println(base + "^" + power + " = " + result);
        System.out.println("Execution time: " + (endTime - startTime) / 1_000_000.0 + " ms");

    }
    public static double power(int base, int power) {
        /**
         * This method calculates the power of a number using recursion.
         * Time Complexity: O(n), where n is the exponent.
         * The function calls itself n times, reducing the exponent by 1 each time.
         *
         * @param base The base number.
         * @param power The exponent (must be a non-negative integer).
         * @return The result of base raised to the given power.
         */
        if (power == 0) {
            return 1; // Base case: any number raised to the power of 0 is 1
        }
        if (power < 0) // If exponent is negative, compute positive power and take reciprocal
            return 1.0 /power(base, -power);

        return base * power(base, power - 1); // Recursive case: base^power = base * base^(power-1)
    }
}