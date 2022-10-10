import java.util.Scanner;

public class MatrixSearch {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = s.nextInt();
        System.out.print("Enter columns : ");
        int cols = s.nextInt();

        int[][] arr = new int[rows][cols]; // Creating a 2d array

        System.out.println("Enter elements in the 2d array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        System.out.print("Enter the element to be searched : ");
        int k = s.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == k) {
                    System.out.println("Element found!");
                }

            }
        }
        
    }
    
}
