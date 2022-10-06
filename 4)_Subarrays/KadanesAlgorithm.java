// Take limiit
// Take array
// Check maxiumum sum in each iteration

import java.util.Scanner;

public class KadanesAlgorithm {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit of array : ");
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + " : ");
            arr[i] = s.nextInt();
        }

        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            currsum = currsum + arr[i];
            maxsum = Math.max(currsum, maxsum);

            System.out.println(maxsum);

            if (currsum < 0) {
                currsum = 0;
            }
        }

        System.out.println("Max sum is " + maxsum);

    }
    
}
