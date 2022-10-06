//WE HAVE TO FIND OUT HOW MANY DAYS ARE RECORD BREAKING DAYS

//A RECORD BREAKING DAY IS A DAY THAT SATISFIES 2 CONDITIONS:

// CONDITION 1 - THE NUMBER OF PEOPLE ATTENDING THE FAIR ON THAT DAY IS GREATEST THAN ALL THE PREVIOUS DAYS

// CONDITION 2 - THE NUMBER OF PEOPLE ATTENDING THE FAIR ON THAT DAY IS GREATER THAN THE NUMBER OF PEOPLE ATTENDING ON THE NEXT DAY

// NOTE : THE FIRST DAY CAN ALSO BE A RECORD BREAKING DAY

// TIME COMPLEXITY FOR OPERATION = O(n)

// INPUTS
// Take no. of days ~
// Create array - DS ~
// Take no. of people attending each day inside array ~ 
// If only 1 day -> BASE CONDITION ~
// Iterate through all the days
// Keep track of the previous max days
// Check the next day
// MAIN CONDITION
import java.util.Scanner;

public class RBD {

    static void recBreDay(int[] arr) {

        // BASE CONDTION
        if (arr.length == 1) {
            System.out.println("Festival only held for 1 day. " + arr[0] + " people attended!");
        }

        // BASE CONDTION
        if (arr.length == 0) {
            System.out.println("No record breaking days!");
        }

        int prevmax = -1;
       

        for (int i = 0; i < arr.length; i++) { // [3,2,6,4,7,2]
            
            if (arr[i] > prevmax && arr[i] > arr[i + 1])
            {
          
                System.out.println(i+" was a rbd having "+arr[i]+" people");
            }

            prevmax = Math.max(prevmax, arr[i]);
        }

    }
    

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of days : ");
        int n = s.nextInt();

        int[] arr = new int[n + 1];
        arr[n] = -1;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter no. of people on day " +i+" : ");
            arr[i] = s.nextInt();
        }

        recBreDay(arr);

   }
    

}
