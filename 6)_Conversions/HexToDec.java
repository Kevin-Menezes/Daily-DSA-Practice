import java.util.Scanner;

public class HexToDec 
{
    public static int hexToDec(String hex)
    {
        hex = hex.toUpperCase();
        int len = hex.length();

        int dnum = 0;
        int base = 1;

        // Traversing through the hex string backward coz we start multiplying from backward
        for(int i=len-1;i>=0;i--)
        {
            // If hex character is between 0 - 9
            if (hex.charAt(i) >= '0' && hex.charAt(i) <= '9') 
            {
                dnum += (hex.charAt(i) - 48) * base;  // 48 is taken coz 0 char is 48
                base *= 16;
            }
            // If hex character is between A - F
            else if(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F')
            {
                dnum += (hex.charAt(i) - 55) * base; // 55 is taken coz 65 is 'A'....and then 55 + 10 is 65
                base *= 16;
            }
            else
            {
                System.out.println("Invalid Character");
                return dnum;
            }

        }

        return dnum;
    }


    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the hex number : ");
        String hex = s.nextLine();

        System.out.println("The decimal number : "+hexToDec(hex));
    }
    
}
