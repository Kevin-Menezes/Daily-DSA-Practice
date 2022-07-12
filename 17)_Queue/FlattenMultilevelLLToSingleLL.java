import java.util.ArrayDeque;
import java.util.Queue;

public class FlattenMultilevelLLToSingleLL {

    static Node head;

    static class Node {

        int data;
        Node next;
        Node down; // Down pointer

        Node(int d) { // Constructor
            data = d;
        }
    }

    // ========================================================================================

    // This function is using O(n) space
    // static Node convertLL(Node head) {

    //     Node curr = head;
    //     Queue<Node> q = new ArrayDeque<>();

    //     while (curr != null) {

    //         // When we reach the last node
    //         if (curr.next == null) {
    //             curr.next = q.poll(); // We remove the element from queue and then curr points to it
    //         }

    //         // If the curr node has a node at its bottom
    //         if (curr.down != null) {
    //             q.add(curr.down); // Put this node in queue
    //         }

    //         curr = curr.next;

    //     }
    //     return head;
    // }

    // ==========================================================================================
    
    // This function uses O(1) space
    static void convertLL(Node head) {

        // Base condition
        if (head == null) {
            return;
        }

        Node temp = null;

        // Find tail node of 1st level LL
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        // 1 by 1 traverse through the nodes of the 1st level LL till we reach tail
        Node curr = head;
        while (curr != tail) {

            // If curr has a down
            if (curr.down != null) {
                tail.next = curr.down; // Connect the tail to the down

                temp = curr.down;

                // Making the tail go to the last node
                while (temp.next != null) {
                    temp = temp.next;
                }
                tail = temp;
            }
            curr = curr.next;
        }

    }

    // Function to print a list with `down` and `next` pointers
    public static void printOriginalList(Node head) {
        if (head == null) {
            return;
        }

        System.out.print(" " + head.data + " ");

        if (head.down != null) {
            System.out.print("[");
            printOriginalList(head.down);
            System.out.print("]");
        }

        printOriginalList(head.next);
    }

    // Function to print Flattened LL
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String args[]) {

        // create individual nodes and link them together later
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        Node thirteen = new Node(13);
        Node fourteen = new Node(14);
        Node fifteen = new Node(15);

        // set head node
        Node head = one;

        // set next pointers
        one.next = four;
        four.next = fourteen;
        fourteen.next = fifteen;
        five.next = nine;
        nine.next = ten;
        seven.next = eight;
        eleven.next = thirteen;

        // set down pointers
        one.down = two;
        two.down = three;
        four.down = five;
        five.down = six;
        six.down = seven;
        ten.down = eleven;
        eleven.down = twelve;

        System.out.println("The original list is :");
        printOriginalList(head);

        // head = convertLL(head);
        // System.out.println("\n\nThe flattened list is :");
        // printList(head);

        convertLL(head);
        System.out.println("\n\nThe flattened list is : ");
        printList(head);

    }

}
