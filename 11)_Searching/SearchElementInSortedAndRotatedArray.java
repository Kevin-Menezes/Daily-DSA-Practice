import java.util.Scanner;

public class SearchElementInSortedAndRotatedArray {

    static int binarySearchModified(int a[], int key) {
        
        int low = 0;
        int high = a.length - 1;

        int mid = (low + high) / 2;

        while (low <= high) {

            if (a[mid] == key) { // Till here do normal binary search
                return mid;
            }

            if (a[low] < a[mid]) { // Checking if the left part is sorted 

                if (key >= a[low] && key < a[mid]) { // Searching for the key in the left part
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else { // Checking if the right part is sorted

                if (key > a[mid] && key <= a[high]) { // Searching for the key in the right part
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
            
            mid = (low + high) / 2;
        }
        return mid;
  
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

        System.out.print("Enter the element to be found out : ");
        int k = s.nextInt();

        int pos = binarySearchModified(array, k);

        System.out.println(k+" was found at "+(pos+1)+" position!");
    }
    
}
