import java.util.ArrayList;
import java.util.Scanner;

public class SideViewsOfBinaryTree {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Funtion to print Right View Util
    void printRightViewUtil(Node root, ArrayList<Node> list, int level) {

        if (root == null) {
            return;
        }

        if (list.size() <= level) {
            list.add(level, root);
        }

        printRightViewUtil(root.right, list, level + 1); // First root.right comes here
        printRightViewUtil(root.left, list, level + 1);
    }

    // Function to print Left View Util
    void printLeftViewUtil(Node root, ArrayList<Node> list, int level) {

        if (root == null) {
            return;
        }

        if (list.size() <= level) {
            list.add(level, root);
        }

        printLeftViewUtil(root.left, list, level + 1);
        printLeftViewUtil(root.right, list, level + 1);
    }

    // Function to print the right view
    void printRightView(Node root) {

        ArrayList<Node> list = new ArrayList<>();
        printRightViewUtil(root, list, 0);

        System.out.print("Right view: ");
        for (Node cur : list) {
            System.out.print(cur.data + " ");
        }
    }

    // Function to print the left view
    void printLeftView(Node root) {

        ArrayList<Node> list = new ArrayList<>();
        printLeftViewUtil(root, list, 0);

        System.out.print("Left view: ");
        for (Node cur : list) {
            System.out.print(cur.data + " ");
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

        SideViewsOfBinaryTree svt = new SideViewsOfBinaryTree();
        svt.printLeftView(root);
        svt.printRightView(root);
    
    }
}
