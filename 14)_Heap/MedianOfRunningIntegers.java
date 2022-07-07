import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// We have to find the median of the array at any given point of time
// The numbers will go on getting inserted in the array , and we have to find the median simultaneously
// We seperate the numbers as left and right side (MaxHeap and MinHeap)
// The median will be bigger than the biggest number in the left side and smaller than the smallest number on the right side 


public class MedianOfRunningIntegers {

    static PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());  // This becomes a MaxHeap when we use Collections
    static PriorityQueue<Integer> MinHeap = new PriorityQueue<>();
    
    // We insert numbers one by one
    static void insertNum(int num) {

        if (MaxHeap.isEmpty() || MaxHeap.peek() >= num)
            MaxHeap.add(num);
        else
            MinHeap.add(num);

        // Both the Heaps should be of equal size. Hence we balance them out
        if (MaxHeap.size() > MinHeap.size() + 1) // If MaxHeap is bigger then we put the elements from MaxHeap into MinHeap
            MinHeap.add(MaxHeap.poll());
        else if (MinHeap.size() > MaxHeap.size() + 1)
            MaxHeap.add(MinHeap.poll());

    }
    
    static double findMedian() {

        // If both the heaps are equal , then we have even numbers in the PQ and we take the mean of the middle 2 nos to get the median
        if(MaxHeap.size() == MinHeap.size())
            return MaxHeap.poll() / 2.0 + MinHeap.poll() / 2.0;
        
        return MaxHeap.peek(); // If the numbers are odd, then we return the largest number from the left side ie. MaxHeap
        
    }


    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);

        insertNum(3);
        insertNum(7);
        insertNum(2);
        insertNum(6);
        insertNum(9);
        insertNum(1);

        System.out.println("The Median is : "+findMedian()); // 1 2 3 6 7 9

    }
    
}
