// O(n)

import java.util.Scanner;

public class PalindromeString 
{

    public static boolean palindrome(String s,int l,int r)
    {
        // If both cross each other without returning false then we return true its a palindrome
        if(l>=r)
        {
            return true;
        }

        // If both the characters at both the ends are not the same
        if(s.charAt(l)!=s.charAt(r))
        {
            return false;
        }

        return palindrome(s, l+1, r-1);

    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number or word : ");
        String str = s.nextLine();

        int last = str.length();

        if(palindrome(str,0,last-1))
        {
            System.out.println("It is a palindrome!");
        }
        else
        {
            System.out.println("It is not a palindrome!");
        }
    }
    
}
