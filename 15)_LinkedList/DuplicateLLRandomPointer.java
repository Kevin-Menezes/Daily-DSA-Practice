// We have to create a duplicate of the given LL 
// The given LL has random pointers ie. = 1->3 , 2->1 , 3->5
// We have to replicate the same

public class DuplicateLLRandomPointer {

    static Node head;

    
    static class Node {

        int data;
        Node next;
        Node random; // Random pointer

        Node(int d) { // Constructor
            data = d;
            next = null;
        }
    }
    
    // Function to create the duplicate LL
    static Node duplicate(Node head) {
        
        Node curr = head;

        // Inserting new nodes in between
        while (curr != null) {

            Node temp = curr.next; // Storing the next node of the original LL in temp
            curr.next = new Node(curr.data); // Linking the node of the given LL with the node of the duplicate LL and giving same value

            curr.next.next = temp; // Pointing the new node of the duplicate LL to the next node in the given LL
            curr = temp; // Making curr the next node in the given LL
        }
        curr = head; // Putting the curr back to the start
        // ------------------------------------------------------------------------------------------------------------------------------------

        // Setting random pointers of new nodes
        while (curr != null) {

            if (curr.next != null) {

                if (curr.random != null) {
                    curr.next.random = curr.random.next;
                } else {
                    curr.next.random = null;
                }
            }
            curr = curr.next.next;
        }  
        // ------------------------------------------------------------------------------------------------------------------------------------

        Node orig = head;
        Node copy = head.next; // This is the head of the duplicate LL
        Node temp = copy; // We save it in temp coz we have to return the head of the duplicate LL in the end

        // Seperating both the linked lists
        while (orig != null) {
            orig.next = orig.next.next; // Making the given LL proper
            copy.next = (copy.next != null) ? copy.next.next : copy.next; // Making the duplicate LL proper
            orig = orig.next;
            copy = copy.next;
        }

        return temp;
    }



    public static void main(String args[]) {
        

    }
    
}
