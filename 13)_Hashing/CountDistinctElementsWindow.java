import java.util.HashMap;
import java.util.Scanner;

public class CountDistinctElementsWindow {

    static void countDistinct(int a[], int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) { // Traversing through the 1st window and putting elements inside the map

            map.put(a[i], map.getOrDefault(a[i], 0) + 1); // Default means that if that value is not in the map then it will put its value as 0.... key=2, value=0 + 1
        }
        System.out.println(map.size());

        // We start from the next window
        for (int i = k; i < a.length; i++) { 

            if (map.get(a[i - k]) == 1) { // If within that window there is a duplicate that has value 1, then remove it
                map.remove(a[i - k]);
            }
            else { // If a duplicate has value more than 1, then -1 from it
                map.put(a[i - k], map.get(a[i - k]) - 1);
            }

            map.put(a[i], map.getOrDefault(a[i], 0) + 1); // Putting the next element of the next window
            System.out.println(map.size());

        }

    
        // HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
  
        // // Traverse the first window and store count
        // // of every element in hash map
        // for (int i = 0; i < k; i++)
        //     hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);
  
        // // Print count of first window
        // System.out.println(hM.size());
  
        // // Traverse through the remaining array
        // for (int i = k; i < arr.length; i++) {

        //     // Remove first element of previous window
        //     // If there was only one occurrence
        //     if (hM.get(arr[i - k]) == 1) {
        //         hM.remove(arr[i - k]);
        //     }

        //     else // reduce count of the removed element
        //         hM.put(arr[i - k], hM.get(arr[i - k]) - 1);

        //     // Add new element of current window
        //     // If this element appears first time,
        //     // set its count as 1,
        //     hM.put(arr[i], hM.getOrDefault(arr[i], 0) + 1);

        //     // Print count of current window
        //     System.out.println(hM.size());

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

        System.out.print("Enter the window size : ");
        int w = s.nextInt();

        countDistinct(array, w);

    }
    
}
