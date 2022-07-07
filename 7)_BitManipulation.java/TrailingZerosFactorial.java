import java.util.Scanner;

public class TrailingZerosFactorial
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the factorial number : ");
        int f = s.nextInt();

        double power = 0;
        int ans = 0;
        int p = 1;

        while(f>power)
        {
            power = Math.pow(5,p++);
            ans += f/power;           
        }

        System.out.println("Number of trailing zeroes are : "+ans);
    }
}