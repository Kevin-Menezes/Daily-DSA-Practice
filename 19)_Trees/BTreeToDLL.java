import java.util.Scanner;

public class BTreeToDLL {

    static Node prev, head = null;

    // Nested class
    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;

        }
    }

    static void convertToDLL(Node root) {
        
        if (root == null) { // If no element is there
            return;
        }

        convertToDLL(root.left);

        if (prev == null) { // If only 1 element is there
            head = root;
        }
        else {
            root.left = prev;
            prev.right = root;
        }

        prev = root;
        convertToDLL(root.right);

    }
    
    // Function to take nodes as input and create tree
    static Node createTree() {

        Node root = null;

        System.out.print("Enter data : ");
        int data = s.nextInt();

        if (data == -1) {
            return null;
        }

        root = new Node(data);

        System.out.println("Enter left of " + data); // left
        root.left = createTree();

        System.out.println("Enter right of " + data); // right
        root.right = createTree();

        return root;

    }
    

    static Scanner s = null;

    public static void main(String args[]) {

        s = new Scanner(System.in);

        Node root = createTree();

        convertToDLL(root);
        

    }
    
}
