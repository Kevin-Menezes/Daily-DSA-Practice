import java.util.Scanner;

public class QueueCreationUsingLL {

    Node front, rear; // Creating objects of node class

    static class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data; // We can do like this also
            next = null;
        }
    }
    
    // Inserting nodes in queue
    void enqueue(int num) {

        Node newNode = new Node(num);

        if (front == null) { // Then the new node becomes the front as well as rear
            front = newNode;
            rear = newNode;
            System.out.println("Element inserted at front!");
            return;
        }

        rear.next = newNode; // Inserting from rear
        rear = newNode;
        System.out.println("Element inserted!");
    }
    
    // Removing nodes from queue
    int dequeue() throws Exception {
        
        // Checking if queue is empty
        if(front==null)
            throw new Exception("Queue is empty! Cannot remove anything!");

        int result = front.data;
        front = front.next; // Making the next element as front
        return result;

    }

    public static void main(String args[]) throws Exception {
        
        Scanner s = new Scanner(System.in);

        QueueCreationUsingLL queue = new QueueCreationUsingLL();

        while (true) {

            System.out.println("Press 1 for enqueue()");
            System.out.println("Press 2 for dequeue()");
            System.out.print("Choose what u want to do : ");
            int n = s.nextInt();

            switch (n) {

                case 1:
                    System.out.print("Enter the number to be inserted in queue : ");
                    int num = s.nextInt();
                    queue.enqueue(num);
                    break;

                case 2:
                    int remove = queue.dequeue();
                    System.out.println("Number removed from queue is " + remove);
                    break;

                default:
                    System.out.println("Not valid!");
            }

            System.out.print("Do you want to continue? Type yes or no : ");
            if(s.next()=="no")
                break;
            else {
                System.out.println(" ");
            }
        }

    }
    
}
