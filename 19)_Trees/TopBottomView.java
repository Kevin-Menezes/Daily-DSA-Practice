import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class TopBottomView {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static ArrayList<Integer> topView(Node root) {
        
        Queue<Node> q = new ArrayDeque<>();


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

        TopBottomView tbv = new TopBottomView();


    }
    
}
