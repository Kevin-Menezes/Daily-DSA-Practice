// Note : The indexes goes in the stack

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangularAreaInHistogram {

    // Function to find previous smaller element
    static int[] prevSmaller(int a[]) {

        int ps[] = new int[a.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < a.length; i++) {

            while (!s.isEmpty() && a[s.peek()] >= a[i]) { // Remove the element from stack if it is greater
                s.pop();
            }

            if (s.isEmpty()) {
                ps[i] = -1;
            } else {
                ps[i] = s.peek();
            }
            s.push(i); // If it is smaller then push the index value onto the stack
        }
        return ps;
    }
    
    // Function to find smaller element from right to left
    static int[] nextSmaller(int a[]) {

        int ns[] = new int[a.length];
        Stack<Integer> s = new Stack<>();

        for (int i = a.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && a[s.peek()] >= a[i]) { // Remove the element from stack if it is smaller
                s.pop();
            }

            if (s.isEmpty()) {
                ns[i] = a.length;
            } else {
                ns[i] = s.peek();
            }
            s.push(i); // If it is greater then push the index value onto the stack
        }
        return ns;
    }

    // Function to get the maximum area
    static int maxArea(int a[]) {

        int maxAns = 0;

        int ps[] = prevSmaller(a);
        int ns[] = nextSmaller(a);
        
        for (int i = 0; i < a.length; i++) {

            int curr = (ns[i] - ps[i] - 1) * a[i];
            maxAns = Math.max(maxAns, curr);
        }
        return maxAns;
    }

    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the limit of the array : ");
        int n = s.nextInt();

        int a[] = new int[n];
        int k = 1;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + k + " : ");
            a[i] = s.nextInt();
            k++;
        }
        System.out.println("Largest area in Histogram is "+maxArea(a));

    }
    
}
