//GOOGLE QUESTION

//WE HAVE TO FIND OUT HOW MANY DAYS ARE RECORD BREAKING DAYS

//A RECORD BREAKING DAY IS A DAY THAT SATISFIES 2 CONDITIONS:

// CONDITION 1 - THE NUMBER OF PEOPLE ATTENDING THE FAIR ON THAT DAY IS GREATEST THAN ALL THE PREVIOUS DAYS

// CONDITION 2 - THE NUMBER OF PEOPLE ATTENDING THE FAIR ON THAT DAY IS GREATER THAN THE NUMBER OF PEOPLE ATTENDING ON THE NEXT DAY

// NOTE : THE FIRST DAY CAN ALSO BE A RECORD BREAKING DAY

// TIME COMPLEXITY FOR OPERATION = O(n)

import java.util.Scanner;

public class RecordBreakingDay
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the total number of days of the fair : ");
        int num = s.nextInt();

        int a[] = new int[num+1];
        a[num] = -1;

        for(int i = 0; i < num; i++)
        {
            System.out.print("Enter number of people on day "+i+" : ");
            a[i] = s.nextInt();

        }

        int rbd = 0;
        int prevmax = -1;
        String str = "";
        String day = "";

        if(num==1)
        {
            System.out.println("There is only 1 record breaking day!");
            return;
        }

        for(int i=0;i<num;i++)
        {
            if(prevmax<a[i] && a[i]>a[i+1])
            {
                day += Integer.toString(i) + " & ";
                str += Integer.toString(a[i]) + " & ";
                rbd++;
            }
            prevmax = Math.max(prevmax,a[i]);

        }

        System.out.println("Total Record Breaking days : "+rbd+" on days "+day+". Crowd on both the days : "+str+" respectively");



    }
}