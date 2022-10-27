import java.util.Scanner;

public class MaxOccurenceOfLetter {

    public static void main(String[] args) {
        
        // Input the word
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String str = s.next();
        str = str.toLowerCase();

        // Mark alphabet occurences in array
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {

            arr[str.charAt(i) - 'a']++;
        }
        
        int max = 0;
        char ans = 'a'; 

        // Iterate through the letter array and find max number
        for (int i = 0; i < 26; i++) {

            if (arr[i] > max) {
            
                max = arr[i];
                ans = (char) ('a' + i);
           }

        }
        
        System.out.println("The letter "+ans+" is repeated the most that is "+max+" times.");

    }
    
}
