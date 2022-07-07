import java.util.Scanner;

public class PalindromeTriangle 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int rows = s.nextInt();

        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }

            // left to middle
            int k = i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k--);
            }

            // middle to right
            int t = 2;
            for(int j=2;j<=i;j++)
            {
                System.out.print(t++);
            }

            System.out.println(" ");
        }
    }
    
}
