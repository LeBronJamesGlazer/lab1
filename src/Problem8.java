import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        boolean result = isDigit( s , 0 );
        long startTime = System.nanoTime(); // Start measuring execution time
        long endTime = System.nanoTime(); // End measuring execution time

        System.out.println( result ? "true" : "false" );
        System.out.println("Execution time: " + (endTime - startTime) / 1_000_000.0 + " ms");

    }

    public static boolean isDigit (String s, int index) {
        /**
         * Recursively checks if all characters in a string are digits.
         * Time complexity o(n)
         *
         * @param s The input string to check.
         * @param index The current character index being checked.
         * @return true if all characters are digits, false otherwise.
         */
        if (s.length() == index) { //Base case: If we checked all characters, return true
            return true;
        }
        if (!Character.isDigit(s.charAt(index))) { // If current character is not a digit, return fals
            return false;
        }
        return isDigit(s, index + 1); // Recursive call to check next character
    }
}