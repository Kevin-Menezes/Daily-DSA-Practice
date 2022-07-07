import java.util.Scanner;

public class LinearSearch {

    public static void linearSearch(int a[],int k)
    {
        for (int i = 0; i < a.length; i++) {
            if(a[i]==k)
            {
                System.out.println("Element " + k + " found at location " + (i+1));
                return;
            }
        }
    }

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the limit of the array : ");
        int n = s.nextInt();

        int array[] = new int[n]; // An array has a fixed size

        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        System.out.print("Enter the element to be found out : ");
        int k = s.nextInt();

        linearSearch(array, k);

    }
    
}
