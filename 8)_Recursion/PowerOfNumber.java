import java.util.Scanner;

public class PowerOfNumber 
{

    public static int power(int n,int p)
    {
        //Base condition
        if(p==0)
        {
            return 1;
        }


        return n * power(n,p-1);
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = s.nextInt();
        System.out.print("Enter the power: ");
        int p = s.nextInt();

        System.out.print("The answer is "+power(n,p));
    }
    
}
