import java.util.Scanner;

public class CreatingTree {

    // Nested class
    static class Node {

        Node left, right;
        int data;

        public Node(int data) { // Constructor
            this.data = data;
        }
    }
    
    // Function to take nodes as input and create tree
    static Node createTree() {

        Node root = null;

        System.out.println("Enter data : "); // root
        int data = s.nextInt();

        if (data == -1) {
            return null;
        }

        root = new Node(data);

        System.out.println("Enter left : " + data); // left
        root.left = createTree();

        System.out.println("Enter right : " + data); // right
        root.right = createTree();

        return root;
    }

    static Scanner s = null; // Making Scanner global

    public static void main(String args[]) {
        
        s = new Scanner(System.in);
        Node root = createTree();
        System.out.println(root);;

    }
    
}
