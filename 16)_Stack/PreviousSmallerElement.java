// We have to find the previous smaller elements of each element of the array while traversing it

import java.util.Scanner;
import java.util.Stack;

public class PreviousSmallerElement {

    static void previousSmaller(int a[]) {
        
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < a.length; i++) {
            
            while (!s.isEmpty() && s.peek() >= a[i]) { // If the stack is not empty and the previous elements in the stack are greater than the one in the array, then we remove them from the stack 
                s.pop();
            }
            
            if(s.isEmpty())
                System.out.print("-1 "); // if the stack is empty we print -1
            else
                System.out.print(s.peek()+" "); // if the previous element is smaller then we print that

            s.push(a[i]);
        }
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
        previousSmaller(a); // Putting the array as argument
    }
    
}
