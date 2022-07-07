// This is done ITERATIVELY

public class ReverseALinkedList {

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

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev; // Connecting the curr node's next part with the previous node
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    // Function to print LL
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


    public static void main(String args[]) {
        
        ReverseALinkedList list = new ReverseALinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(list.head);
        Node revhead = reverseLL(list.head);

        System.out.println(" ");
        System.out.println("Reversed linked list ");
        list.printList(revhead);
    }
    
}
