import java.util.Scanner;

public class QueueCreationUsingCircularArray {

    // Variables
    int a[];
    int n;
    int front = -1, rear = -1;

    // Constructor
    public QueueCreationUsingCircularArray(int n) {

        this.n = n;
        a = new int[n];
    }
    
    // Function to insert element in the queue
    void enqueue(int data) {

        if ((rear + 1) % n == front) // If the rear is last and the front is on the first -> then the queue is full
            return;

        if (front == -1) // For 1st element
            front = 0;

        rear = (rear + 1) % n;
        a[rear] = data; // Putting the data inside the array
        System.out.println("Element inserted!");

    }
    
    // Function to remove element from the queue
    int dequeue() throws Exception {
        
        if(front==-1)   
            throw new Exception("Can't remove! Queue is empty!");

        int result = a[front];

        if(front==rear) // If only 1 element was left in the array
            front = rear = -1;
        else
            front = (front + 1) % n;
        
        return result;
    }


    public static void main(String args[]) throws Exception {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the limit of the array : ");
        int n = s.nextInt();

        QueueCreationUsingCircularArray queue = new QueueCreationUsingCircularArray(n);

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
