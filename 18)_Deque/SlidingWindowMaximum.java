import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SlidingWindowMaximum {

    static void printMax(int arr[], int n, int k) { // k is the window size
        
        Deque<Integer> Dq = new ArrayDeque<>();

        // For loop for only the 1st window
        for (int i = 0; i < k; ++i) {

            while (!Dq.isEmpty() && arr[i] >= arr[Dq.peekLast()]) { // The previous smaller element is useless, remove it

                Dq.removeLast(); // Remove from rear   
            }

            Dq.addLast(i); // Add the index of the element from rear

        }

        for (int i = k; i < n; ++i) {

            System.out.print(arr[Dq.peek()] + " "); // The element at the front of the queue will be the largest

            while (!Dq.isEmpty() && Dq.peek() <= i - k) { // Remove extra elements which not in the window
                Dq.removeFirst();
            }

            Dq.addLast(i);
        }
        
        System.out.print(arr[Dq.peek()]); // Print max element of the window
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

        System.out.println(" ");

        printMax(array, n, 3);
    }
    
}
