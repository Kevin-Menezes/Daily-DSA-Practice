import java.util.Scanner;
import java.util.*;

public class BuySellStocks {

    // This is a function to get the index of an element by sending its value
    public static int getIndex(int a[], int value) {

        int k = 0;
        for (int i = 0; i < a.length;i++) {
            if (a[i] == value) {
                k = i;
            }
        }
        return k;
    }
    
    // This function prints out the maximum profit
    public static void maxProfit(int a[]) {

        if (a.length == 0) {
            System.out.println("No days available");
            return;
        }

        int minday = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < a.length; i++) {

            minday = Math.min(a[i], minday);

            int profit = a[i] - minday;

            maxprofit = Math.max(profit, maxprofit);
        }
        
        System.out.println("We'll get the maximum profit of Rs "+maxprofit+" when we buy stocks on day "+(getIndex(a,minday)+1)+" and sell them on day "+(getIndex(a,maxprofit+minday)+1));
    }


    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of days : ");
        int n = s.nextInt();

        int a[] = new int[n]; // We give a fixed size when we use arrays

        System.out.println("Enter the value of stock on each day : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Day " + (i + 1) + " : ");
            a[i] = s.nextInt();
        }

        maxProfit(a);
    }
}
