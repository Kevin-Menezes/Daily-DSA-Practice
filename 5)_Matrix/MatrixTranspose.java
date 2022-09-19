import java.util.Scanner;
public class MatrixTranspose 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of rows in Matrix : ");
        int row = s.nextInt();

        System.out.print("Enter the number of columns in Matrix : ");
        int col = s.nextInt();

        int m[][] = new int[row][col];
        int trans[][] = new int[row][col];

        // Entering values in the matrix
        System.out.println("Enter the values for the Matrix : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                m[i][j] = s.nextInt();
            }
        }

        // Transposing the matrix
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                trans[j][i] = m[i][j];
            }
        }

        // Printing the transposed matrix
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(trans[i][j]+" ");

            }
            System.out.println(" ");
        }

    }
    
}
