import java.util.Scanner;

public class MergeSort {

    static int[] mergeSort(int a[], int l, int r) {

        if (l < r) {

            int mid = (l + r) / 2;
            mergeSort(a, l, mid); // Left part
            mergeSort(a, mid + 1, r); // Right part
            merge(a, mid, l, r); // Merges and sorts it
        }

        return a;
    }
    
    static void merge(int a[], int mid, int l, int r) {
        
        int i = l; // Starts from left to mid
        int j = mid + 1; // Starts from mid to right
        int k = l;
        int b[] = new int[a.length]; // This will be the sorted array

        while (i <= mid && j <= r) {

            if (a[i] < a[j]) { // Dividing the array in 2 halfs and comparing

                b[k] = a[i]; // Putting the element in b array
                i++;
            } else {

                b[k] = a[j];
                j++;
            }
            k++; // Going to the next position in b array
        }
        
        // If u finish traversing the 1st array, then directly insert the 2nd array in the b array....(coz 2nd array will already be sorted)
        if (i > mid) {
            while (j <= r) {
                b[k] = a[j];
                k++;
                j++;
            }
        }
        else {
            while (i <= mid) { // Traversing the 1st array if the 2nd array is already finished
                b[k] = a[i];
                k++;
                i++;
            }
        }

        // Putting b array into a array
        for (k = l; k <= r; k++) {
            a[k] = b[k];
        }

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
        int sa[] = mergeSort(array,0,n-1);

        // Print the sorted array
        System.out.print("The sorted array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(sa[i]);
        }
    }
    
}
