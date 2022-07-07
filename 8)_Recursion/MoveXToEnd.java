// First we extract all the letters and then 1 by 1 we put them back in the string
// substring removes the 1st letter and then returns the remaining letters in the variable


import java.util.Scanner;

public class MoveXToEnd 
{

    public static String moveX(String s)
    {
        if(s.length()==0)
        {
            return "";
        }

        char ch = s.charAt(0);
        String ans = moveX(s.substring(1)); // This removes 1 - 1 letter from the string until it becomes empty

        if(ch=='x')
        {
            return ans+ch;
        }
        else
        {
            return ch+ans;

        }
    }


    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = s.nextLine();

        System.out.print("Final string : "+moveX(str));

    }

    
}
