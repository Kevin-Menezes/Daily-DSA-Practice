import java.util.Scanner;
import java.util.*;
import java.util.stream.IntStream;

public class IntersectionOfTwoSets {

    // Normal method
    // static int intersectSet(int a[], int b[]) {
        
    //     Set<Integer> set = new HashSet<>();
    //     int count = 0;

    //     for (int x : a) {
    //         set.add(x);
    //     }
        
    //     for (int x : b) {
    //         if (set.contains(x)) {
    //             count++;
    //             set.remove(x);
    //         }
    //     }

    //     return count;   
    // }


//---------------------------------------------------------------------------------
    // Brute force without using inbuilt Class Set
    static int[] removeElement(int a[], int index) { // Arrays do not have inbuilt remove() function , that's y i had to create one using Streams

        if (a == null
                || index < 0
                || index >= a.length) {

            return a;
        }

        return IntStream.range(0, a.length)
                .filter(i -> i != index)
                .map(i -> a[i])
                .toArray();
    }

    // Brute force
    static int intersectionArray(int a[], int b[]) {

        // int c = 0;
        
        // for (int i = 0; i < a.length; i++) {

        //     for (int j = 0; j < b.length; j++) {

        //         if (a[i] == b[j]) {
        //             c++;
        //             removeElement(a, i);
        //             removeElement(b, j);
        //             System.out.println(a[i]+"   "+b[j]);
        //         }
        //     }
        // }
        // return c;

        int c = 0;
        int i = 0;
        int j = 0;
        boolean f = false;

        for (; i < a.length; i++) {

            for (; j < b.length; j++) {

                if (a[i] == b[j]) { // We take 1 element of 1st loop and check with all the elements of the 2nd loop
                    c++;
                    f = true;
                    break;
                }
            }
            if (f) {
                break;
            }
        }

        // Base condition
        if (i == a.length) {
            return 0;
        }

        return c + intersectionArray(removeElement(a, i), removeElement(b, j)); // We recursively return the arrays that excludes the intersected elements
    }

    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the limit of the array : ");
        int n = s.nextInt();

        int array1[] = new int[n]; // An array has a fixed size
        int array2[] = new int[n]; // An array has a fixed size

        System.out.println("Enter the elements of the array1 : ");
        for (int i = 0; i < n; i++) {
            array1[i] = s.nextInt();
        }

        System.out.println("Enter the elements of the array2 : ");
        for (int i = 0; i < n; i++) {
            array2[i] = s.nextInt();
        }

        System.out.println("Intersection is "+intersectionArray(array1,array2));

    }
    
}
