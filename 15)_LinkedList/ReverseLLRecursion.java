// This is done RECURSIVELY

public class ReverseLLRecursion {

    Node head; // Accessing Node class through head object

    // Class to create Nodes
    static class Node { // Nested class

        int data;
        Node next;

        Node(int d) { // Constructor
            data = d;
            next = null;
        }
    }

    // Function to reverse LL
    static Node reverseLL(Node head) {

        // Base condition
        if (head == null || head.next == null) {
            return head; // Here the last node becomes the head
        }

        Node newHead = reverseLL(head.next); // Sending the next node as the head in recursion until the last node becomes the head
                                                
        // Connecting the 1st 2 nodes
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead; // Always the last node only gets returned
    }

    // Function to print LL
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String args[]) {
        
        ReverseLLRecursion list = new ReverseLLRecursion();
        list.head = new Node(89);
        list.head.next = new Node(5);
        list.head.next.next = new Node(45);
        list.head.next.next.next = new Node(27);

        System.out.println("Given Linked list");
        list.printList(list.head);
        Node revhead = reverseLL(list.head);

        System.out.println(" ");
        System.out.println("Reversed linked list ");
        list.printList(revhead);
    }
    
}
