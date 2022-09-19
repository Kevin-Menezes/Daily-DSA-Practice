// 2. Print a pattern of numbers from 1 to n as shown below. Each of the numbers is separated by a single space.

// 4 4 4 4 4 4 4  
// 4 3 3 3 3 3 4   
// 4 3 2 2 2 3 4   
// 4 3 2 1 2 3 4   
// 4 3 2 2 2 3 4   
// 4 3 3 3 3 3 4   
// 4 4 4 4 4 4 4   

// Input Format

// The input will contain a single integer .

// Constraints
// 1 <= n <= 1000

// Sample Input: 2
// Sample Output:

// 2 2 2 // 3
// 2 1 2 // 
// 2 2 2

// Sample Input: 5
// Sample Output:
// 5 5 5 5 5 5 5 5 5  // 0,0
// 5 4 4 4 4 4 4 4 5  // 1,1
// 5 4 3 3 3 3 3 4 5  // 2,2
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 2 1 2 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 4 4 4 4 4 4 5 
// 5 5 5 5 5 5 5 5 5

 
//  3 3 3 3 3  
//  3 2 2 2 3    
//  3 2 1 2 3    
//  3 2 2 2 3    
//  3 3 3 3 3   

import java.util.Scanner;

public class PrintNumbers {

    static void printNumbers(int arr[][], int n, int k) {
        
        for (int i = k; i < 2 * n - (1 + k); i++) {

            for (int j = k; j < 2 * n - ( 1 + k ); j++) {

                arr[i][j] = n - k; // Inserting numbers in the array

            }
        }  
    }

    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = s.nextInt();
        int k = 0;

        int arr[][] = new int[2 * n-1][2 * n-1];  // Creating array
        
        for (int x = 0; x < n; x++) {
            
            printNumbers(arr, n, k++);
        }
        
        // Printing the array
        for (int i = 0; i < 2 * n - 1; i++) {

            for (int j = 0; j < 2 * n - 1; j++) {

                System.out.print(arr[i][j]+" ");

            }
            System.out.println("");

        } 

    }
    
}
