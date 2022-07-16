import java.util.Scanner;

public class CreatingTree {

    // Nested class
    static class Node {

        int data;
        Node left, right;

        public Node(int data) { // Constructor
            this.data = data;
        }
    }
    
    // Function to take nodes as input and create tree
    static Node createTree() {

        Node root = null;

        System.out.print("Enter data : "); // root
        int data = s.nextInt();

        if (data == -1) {
            return null;
        }

        root = new Node(data);

        System.out.print("Enter left of " + data); // left
        root.left = createTree();

        System.out.print("Enter right of " + data); // right
        root.right = createTree();

        return root;
    }

    // Function to print INORDER traversal (LNR)
    static void inOrder(Node root) {

        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }
    
    // Function to print PREORDER traversal (NLR)
    static void preOrder(Node root) {

        if (root == null)
            return;

        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    // Function to print POSTORDER traversal (LRN)
    static void postOrder(Node root) {

        if (root == null)
            return;

        postOrder(root.left);        
        postOrder(root.right);
        System.out.print(root.data);
    }

    static Scanner s = null; // Making Scanner global

    public static void main(String args[]) {
        
        s = new Scanner(System.in);
        Node root = createTree();
        System.out.println(root.data);

        inOrder(root);
        System.out.println(" ");
        
        preOrder(root);
        System.out.println(" ");
        
        postOrder(root);
        System.out.println(" ");

    }
    
}
