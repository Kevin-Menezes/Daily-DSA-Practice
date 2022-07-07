import java.util.Scanner;
import java.util.*;

public class UnionOfTwoArrays {

    static int hashSetUnion(ArrayList<Integer> a, ArrayList<Integer> b) {

        Set<Integer> set = new HashSet<>();
        for (int x : a) {
            set.add(x);
        }

        for (int y : b) {
            set.add(y);
        }
        return set.size();
    }

    // Brute force without using inbuilt Class Set
    // static ArrayList<Integer> arrayUnion(ArrayList<Integer> a, ArrayList<Integer> b) {
        
    //     ArrayList<Integer> c = new ArrayList<>();

    //     c.addAll(a);
    //     c.addAll(b);

    //     for (int i = 0; i < c.size(); i++) {

    //         for (int j = 0; j < i; j++) {

    //             if (c.get(i) == c.get(j)) {

    //                 c.remove(i);
    //             }
    //         }
    //     }
    //     return c;

    // }

    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        System.out.println("Enter the elements of the 1st array : "); // We don't know the size of the ArrayList. That's why we use while loop
        while (s.hasNextInt()) {

            if (s.nextInt() == 0) {
                break;
            }
            a.add(s.nextInt());        
        }

        System.out.println("Enter the elements of the 2nd array : ");
        while (s.hasNextInt()) {

            if (s.nextInt() == 0) {
                break;
            }
            b.add(s.nextInt());
        }

        //System.out.println("The union of both the arrays are : " + arrayUnion(a, b));
        
        System.out.println("The union of both the arrays are : " + hashSetUnion(a, b));
    }
    
}
