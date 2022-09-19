// Write a Java Program to check Armstrong number.

// Answer:What Armstrong Number is.Armstrong number is the number which is the sum of the cubes of all its unit,tens and hundred digits for three-digit numbers.

// 153=1*1*1+5*5*5+3*3*3=1+125+27=153

// If you have a four-digit number lets say

// 1634=1*1*1*1+6*6*6*6+3*3*3*3+4*4*4*4=1+1296+81+256=1634
import java.util.Scanner;

public class Amstrong {

    static void checkAmstrong(int n) {
        
        int temp = n;
        int temp2 = n;
        int sum = 0;
        int count = 0;

        // Counting digits
        while (n > 0) {

            n = n / 10;
            count++;
        }

        // Power and sum
        while (temp > 0) {

            int rem = temp % 10;
            sum += Math.pow(rem,count);
            temp = temp / 10;
        }
        
        if (sum == temp2) {
            System.out.println("It is an Amstrong number");
        }
        else {
            System.out.println("It is not an Amstrong number");
        }

    }

    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number : ");

        int n = s.nextInt();
        checkAmstrong(n);

    }
    
}
