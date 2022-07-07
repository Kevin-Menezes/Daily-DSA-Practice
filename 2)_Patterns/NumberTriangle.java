import java.util.Scanner;
public class NumberTriangle 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int rows = s.nextInt();

        for(int i=1;i<=rows;i++)
        {
            // Starting space
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }


            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");

            }

            System.out.println(" ");
        }
    }
    
}
