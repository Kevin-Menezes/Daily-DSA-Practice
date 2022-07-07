// Building a stack using array (fixed size)

import java.util.Scanner;

public class CreateStackFunctions {

    // Only declarations
    int a[];
    int top;
    int capacity;
    
    // Constructor
    public CreateStackFunctions(int capacity) {

        this.capacity = capacity;
        top = -1;
        a = new int[capacity];
    }
    
    // Function to push elements onto the stack
    void push(int num) throws Exception {

        // If the array is full, we cannot add more elements
        if (top == capacity)
            throw new Exception("Cannot insert! Stack overflowed!");

        top++; // array starts from 0, hence we first initialize top with -1
        a[top] = num;
        System.out.println(num + " is pushed onto the stack!");

    }
    
    // Function to pop elements from the stack
    int pop() throws Exception {

        // If the array is empty, we can't remove anymore elements
        if (top == -1)
            throw new Exception("Cannot remove! Stack underflowed!");

        int res = a[top];
        top--;
        return res;

    }
    
    // Function to get the element on the top of the stack
    int peek() throws Exception {

        // If the array is empty, we can't see any elements
        if (top == -1)
            throw new Exception("Cannot peek! Stack underflowed!");

        return a[top];
    }
    
    // Function to check if the stack is empty or not
    boolean isEmpty() {
        return top == -1;
    }


    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the capacity of the array : ");
        int c = s.nextInt();

        CreateStackFunctions stack = new CreateStackFunctions(c);
        
        System.out.println("Press 1 for push()");
        System.out.println("Press 2 for pop()");
        System.out.println("Press 3 for peek()");
        System.out.println("Press 4 for isEmpty()");
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
                System.out.println("Number popped from stack is "+pop);
                break;

            case 3:
                int peek = stack.peek();
                System.out.println("Number peeped from stack is " + peek);
                break;

            case 4:
                if (stack.isEmpty()) {
                    System.out.println("Stack is empty!");
                }
                else {
                    System.out.println("Stack is not empty!");
                }
                break;

            default:
                System.out.println("Not valid!");
        }
        
    }
    
}
