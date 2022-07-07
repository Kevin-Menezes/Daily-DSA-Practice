// First we find the factors of both the numbers
// Then we see which are the common ones
// These 2 below are Eucleadean Algorithm

// LCM = (a/GCD)*b

import java.util.Scanner;

public class GCD 
{
    public static int getGCD(int a, int b) 
    {

        // RECURSIVE WAY
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return getGCD(a - b, b);
        return getGCD(a, b - a);

        // SHORTER MOD % METHOD ONLY 3 LINES
        // if (b == 0)
        // return a;
        // return gcd(b, a % b);

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
