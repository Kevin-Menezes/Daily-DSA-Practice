// Here we multiply coz small to big

import java.util.Scanner;

public class BinToDec 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        int bnum = s.nextInt();

        int base = 1;
        int dnum = 0;

        while(bnum>0)
        {
            int lastdigit = bnum%10;
            dnum += lastdigit*base;

            base *= 2;
            bnum /= 10;
        }

        System.out.println("The decimal number is : "+dnum);
    }
    
}
