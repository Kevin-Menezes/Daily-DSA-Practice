import java.util.Scanner;
import java.util.Stack;

public class ParanthesisMatching {

    // Function to check if the opening and closing brackets are matching or not
    static boolean isParanthesisMatching(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if (isOpening(c)) { // If the character is an opening bracket symbol

                s.push(c); // Push it onto the stack
            } else { // If its a closing bracket

                if (s.isEmpty()) {
                    return false;
                } else if (!isMatching(s.peek(), c)) { // If opening and closing don't match
                    return false;
                } else
                    s.pop(); // If they match we remove the opening bracket from the stack

            }
        }
        return s.isEmpty();

    }
    
    // Function to check if the opening bracket is on of these 3
    static boolean isOpening(char c) {
        return c == '(' || c == '[' || c == '{';
    }
    
    // Function to check if both the brackets are of similar type
    static boolean isMatching(char a, char b) {
        return (a == '(' && b == ')') ||
                (a == '[' && b == ']') ||
                (a == '{' && b == '}');
    }

    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = s.nextLine();

        boolean check = isParanthesisMatching(str);
        if (check) {
            System.out.println("Matching paranthesis!");
        }
        else {
            System.out.println("Paranthesis not matching!");
        }

    }
    
}
