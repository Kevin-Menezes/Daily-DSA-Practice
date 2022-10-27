import java.util.Scanner;

// INPUT THE LINE FROM USER
// WHEN THERE IS A BLANK SPACE ADD THAT WORD TO A LIST
// ITERATE THROUGH THE LIST AND THEN FIND MAX AND MIN LENGTH

public class LargestSmallestWord {


    static void getMaxMin(String line) {
        
        String word = "", small = "", large = "";
        String[] words = new String[line.length()];
        int length = 0;

        // Iterate through the string
        for (int i = 0; i < line.length(); i++) {

            if (line.charAt(i) != ' ') {

                word += line.charAt(i);

            } else {

                words[length] = word;
                length++;
                word = "";

            }

        }
        
        small = large = words[0];
        System.out.println(words.length);
        System.out.println(length);

        for (int i = 0; i < length; i++) {

            if (large.length() < words[i].length()) {
                large = words[i];
            }

            if (small.length() > words[i].length()) {
                small = words[i];
            }
        }
        
        System.out.println("Max : "+large+" Min : "+small);

    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the line : ");
        String line = s.nextLine();
        line = line + " ";

        getMaxMin(line);

    }
    
}
