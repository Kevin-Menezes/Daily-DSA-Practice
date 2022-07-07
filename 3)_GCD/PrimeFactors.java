import java.util.Scanner;
public class PrimeFactors 
{

    public void primeFactors(int n)
    {
        int c = 2; // We start dividing the number from 2

        while(n>1)
        {
            if(n%c==0)
            {
                System.out.print(c+" ");
                n /= c;
            }
            else
            {
                c++; // If it is not divisible by the previous number , Move on to the next number
            }
        }

    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = s.nextInt();

        PrimeFactors pf = new PrimeFactors();
        pf.primeFactors(num);

    }
    
}
