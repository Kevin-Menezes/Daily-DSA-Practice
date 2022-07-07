import java.util.Arrays;
import java.util.Scanner;
public class SOE 
{
    public static boolean[] soe(int n)
    {
        // We take a boolean array and fill it with true
        boolean arr[] = new boolean[n+1];

        Arrays.fill(arr, true);
        arr[0]=false;
        arr[1]=false;

        // We traverse in multiples of 2,3,4..... to make them as false
        for(int i=2;i<=Math.sqrt(n);i++) // We take till sqrt(n) coz if numbers less than sqrt(n) get crossed out then automatically its multiples which are greater than sqrt(n) get crossed out
        {
            for(int j=2*i;j<=n;j+=i)
            {
                arr[j] = false;
            }
        }
        return arr;
    }


    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number till where u want to find prime numbers : ");

        int n = s.nextInt();

        boolean arr[] = soe(n);
        for(int i=0;i<=n;i++)
        {
            if(arr[i]==true)
            {
                System.out.print(i+" ");
            }
        }

    }
    
}
