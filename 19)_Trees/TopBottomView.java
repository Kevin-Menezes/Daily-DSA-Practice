import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class TopBottomView {

    // Nested class
    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Function to get the top view
    static ArrayList<Integer> topView(Node root) {

        Queue<Node> q = new ArrayDeque<>(); // We use queue for level order traversal
        Map<Integer, Integer> map = new TreeMap<>();

        q.offer(new Pair(0, root));
        while (!q.isEmpty()) {
            Pair cur = q.poll();
            if (!map.containsKey(cur.hd)) {
                map.put(cur.hd, cur.node.data);
            }

            if (cur.node.left != null) {
                q.add(new Pair(cur.hd - 1, cur.node.left));
            }
            if (cur.node.right != null) {
                q.add(new Pair(cur.hd + 1, cur.node.right));
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

    // Function to get the Bottom View
    static ArrayList<Integer> BottomView(Node root) {

        Queue<Node> q = new ArrayDeque<>(); // We use queue for level order traversal
        Map<Integer, Integer> map = new TreeMap<>();

        q.add(new Pair(0, root));
        while (!q.isEmpty()) {
            Pair cur = q.poll();

            map.put(cur.hd, cur.node.data); // Here the if is removed...coz we update the nodes in the map to get the bottom view

            if (cur.node.left != null) {
                q.add(new Pair(cur.hd - 1, cur.node.left));
            }
            if (cur.node.right != null) {
                q.add(new Pair(cur.hd + 1, cur.node.right));
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
    
    // A Pair class
    static class Pair<U,V> {
        
        public final U first; // first field of a pair
        public final V second; // second field of a pair

        // Constructs a new Pair with specified values
        private Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }

        // Factory method for creating a Typed Pair immutable instance
        public static <U, V> Pair<U, V> of(U a, V b) {
            // calls private constructor
            return new Pair<>(a, b);
        }
    }

    // Function to take nodes as input and create tree
    static Node createTree() {

        Node root = null; // initialisation

        System.out.print("Enter data : "); // root
        int data = s.nextInt();

        if (data == -1) {
            return null;
        }

        root = new Node(data); // declaration

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
        tbv.topView(root);


    }
    
}
