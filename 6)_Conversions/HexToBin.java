import java.util.HashMap;
import java.util.Scanner;

public class HexToBin 
{
    public static String hexToBin(String hex)
    {
        hex = hex.toUpperCase();
        String bnum = "";

        // Putting all the numbers and their binary equivalents in the hashmap
        HashMap<Character,String> hm = new HashMap<Character,String>();
        hm.put('0',"0000");
        hm.put('1',"0001");
        hm.put('2',"0010");
        hm.put('3',"0011");
        hm.put('4',"0100");
        hm.put('5',"0101");
        hm.put('6',"0110");
        hm.put('7',"0111");
        hm.put('8',"1000");
        hm.put('9',"1001");
        hm.put('A',"1010");
        hm.put('B',"1011");
        hm.put('C',"1100");
        hm.put('D',"1101");
        hm.put('E',"1110");
        hm.put('F',"1111");

        char c;

        // Iterate through the hex string
        for(int i = 0;i<hex.length();i++)
        {
            // Extracting each character from the hex string
            c = hex.charAt(i);

            // Checking if our hashmap contains that character
            if(hm.containsKey(c))
            {
                bnum += hm.get(c); // Gets the value
            }
            else
            {
                System.out.println("Invalid Character");
                return bnum;
            }

        }
        return bnum;

    }


    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the hex number : ");
        String hex = s.nextLine();

        System.out.println("The binary number : "+hexToBin(hex));
    }
    
}
