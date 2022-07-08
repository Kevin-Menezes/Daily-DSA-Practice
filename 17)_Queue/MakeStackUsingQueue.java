import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MakeStackUsingQueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Function to push onto stack
    void push(int data) {

        while (!q1.isEmpty()) { // Remove all numbers from q1
            q2.offer(q1.poll());
        }

        q1.offer(data); // Put the new no. in q1

        while (!q2.isEmpty()) { // Add back all the nos. to q1
            q1.offer(q2.poll());
        }
    }
    
    // Function to pop out from stack
    int pop() {
        return q1.poll();
    }


    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        MakeStackUsingQueue stack = new MakeStackUsingQueue();

        while (true) {

            System.out.println("Press 1 for push()");
            System.out.println("Press 2 for pop()");
            System.out.print("Choose what u want to do : ");
            int n = s.nextInt();

            switch (n) {

                case 1:
                    System.out.print("Enter the number to be pushed onto stack : ");
                    int num = s.nextInt();
                    stack.push(num);
                    break;

                case 2:
                    int pop = stack.pop();
                    System.out.println("Number popped from stack is " + pop);
                    break;

                default:
                    System.out.println("Not valid!");
            }

            if (n > 2) {
                break;
            }

        }

    }
    
}
