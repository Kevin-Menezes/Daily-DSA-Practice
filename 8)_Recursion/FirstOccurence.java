import java.util.Scanner;

public class FirstOccurence {


    static int firstOccurence(int[] arr,int n,int i,int key){

        // Base condition
        if(i==n){
            return -1;
        }

        // Main condition
        if(arr[i]==key){
            return i;
        }

        return firstOccurence(arr,n,i+1,key);
    }

    
    public static void main(String[] args) {
        
        // Input total no. of elements in array
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the total elements : ");
        int n = s.nextInt();

        // Input all the elements
        int[] arr = new int[n];

        System.out.println("Enter the numbers in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // Input the element to be searched
        System.out.print("Enter the element to be searched : ");
        int key = s.nextInt();

        int i=0;

        if (firstOccurence(arr, n, i, key) == -1) {
            System.out.println("Element not found!");
        }
        else {
            System.out.println("Element found at " + (firstOccurence(arr, n, i, key)+1) + " position!");
        }

    }
}