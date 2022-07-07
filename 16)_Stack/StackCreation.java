// Creating a stack using Array List (infinite size)

import java.util.Scanner;

public class StackCreation {

    Node head;
    int size;

    static class Node {

        int data;
        Node next;
        Node random;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Constructor
    StackCreation() {
        head = null;
        size = 0;
    }

    void push(int data) {

        Node temp = new Node(data);
        temp.next = head;
        size++;
        head = temp;
    }

    int peek() throws Exception {
        if (head == null)
            throw new Exception("Cannot get element! Stack underflowed!");

        return head.data;
    }
    
    int pop() throws Exception {
        if (head == null)
            throw new Exception("Cannot get element! Stack underflowed!");

        int res = head.data;
        head = head.next;
        size--;
        return res;

    }
    
    boolean isEmpty() {
        return head == null;
    }

    int size() {
        return size;
    }


    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the capacity of the array : ");
        int c = s.nextInt();

        StackCreation stack = new StackCreation();

        System.out.println("Press 1 for push()");
        System.out.println("Press 2 for pop()");
        System.out.println("Press 3 for peek()");
        System.out.println("Press 4 for isEmpty()");
        System.out.println("Press 5 for size()");
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

            case 3:
                int peek = stack.peek();
                System.out.println("Number peeped from stack is " + peek);
                break;

            case 4:
                if (stack.isEmpty()) {
                    System.out.println("Stack is empty!");
                } else {
                    System.out.println("Stack is not empty!");
                }
                break;
            
            case 5:
                System.out.println("Size of stack is "+stack.size);

            default:
                System.out.println("Not valid!");
        }

    }
    
}
