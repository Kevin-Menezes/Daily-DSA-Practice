// First we convert from binary to decimal
// Then we convert from decimal to hexadecimal

import java.util.Scanner;

public class BinToHex 
{
    // Converting binary to decimal
    public static int binToDec(int bnum)
    {
        int dnum =0;
        int i = 0;

        while(bnum>0)
        {
            dnum += Math.pow(2, i++)*(bnum%10);
            bnum /= 10;
        }

        return dnum; // Sending this decimal number to the other function
    }

    // ----------------------------------------------------------------------

    // Converting decimal to hexadecimal
    public static String decToHex(int bnum)
    {
        int dnum = binToDec(bnum); // Calling 1 function inside another

        char arr[] = {'A','B','C','D','E','F'};
        String hnum ="";

        while(dnum>0)
        {
            int rem = dnum%16;

            if(rem>=10)
            {
                hnum = arr[rem-10]+hnum; // [15-10] =   arr[5] = 'F' ......we go reverse that's why we put hnum last
            }
            else
            {
                hnum = rem+hnum;
            }

            dnum /= 16;
        }

        return hnum;

    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        int bnum = s.nextInt();

        System.out.println("Hexadecimal number : "+decToHex(bnum));
    }
    
}
