import java.util.Scanner;

public class InsertionSort {

    static int[] insertionSort(int a[]) {

        int n = a.length;

        for (int i = 1; i < n; i++) { // We start from the 2nd element coz the 1st element forms the sorted array
            
            int temp = a[i]; // Putting the element of the unsorted array in temp and checking with the sorted array one by one
            int j = i - 1;

            while (j >= 0 && a[j] > temp) { // Loop from the element just before the unsorted array to the start of the sorted array

                a[j + 1] = a[j]; // Move that element 1 step further
                j--;

            }

            // When the loop stops we insert the unsorted element in the sorted array in its proper positionn
            a[j + 1] = temp;
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
        int sa[] = insertionSort(array);

        // Print the sorted array
        System.out.print("The sorted array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(sa[i]);
        }
    }
    
}
