// STACK = LIFO
// QUEUE = FIFO
// Making a queue using stack

import java.util.Scanner;
import java.util.Stack;

public class MakeQueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Function to push data (O(1))
    void offer(int data) {
        s1.push(data);
    }

    // Function to pop data (O(N))
    int poll() {
        while (!s1.isEmpty()) { // Move from s1 to s2
            s2.push(s1.pop());
        }
        int result = s2.pop(); // Remove the top of s2

        while (!s2.isEmpty()) { // Move from s2 to s1
            s1.push(s2.pop());
        }
        return result;   
    }

    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);

        MakeQueueUsingStack queue = new MakeQueueUsingStack();

        while (true) {

            System.out.println("Press 1 for offer()");
            System.out.println("Press 2 for poll()");
            System.out.print("Choose what u want to do : ");
            int n = s.nextInt();

            switch (n) {

                case 1:
                    System.out.print("Enter the number to be pushed onto queue : ");
                    int num = s.nextInt();
                    queue.offer(num);
                    break;

                case 2:
                    int pop = queue.poll();
                    System.out.println("Number popped from queue is " + pop);
                    break;

                default:
                    System.out.println("Not valid!");
            }

            if (n > 2) {
                break;}
            

        }

        
    }
    
}
