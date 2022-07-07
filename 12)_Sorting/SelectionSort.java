import java.util.Scanner;

public class SelectionSort {

    static void swap(int a[], int j, int k) {

        int temp = a[j];
        a[j] = a[k];
        a[k] = temp;
    }

    static int[] selectionSort(int a[]) {

        int n = a.length;
        
        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {

                if (a[j] < a[min]) {

                    min = j;
                }
            }

            if (min != i) {

                swap(a, min, i);
            }

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
        int sa[] = selectionSort(array);

        // Print the sorted array
        System.out.print("The sorted array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(sa[i]);
        }
    }
    
}
