import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderTraversal {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }

    }

    // Function to print the nodes of the binary tree level by level
    void printLevelOrder(Node root) {

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            Node curr = q.poll();
            System.out.print(curr.data);

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
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

        LevelOrderTraversal lot = new LevelOrderTraversal();
        lot.printLevelOrder(root);

    }
    
}
