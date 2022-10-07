// THE REQUIRED SUM WILL BE GIVEN BY THE USER

// WE HAVE TO SEARCH THROUGH THE SUBARRAY WHICH PART OF IT EQUALS THE SUM GIVEN BY THE USER

// WE HAVE TO OUTPUT THE START AND END INDEX OF THE SELECTED SUB ARRAY

// EG: SUM GIVEN BY THE USER = 7, ARRAY GIVEN BY USER = [1,7,2,3,2,6]

// THE OUTPUT WILL BE 2 2 (start index and end index of 2,3,2)

import java.util.Scanner;

public class SumFromSubarray {

    static void sfs(int[] a,int s){

        int i = 0, j = 0,st=-1,en=-1,sum=0;
        int n = a.length;

        // Starting from the 1st number
        while (i < n && sum + a[i] <= s) {
            sum += a[i];
            i++;
        }

        // If its equal to the s
        if (sum == s) {
            System.out.println("Start : 1 End : " + i);
            return;
        }

        while (i < n) {

            sum += a[i]; // This crosses the s

            while (sum > s) {
                sum -= a[j]; // Subtracting numbers from start
                j++;
            }

            if (sum == s) {
                st = j + 1;
                en = i + 1;
                break;
            }
            i++;
        }
        System.out.println("Start : " + st);
        System.out.println("End : " + en);

    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the limit : ");
        int n = s.nextInt();

        int array[] = new int[n]; // An array has a fixed size

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        System.out.print("Enter the sum : ");
        int sum = s.nextInt();

        sfs(array, sum);
            
        

    }
}
