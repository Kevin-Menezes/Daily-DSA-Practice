
import java.util.Arrays;
import java.util.Scanner;

class SieveOfEratosthenes {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number for SOE : ");
        int n = s.nextInt();

        // SIEVE OF ERATOSTHENES
        boolean a[] = sieve(n);
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " " + a[i]);
        }

        SieveOfEratosthenes sie = new SieveOfEratosthenes();
        int p = sie.isPrime(35);
        if (p == 1) {
            System.out.println("35 is Prime");
        } else {
            System.out.println("35 is not Prime");
        }

        System.out.println("================================================");

        // POWER OF NUMBER (SIMPLE)
        System.out.println(power(2, 5));

        // POWER OF A NUMBER WITHOUT MODULO
        System.out.println(fastPower(2, 5));

        // POWER OF A NUMBER WITH MODULO
        System.out.println(fastPowerModulo(1413423, 5, 10000000));

        System.out.println("================================================");

        // Basic GCD
        System.out.println(gcdBasic(15, 27));

        // Normal GCD
        System.out.println(gcdNormal(15, 27));

        // GCD
        System.out.println(gcd(15, 27));

    }
    
    // ===================== Functions =========================

    // Normal way to find power of a number
    static int power(int a, int b) {
        int pow = 1;
        for (int i = 0; i < b; i++) {

            pow *= a;
        }
        
        return pow;
    }

    // OPTIMAL WAY OF FINDING THE ANSWER TO THE POWER OF A NUMBER
    static int fastPower(int a, int b) {
        int res = 1;

        while (b > 0) {
            if ((b & 1) != 0) // If the number is odd......2^5 = 2.2^4
            {
                res = res * a; // We multiply it only once to separate the odd.....and then go on multiplying the even times
            }

            a = a * a;
            b = b >> 1; // This means we divide by 2
        }

        return res;
    }

    // MOST OPTIMAL WAY OF FINDING THE ANSWER TO THE POWER OF A VERY LARGE NUMBER USING MODULO
    // We use the modulo to multiply with individual numbers so that if a number is very large it can be handled properly
    static long fastPowerModulo(long a, long b, long n) {
        long res = 1;

        while (b > 0) {
            if ((b & 1) != 0) // If the number is odd......2^5 = 2.2^4
            {
                res = (res % n * a % n) % n; // We multiply it only once to separate the odd.....and then go on multiplying the even times
            }

            a = (a % n * a % n) % n;
            b = b >> 1; // This means we divide by 2
        }

        return res;
    }

    // =======================================================================================================================================

    // Basic GCD
    static int gcdBasic(int a, int b) {
        
        while (b != 0) {

            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    // Normal GCD
    static int gcdNormal(int a, int b) { // 15 27

        // All 3 base conditions
        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        if (a == b) {
            return a;
        }

        if (a > b) {
            return gcdNormal(a - b, b);
        }
        return gcdNormal(a, b - a);
        
    }


    // GCD IN 2 LINES
    static int gcd(int a, int b) {
        if (b == 0)
            return a;

        System.out.println("a = " + a + "  b = " + b);

        return gcd(b, a % b);
    }

    // =======================================================================================================================================

    // SIEVE OF ERATHOSTHENES FOR FINDING PRIME NUMBERS IN A GIVEN RANGE
    static boolean[] sieve(int n) {
        boolean isPrime[] = new boolean[n + 1]; // Creating a boolean array

        Arrays.fill(isPrime, true); // We fill the entire array true
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) // i*i<=n is same as i<=Math.sqrt(n).....it goes in 2 ka multiples...then 3 ka multiples....then 4 ka multiples
        {
            for (int j = 2 * i; j <= n; j += i) { // 2..4..6 | 3..6..9 | 4..8..12..16
                isPrime[j] = false;

            }

        }

        return isPrime;
    }


    // Prime numbers are all odd numbers
    public int isPrime(int A) {

        if (A <= 1) 
        {
            return 0;
        } 
        else if (A == 2) // 2 is a prime number
        {  
            return 1;
        } 
        else if (A % 2 == 0) // even numbers
        {  
            return 0;
        } 

        for (int i = 3; i <= Math.sqrt(A); i += 2) // we check for all odd numbers
        {
            if (A % i == 0) 
            {
                return 0;
            }
        }
        return 1; // Returns 1 if it is not a prime number

    }

}