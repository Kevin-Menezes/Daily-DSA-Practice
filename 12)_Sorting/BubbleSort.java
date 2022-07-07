import java.util.Scanner;

public class BubbleSort {

    static void swap(int a[],int j,int k){

        int temp = a[j];
        a[j] = a[k];
        a[k] = temp;
    }
    
    static int[] bubbleSort(int a[]) {
        
        int n = a.length;
        boolean swapped;

        for (int i = 1; i <= n; i++) {

            swapped = false;

            for (int j = i; j <= n - i; j++) { // we take till n-i coz the biggest element gets bubbled to the end after every iteration
                if (a[j-1] > a[j]) {
                    swapped = true;
                    swap(a, j, j - 1);
                }
            }
            
            if (swapped==false) { // This means the array is sorted
                return a;
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
        int sa[] = bubbleSort(array);

        // Print the sorted array
        System.out.print("The sorted array : ");
        for (int i = 0; i < n;i++) {
            System.out.print(sa[i]);
        }
        
    }
}
