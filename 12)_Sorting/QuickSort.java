import java.util.Scanner;

public class QuickSort {

    static void swap(int a[], int j, int k) {

        int temp = a[j];
        a[j] = a[k];
        a[k] = temp;
    }

    // This method only sorts the pivot in its proper place....it doesn't sort other elements....but it places smaller ones ahead and larger ones after the pivot
    static int partition(int a[], int l, int h) {

        int pivot = a[l]; // The first element is the pivot

        int i = l; // 1st element in the array (low)
        int j = h; // Last element in the array (high)

        while (i <= j) {

            while (pivot >= a[i] && i < h) { // Imagine u are the pivot. You have to arrange children heightwise. Shorter ones before you. Taller ones behind you
                i++;
            }

            while (pivot <= a[j] && j > l) {
                j--;
            }

            if (i < j) {
                swap(a, i, j);
            }
        }

        if (j != l) {
            swap(a, j, l); // When j<i we swap the pivot with j....so that the pivot comes in the middle
        }

        return j; // Returns the pivot

    }
    
    // This method goes on recursively
    static int[] quickSort(int a[], int l, int h) {
        
        if (l < h) {
            int pivot = partition(a, l, h);
            quickSort(a, l, pivot - 1); // For sorting the left half
            quickSort(a, pivot + 1, h); // For sorting the right half
        }
        return a;
    }

    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the limit of the array : ");
        int n = s.nextInt();

        int array[] = new int[n]; // An array has a fixed size

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        // Get the sorted array
        int sa[] = quickSort(array,0,n-1);

        // Print the sorted array
        System.out.print("The sorted array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(sa[i]);
        }
    }
    
}
