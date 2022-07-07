// CAME IN GOOGLE QUESTION

// ARITHMETIC SUBARRAY
// [1,2,3,4]....(difference between consecutive nos is same ie. 1)
// [9,7,5,3].....(difference is -2)

// MAXIMUM ARITHMETIC SUBARRAY
// [9,8,6,4,2,1]....(Here 8,6,4,2 has the longest streak where difference is -2)

import java.util.Scanner;

public class MaximumArithmeticSubarray 
{
    public static int getMaxArrSub(int a[])
    {
        int n = a.length;
        int ans = 2; // FINAL ANSWER...WE ASSUME DEFAULT AS 2
        int pd = a[1] - a[0]; // PREVIOUS COMMON DIFFERENCE (pd)
        int curr = 2; // CURRENT LENGTH
        int j = 2; // WE START FROM 2 COZ WE ALREADY DID FOR 1 IN THE PREVIOUS STEP

        while(j<n)
        {
            if(pd==a[j]-a[j-1]) // WE CHECK IF THE PREVIOUS COMMON DIFFERENCE IS SAME TO THE CURRENT COMMON DIFFERENCE..... whenever we go from left to right we do -1 
            {
                curr++;
            }
            else
            {
                pd = a[j]-a[j-1];
                curr = 2; // GETTING CURRENT LENGTH BACK TO ORIGINAL VALUE
            }
            ans = Math.max(curr,ans); // WE TAKE THE MAXIMUM OF ALL THE LENGTHS AND OUTPUT IT
            j++;
        }

        return ans; // Returns the max number

    }


    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = s.nextInt();

        int a[] = new int[n];

        for(int i = 0 ; i<n ; i++)
        {
            System.out.print("Number "+i+" : ");
            a[i] = s.nextInt();
        }

        System.out.println("Maximum arithmetic subarray = "+getMaxArrSub(a));

    }
    
}
