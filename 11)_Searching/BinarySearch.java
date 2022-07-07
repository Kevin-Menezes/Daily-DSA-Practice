// The array should be sorted

import java.util.Scanner;

public class BinarySearch {

    public static void binarySearch(int a[], int k) {

        int start = 0;
        int end = a.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {

            // Check if the key is at the middle position
            if (a[mid] == k) {
                System.out.println(k + " is found at " + (mid + 1) + " position");
                return;
            }
            else if (a[mid] > k) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

            mid = (start + end) / 2;
        }
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the limit of the array : ");
        int n = s.nextInt();

        int array[] = new int[n]; // An array has a fixed size

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        System.out.print("Enter the element to be found out : ");
        int k = s.nextInt();

        binarySearch(array, k);

    }
    
}
