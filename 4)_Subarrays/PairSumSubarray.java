// THIS IS SIMILAR TO BINARY SEARCH

// TWO NUMBERS KA SUM SHOULD BE EQUAL TO THE GIVEN SUM

// TIME COMPLEXITY = O(n)

// IF THE REQUIRED SUM IS SMALLER THAN THE SUM WE GET....THEN WE DECREMENT HIGH...TO GET A SMALLER SUM

// IF THE REQUIRED SUM IS LARGER THAN THE SUM WE GET.....THEN WE INCREMENT LOW.....TO GET A LARGER SUM

// THIS ONLY WORKS WHEN THE ARRAY IS SORTED

// SO WE HAVE TO SORT IT

import java.util.Scanner;

public class PairSumSubarray {

    static boolean pairSum(int[] a, int k) {

        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            if ((a[start] + a[end]) == k) {
                System.out.println("Pair found at " + start + " and " + end + " positions!");
                return true;
            } else if ((a[start] + a[end]) < k) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }

    // We need to sort the array for this program to work
    static int[] sortArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int n = s.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.print("Enter the pair value : ");
        int key = s.nextInt();

        int[] arr = sortArray(a);

        if (pairSum(arr, key)) {

        }
        else {
            System.out.println("Pair not found!");
        }

    }
    
}
