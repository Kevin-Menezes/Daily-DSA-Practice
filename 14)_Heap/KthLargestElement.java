// Array is given..then we put it in the priority queue and it gets added as a min heap
// We have to find the kth largest element in the array.....k=3 then 3rd largest element in the array
// We traverse up till k 
// Then as priority queue is always a min heap...the first element will be smaller than the children
// So we put the elements in the priority queue after k and check with the previous elements 
// At the end we return the element which is on top of the priority queue

import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {

    public static int kthLargest(int a[], int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) { // Here we go from 0 to k and all everything to the pq
            pq.add(a[i]);
        }

        for (int i = k; i < a.length; i++) { // Here we start from kth element to the end of the array
            
            if (pq.peek() < a[i]) { // Checking if the next element is smaller than the parent element of the priority queue

                pq.poll(); // Remove the parent element and put the new element in place of that
                pq.add(a[i]);
            }
        }
        return pq.peek();
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

        System.out.print("Enter the kth number of the array : ");
        int k = s.nextInt();

        System.out.println("Kth largest element : " + kthLargest(array, k));
    }
    
}
