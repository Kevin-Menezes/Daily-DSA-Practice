import java.util.Scanner;

public class QueueCreationUsingArray {

    // Variables
    int capacity; // Declaring
    int a[];
    int rear;

    // Constructor
    public QueueCreationUsingArray(int n) {

        capacity = n; // Initializing
        a = new int[n];
        rear = -1;
    }
    
    // Function to insert element in the queue
    void enqueue(int n) throws Exception {

        if (rear == capacity - 1)
            throw new Exception("Can't insert! Queue already full!");

        rear++;
        a[rear] = n; // Inserting the element in the next slot
        System.out.println("Number inserted!");
    }
    
    // Function to remove element from the queue
    int dequeue() throws Exception {

        if (rear == -1)
            throw new Exception("Can't remove! Queue empty!");

        int result = a[0]; // First element goes out

        for (int i = 0; i < rear; i++)
            a[i] = a[i + 1]; // Putting all elements 1 step back

        rear--; // Putting rear to the second last element
        return result;
    }

    // Function to get the 1st element    
    int getFront() throws Exception {
        if (rear == -1)
            throw new Exception("Can't remove! Queue empty!");

        return a[0];

    }

    public static void main(String args[]) throws Exception {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the limit of the array : ");
        int n = s.nextInt();

        QueueCreationUsingArray queue = new QueueCreationUsingArray(n);

        while (true) {

            System.out.println("Press 1 for enqueue()");
            System.out.println("Press 2 for dequeue()");
            System.out.println("Press 3 for getFirst()");
            System.out.print("Choose what u want to do : ");
            int choice = s.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter the number to be inserted in queue : ");
                    int num = s.nextInt();
                    queue.enqueue(num);
                    break;

                case 2:
                    int remove = queue.dequeue();
                    System.out.println("Number removed from queue is " + remove);
                    break;
                
                case 3:
                    int front = queue.getFront();
                    System.out.println("Element at front is " + front);
                    break;

                default:
                    System.out.println("Not valid!");
            }

            System.out.print("Do you want to continue? Type yes or no : ");
            if (s.next() == "no")
                break;
            else {
                System.out.println(" ");
            }
        }
    }
    
}
