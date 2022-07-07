public class PalindromeLL {

    static Node head; // Accessing Node class through head object

    // Class to create Nodes
    static class Node { // Nested class

        char data;
        Node next;

        Node(char c) { // Constructor
            data = c;
            next = null;
        }
    }

    // Function to find the mid of LL
    static Node midOfLL(Node head) {

        Node slow = head; // We keep 2 pointers ...both start at head
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; // Fast runs twice the speed as slow...hence when fast reaches the finish line... slow will be halfway
                                   
        }
        return slow; // We return the mid
    }

    // Function to reverse LL from mid to end
    static Node reverseLL(Node head) {

        // Base condition
        if (head == null || head.next == null) {
            return head; // Here the last node becomes the head
        }

        Node newHead = reverseLL(head.next); // Sending the next node as the head in recursion until the last node
                                             // becomes the head

        // Connecting the 1st 2 nodes
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead; // Always the last node only gets returned
    }


    // Function to check if the LL is Pallindrome
    static boolean checkPallindrome(Node head) {

        if (head == null) // If nothing is there in the LL
            return true;

        Node mid = midOfLL(head); // Finding the middle of the LL

        Node last = reverseLL(mid.next); // Reversing the LL from mid to end

        Node curr = head;

        while (last != null) {
            if (last.data != curr.data) { // Traversing the LL simultaneously from front and back
                return false;
            }
            last = last.next;
            curr = curr.next;

        }
        return true;

    }
    
    
    public static void main(String args[]) {
        
        head = new Node('A'); // Accessing the head object created
        head.next = new Node('B');
        head.next.next = new Node('B');
        head.next.next.next = new Node('B');

        if (checkPallindrome(head)) {
            System.out.println("It is a Palindrome");
        }
        else {
            System.out.println("It is not a Palindrome");
            
        }

    }
    
}
