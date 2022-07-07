// Here we divide coz big to small

import java.util.Scanner;

public class DecToBin 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        int dnum = s.nextInt();

        int bnum[] = new int[50];
        int i = 0;

        while(dnum>0)
        {
            bnum[i++] = dnum%2;
            dnum /= 2;

        }
        i--;

        while(i>=0)
        {
            System.out.print(bnum[i--]+" ");
        }

    }
    
}
