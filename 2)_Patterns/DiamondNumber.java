// 1 2 3 4 5 
//  2 3 4 5 
//   3 4 5 
//    4 5 
//     5 
//    4 5 
//   3 4 5 
//  2 3 4 5 
// 1 2 3 4 5
import java.util.Scanner;
public class DiamondNumber {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = s.nextInt();  

        // Top triangle
        for (int i = n; i >= 1; i--) {
            
            // Top space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Top numbers
            for (int j = (n - i) + 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        
        }

        // Bottom triangle
        for (int i = 2; i <= n; i++) {

            // Bottom space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Bottom numbers
            for (int j = (n - i) + 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    
}
