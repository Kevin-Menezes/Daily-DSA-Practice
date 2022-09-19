import java.util.Scanner;
public class MatrixMul 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of rows in 1st Matrix : ");
        int row1 = s.nextInt();

        System.out.print("Enter the number of columns in 1st Matrix and rows in 2nd Matrix : ");
        int colrow = s.nextInt();

        System.out.print("Enter the number of columns in 2nd Matrix : ");
        int col2 = s.nextInt();

        int m1[][] = new int[row1][colrow];
        int m2[][] = new int[colrow][col2];
        int mul[][] = new int[row1][col2];

        System.out.println("Enter the values for the 1st Matrix : ");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<colrow;j++)
            {
                m1[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter the values for the 2nd Matrix : ");
        for(int i=0;i<colrow;i++)
        {
            for(int j=0;j<col2;j++)
            {
                m2[i][j] = s.nextInt();
            }
        }

        // Making the multiply array first 0
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                mul[i][j] = 0;
            }
        }

        // Multiplied array O(n3)
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                for(int k=0;k<colrow;k++)
                {
                    mul[i][j] += m1[i][k]*m2[k][j];
                }
            }
        }

        // Printing the multiplied array
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println(" ");
        }


    }
    
}
