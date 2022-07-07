import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoNonRepeating 
{

    public static String twoNRE(List<Integer> list)
    {
        int res = list.get(0);

        // Removing all the duplicate elements in the list
        for(int i=1;i<list.size();i++)
        {
            res ^= list.get(i);
        }

        // Get the rightmost set bit
        int rsb = res & ~ (res - 1) ;

        int sum1 = 0;
        int sum2 = 0;

        for(int i=0;i<list.size();i++)
        {
            if((list.get(i) & rsb ) > 0)  // odd numbers
            {
                sum1 ^= list.get(i);
            }
            else
            {
                sum2 ^= list.get(i); // even numbers
            }
                
        }


        return "The 2 non repeating numbers are "+sum1+" and "+sum2;
    }

    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);
        System.out.print("Enter total numbers of elements u want to put in the list : ");
        int n = s.nextInt();

        System.out.println("Enter elements in the list : "); 
        for(int i=0;i<n;i++)
        {
            list.add(s.nextInt());
        }

        System.out.print(twoNRE(list));
    }
    
}
