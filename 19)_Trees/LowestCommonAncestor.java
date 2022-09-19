import java.util.Scanner;

// 2 nodes will be selected
// We have to find out the lowest level common node that is their ancestor

public class LowestCommonAncestor {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static Node LCA(Node root, int n1, int n2) {

        // Base Condition
        if(root==null)
            return null;
        
        // If the selected node is the root
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node left = LCA(root.left, n1, n2);
        Node right = LCA(root.right, n1, n2);

        if (left == null)
            return right;
        
        if (right == null)
            return left;

        return root; // or else if only root is there return root

    }

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

        System.out.print("Select 1 node : ");
        int n1 = s.nextInt();

        System.out.print("Select another node : ");
        int n2 = s.nextInt();

        System.out.println("The LCA is "+LCA(root,n1,n2).data);

    }
    
}
