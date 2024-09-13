import java.util.Scanner;

/**
 * Pettern
 */
public class Pettern {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows (odd number): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        int midRow = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < midRow) {
                    if (j == 0 || j == i || j == midRow || j == n - 1 || j == n - i - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else if (i == midRow) {
                    if (j == 0 || j == midRow || j == n - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (j == 0 || j == midRow || j == n - 1 || j == i || j == n - i - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}