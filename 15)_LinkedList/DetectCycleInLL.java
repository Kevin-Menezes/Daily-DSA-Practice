import java.util.Scanner;

public class DetectCycleInLL {

    static Node head; // Accessing Node class through head object

    static class Node { // Nested class

        char data;
        Node next;

        Node(char d) { // Constructor
            data = d;
            next = null;
        }
    }

    // Function to detect if a cycle is present or not
    static Node detectCycle(Node head) {

        Node slow = head; // We take 2 pointers
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // If both meet means there is a cycle in the LL
                return slow;
            }
        }
        return null;
    }

    // Function to detect first node from where the cycle starts
    static Node detectFirstNode(Node head) {

        if (detectCycle(head) == null) { // If there's no cycle.. we return null
            return null;
        }

        Node meet = detectCycle(head);
        Node start = head;

        while (start != meet) {
            start = start.next;
            meet = meet.next;
        }
        return start; // When both meet ..that's the start of the cycle
    }
    
    // Function to break the cycle
    static void deleteCycle(Node head,Node meet) {
        
        Node prev = meet; // We take prev to help in deleteCycle function
        meet = meet.next;

        Node start = head;
        start = start.next;

        while (start != meet) { // When this loop is completed...we get the start node of the cycle
            prev = prev.next;
            start = start.next;
            meet = meet.next;
        }
        prev.next = null; // Here we make the node before the start of the cycle to point to null
        System.out.println("Cycle detached!");
    }

    // Function to print LL
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the max characters u want to put in the LL : ");
        int n = s.nextInt();

        System.out.println("Enter the characters in the LL : ");
        head = new Node(s.next().charAt(0)); // Taking the head first

        Node prev = head; // Taking 2 pointers
        Node curr = head.next;

        for (int i = 0; i < n - 1; i++) {
            curr = new Node(s.next().charAt(0)); // Taking data inside curr
            prev.next = curr; // Connecting the previous node with curr

            prev = prev.next;
            curr = curr.next;
        }

        // Manually creating a cycle
        prev.next = head.next.next;

        // --------------------------------------------------------------------------

        Node CycleStart = detectFirstNode(head);
        if (CycleStart == null) {
            System.out.println("No cycle detected!");
        }
        else {
            System.out.println("Cycle detected at node " + CycleStart.data);
        }
        
        // To delete the cycle
        deleteCycle(head, detectCycle(head));

        // Checking again if after deletion a cycle is present or no
        if (detectFirstNode(head) == null) {
            System.out.println("No cycle detected!");
        }
        
        
    }
    
}
