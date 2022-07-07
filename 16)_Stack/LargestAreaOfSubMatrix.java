// Note : We push the element's indexes in the stack and not the element's value

import java.util.Scanner;
import java.util.Stack;

public class LargestAreaOfSubMatrix {

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
            s.push(i); // If it is greater then push the index onto the stack
        }
        return ns;
    }

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
            s.push(i); // If it is smaller then push the index onto the stack
        }
        return ps;
    }

    // Function to get the maximum histogram area
    static int maxHistogram(int a[]) {

        int maxAns = 0;

        int ps[] = prevSmaller(a);
        int ns[] = nextSmaller(a);

        for (int i = 0; i < a.length; i++) {

            int curr = (ns[i] - ps[i] - 1) * a[i];
            maxAns = Math.max(maxAns, curr);
        }
        return maxAns;
    }

    // Function to get the largest area of the binary sub matrix
    static int largestArea(int a[][]) {
        
        int curRow[] = a[0]; // Putting the first row in curRow

        int maxAns = maxHistogram(curRow); // Doing the previous program on this first row

        for (int i = 1; i < a.length; i++) { // We start the loop from the next row

            for (int j = 0; j < a[0].length; j++) { // Iterating through the columns

                if (a[i][j] == 1)
                    curRow[j] += 1;
                else
                    curRow[j] = 0; // Reset to 0    
            }

            int curAns = maxHistogram(curRow); // Finding the maximum area when the rows combine 1 by 1
            maxAns = Math.max(maxAns, curAns);
        }
        
        return maxAns;
    
    }

    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the limit of rows : ");
        int r = s.nextInt();

        System.out.print("Enter the limit of columns : ");
        int c = s.nextInt();

        int a[][] = new int[r][c];

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Largest area in binary sub matrix with all 1's is " + largestArea(a));
    }

    
    
}
