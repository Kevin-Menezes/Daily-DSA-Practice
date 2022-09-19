import java.util.Scanner;

public class Prime {

    
    static void printPrime(int n) {
        
        System.out.println("Prime numbers are : ");
        System.out.println("2 is a prime number");
        System.out.println("3 is a prime number");

        boolean flag;

        for (int i = 4; i <= n; i++) {

            flag = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i + " is a prime no.");
            }
            else {
                System.out.println(i + " is not a prime no.");
            }
                
        }
    }

    public static void main(String args[]) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = s.nextInt();
        printPrime(n);
    }
    
}
