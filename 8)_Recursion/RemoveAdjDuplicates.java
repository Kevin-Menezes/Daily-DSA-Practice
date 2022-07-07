import java.util.Scanner;

public class RemoveAdjDuplicates 
{

    public static String adjRemove(String s)
    {
        if(s.length()==0)
        {
            return " ";
        }

        char ch = s.charAt(0); // Taking the first letter

        String ans = adjRemove(s.substring(1)); // Removing the 1st letter and sending the rest of the string in the recursive function

        System.out.println(ch+" "+ans);

        if(ch == ans.charAt(0))
        {
            return ans; // THIS REMOVES THAT LETTER AND ONLY CONSIDERS THE FORWARD STRING

        }
        else
        {
            return (ch+ans) ; // IF THE LETTER IS NOT DUPLICATE ....THEN IT RETURNS THE LETTER AND THE FORWARD STRING

        }

    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string : ");

        String str = s.nextLine();

        System.out.print("Adjacent duplicates removed : "+adjRemove(str));

    }
    
}
