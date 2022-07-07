// We need to connect and add all numbers in such a way that the final sum is minimum cost

import java.util.PriorityQueue;
import java.util.Scanner;

public class ConnectRopesMinCost {

    static int ropesMinCost(int a[]) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < a.length; i++) {

            pq.add(a[i]); // Putting all the elements inside the priority queue
        }

        int ans = 0;
        
        while (pq.size() > 1) { // The minheap always places elements in ascending order

            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second; // We always add the 2 smaller elements so that the final cost becomes minimum

            ans += sum;
            pq.add(sum); // Putting the sum in the priority queue
        }
        return ans;

    }
    
    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the limit of the array : ");
        int n = s.nextInt();

        int array[] = new int[n]; // An array has a fixed size

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        System.out.println("The minimum cost of the rope is " + ropesMinCost(array));
    }
}