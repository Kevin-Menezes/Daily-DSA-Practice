import java.util.Scanner;

public class ReplacePiWithNumber 
{
    public static void replace(String s)
    {
        if(s.length()==0)
        {
            return; // This ends the program
        }

        if((s.charAt(0)=='p') && (s.charAt(1)=='i'))
        {
            System.out.print("3.14");
            replace(s.substring(2)); // Remove 1st 2 letters and send the rest of the string

        }
        else
        {
            System.out.print(s.charAt(0));
            replace(s.substring(1)); // Remove 1st letter...letter at 0th position
        }


    }


    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = s.nextLine();

        replace(str);
    }
    
}
