import java.util.Scanner;

public class SearchingInAnInfinitelySortedArray {

    static void searchInfinite(int a[], int k) {

        int low = 0;
        int high = 1;

        while (a[high] < k) { // We search in multiples of 2 exponentially till the high is less than k

            low = high;

            if (high * 2 < a.length - 1) { // To check that it does not exceed the array's limit
                high = high * 2;
            }
            else{
                high = a.length - 1; // If it exceeds , we consider the last element as high
            }
            
        }

        binarySearch(a, low, high, k); // When high becomes greater than k.... we perform normal binary search from low to high
    }
    
    static void binarySearch(int a[], int start, int end, int k) {
        
        int mid = (start + end) / 2;

        while (start <= end) {

            // Check if the key is at the middle position
            if (a[mid] == k) {
                System.out.println(k + " is found at " + (mid + 1) + " position");
                return;
            } else if (a[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            mid = (start + end) / 2;
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

        System.out.print("Enter the element to be found out : ");
        int k = s.nextInt();

        searchInfinite(array, k);
    }


    
}
