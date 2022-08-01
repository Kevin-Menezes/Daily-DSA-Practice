import java.util.Scanner;

public class DiameterOfBTree {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }
    
    static int ans = 0;

    static int height(Node root) {
        
        // Base condition
        if(root==null)
            return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        ans = Math.max(ans, 1 + lh + rh); // We put 1 here coz we count the root also
        return 1 + Math.max(lh, rh);

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

        System.out.println("The diameter of btree is : "+height(root));
        
    }
    
}
