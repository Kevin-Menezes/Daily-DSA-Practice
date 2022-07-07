// "" , a , b , c , ab , bc , ac , abc
// Look in the notebook
import java.util.Scanner;

public class PowersetOfString 
{
    // str : Stores input string
    // curr : Stores current subset
    // index : Index in current subset, curr

    public void powerset(String s, int i, String curr)
    {
        // Base condition
        if(i==s.length())
        {
            System.out.println(curr);
            return;
        }
        powerset(s, i + 1, curr + s.charAt(i)); // This is with the character included
        powerset(s, i + 1, curr); // This is without the character included
    }



    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = s.nextLine();

        int i = 0;
        String curr = "";

        PowersetOfString p = new PowersetOfString();
        p.powerset(str,i,curr);

        
    }
    
}
