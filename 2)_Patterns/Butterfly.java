import java.util.Scanner;

public class Butterfly {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int rows = s.nextInt();

        // Top part
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            // Middle space
            for (int j = 1; j <= 2*rows - 2 * i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println(" ");

        }

        // Bottom part
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            // Middle space
            for (int j = 1; j <= 2*rows - 2 * i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println(" ");

        }
    }

}
