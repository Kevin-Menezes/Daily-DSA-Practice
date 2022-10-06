// Take limit ~
// Input elements inside array ~
// Take key ~
// Sort the array
// Create function ~
// Make start and end ~
// Calculate mid ~
// Traverse till start doesnt cross over end ~
// If mid is key return ~

import java.util.Scanner;

public class BSearch {

    static boolean binSearch(int[] a, int k) {

        int start = 0;
        int end = a.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (a[mid] == k) {
                return true;

            } else if (k < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
    
    // Sorting the array coz binary search works only on sorted arrays
    static int[] sortArray(int[] a) {
        
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
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

        int[] arr = new int[n]; // Array has fixed size

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element no. "+i+" : ");
            arr[i] = s.nextInt();
        }

        System.out.print("Enter the element you want to find : ");
        int key = s.nextInt();

        int[] a = sortArray(arr);

        if (binSearch(a, key)) {
            System.out.print(key + " was found");
        }
        else {
            System.out.println(key+" not found");
        }

    }
    
}
