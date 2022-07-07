// currsum = 10, sum = 5...then the rest part becomes currsum - sum = 10-5 = 5


import java.util.HashMap;
import java.util.Scanner;

public class SubArrayFromSum {

    static void subArraySum(int a[], int sum) {
        
        int currSum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            currSum += a[i];

            if (currSum - sum == 0) { // Check if both are equal
                start = 0;
                end = i;
                break;
            }

            if (map.containsKey(currSum - sum)) { // If the map contains that key 

                start = map.get(currSum - sum) + 1;
                end = i;
                break;
            }
            map.put(currSum, i); // If the number is not there in the map then put it
        }

        if (end == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println("Start = "+start+" , End = "+end);
        }
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

        System.out.print("Enter the sum : ");
        int sum = s.nextInt();

        subArraySum(array, sum);
    }
    
}
