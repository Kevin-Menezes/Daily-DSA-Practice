import java.util.Scanner;

public class TwoMirrorTriangles 
{
    public void printTwoTriangles(int a) 
    {
        // For the top triangle
        for (int i = 1; i <= a; i++) 
        {
            // For the start space
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }

            // For the odd number of *
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // For the bottom triangle
        for (int i = a; i >= 1; i--) 
        {
            // For the start space
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }

            // For the odd number of *
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int a = s.nextInt();
        TwoMirrorTriangles t = new TwoMirrorTriangles();
        t.printTwoTriangles(a);

    }
}