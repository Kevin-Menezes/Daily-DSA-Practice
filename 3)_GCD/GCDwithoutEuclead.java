// n1=48 , n2=36
// 48-36 = 12
// 36-12 = 24
// 24-12 = 12

import java.util.Scanner;

public class GCDwithoutEuclead 
{
    public static int getGCD(int n1, int n2) 
    {

        while(n1!=n2)   
        {  
            if(n1>n2)  
                n1=n1-n2;  
            else  
                n2=n2-n1;  
        }  

        return n2;

        // Another method
        // int temp = 0;
        // while(n2!=0)
        // {
        //     temp = n1%n2;
        //     n1 = n2;
        //     n2 = temp;
        // }
    
        // return n1;

    }

    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter both the numbers : ");
        int a = s.nextInt();
        int b = s.nextInt();

        int gcd = getGCD(a, b);
        System.out.println("GCD : "+gcd);

    }
    
}
