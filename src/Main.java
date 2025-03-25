import java.util.Scanner;

public class Main {

    public static int Min(int[] arr, int n) {
        if(n == 1)
            return arr[0];
        return Math.min(arr[n-1], Min(arr, n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(Min(arr, n));
    }
}