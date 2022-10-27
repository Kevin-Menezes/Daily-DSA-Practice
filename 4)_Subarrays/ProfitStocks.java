import java.util.Scanner;

public class ProfitStocks {

    static void getMaxProfit(int[] price) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        if (price.length == 0) {
            System.out.println("Market not open!");
        }

        for (int i = 0; i < price.length; i++) {

            minPrice = Math.min(minPrice, price[i]);

            maxProfit = Math.max(maxProfit, price[i] - minPrice);
        }
        System.out.println("Max profit : "+maxProfit);
    }

    public static void main(String[] args) {
        
        // Input total number of days of market
        Scanner s = new Scanner(System.in);
        System.out.print("Enter total number of days of market : ");
        int n = s.nextInt();

        // Input Stocks price on each day in array
        int[] price = new int[n];
        System.out.println("Enter stock price on each day : ");

        for (int i = 0; i < n; i++) {
            System.out.print("Day " + (i + 1) + " : ");
            price[i] = s.nextInt();
        }

        getMaxProfit(price);
    }
    
}
