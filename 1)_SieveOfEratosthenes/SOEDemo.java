
// 20
// Boolean array = true
// Traverse from 2 to Math.sqrt(20)
// Move in multiples 
// Which is divisible put false

import java.util.Arrays;
import java.util.Scanner;

public class SOEDemo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter limit : ");
        int n = s.nextInt();

        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);
        arr[0] = false;
        arr[1] = false;


        for (int i = 2; i <= Math.sqrt(n); i++) {

            for (int j = 2 * i; j <= n; j += i) { // 4..6 | 6..9 | 4..8..12..16

                arr[j] = false;
            }
        }
        
        for (int i = 0; i <= n; i++) {
            if (arr[i] == true) {
                System.out.print(i+" ");
            }
        }

        
    }
    
}
