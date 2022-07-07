import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class CountDistinctElements {

    // Using Hash Set Collection
    static int countDistinctHashSet(int a[]) {

        Set<Integer> set = new HashSet<>();

        for (int e : a) {
            set.add(e);
        }
        return set.size();

    }

    // Brute force method without using inbuilt Class Set
    // static int countDistinct(int a[]) {

    //     int c = 0;
    //     boolean f;
        
    //     for (int k = 0; k < a.length; k++) {

    //         f = true;

    //         for (int l = 0; l < k; l++) {

    //             if (a[k] == a[l]) {
    //                 f = false;
    //                 break;
    //             }
    //         }
    //         if (f == true) {
    //             c++;
    //         }
        
    //     }
    //     return c;
    // }

    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the limit of the array : ");
        int n = s.nextInt();

        int array[] = new int[n]; // An array has a fixed size

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        //System.out.println(countDistinct(array) + " distinct numbers are present in the array.");
    
        System.out.println(countDistinctHashSet(array) + " distinct numbers are present in the array.");
    
    }
    
}
