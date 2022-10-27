// These are all arrays below

import java.util.Scanner;

class demo {
    public int rainTrap(int a[]) {
        int water = 0;
        int n = a.length;

        // Creating 2 list from both sides
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = a[0]; // First 

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], a[i]); // Always take i-1 when going from left to right
        }

        right[n - 1] = a[n - 1]; // Last

        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], a[i]); // Always take i+1 when going from right to left
        }

        // Traversing thorugh all the 3 arrays
        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - a[i];
        }
        
        return water;

    }
}

public class RainwaterTrap extends demo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of columns you want to place to trap the rainwater : ");
        int n = s.nextInt();

        int l[] = new int[n];

        System.out.println("Enter the height of the columns for the rainwater to be trapped : ");
        for (int i = 0; i < n; i++) {
            l[i] = s.nextInt();
        }

        // Using inheritance here
        RainwaterTrap r = new RainwaterTrap();
        int a = r.rainTrap(l);
        System.out.println("The amount of water trapped is " + a);

    }
    

}
