import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonRepeatingElement 
{
    public static int nre(List<Integer> list)
    {
        int res = list.get(0);

        for(int i=1;i<list.size();i++)
        {
            res = res^list.get(i); // This XOR's with everything 
        }
        return res;
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

        System.out.print("The non repeating element is : "+nre(list));
        
    }
    
}
