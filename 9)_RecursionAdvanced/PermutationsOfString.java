import java.util.Scanner;

public class PermutationsOfString 
{

    public static void permute(String s, String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans+" "); // Printing all the permutations in a line
            return;
        }

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i); // Selecting 1 character

            String ros = s.substring(0, i) + s.substring(i+1); // Taking other characters except the selected one

            permute(ros, ans+c);
        }


    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string : ");

        String str = s.nextLine();

        permute(str,"");
    }
    
}
