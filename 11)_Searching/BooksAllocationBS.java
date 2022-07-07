// Some books are there in the array with certain amount of pages
// k = number of students going to read those books
// We have to distribute the books to those students in such a way that we minimise the maximum number of pages to be read by them
// We have to give the books to the students in continuous order of the array

import java.util.Scanner;

public class BooksAllocationBS {

    static boolean isFeasible(int a[], int k, int res) {
        
        int student = 1; // We check for how many students mid is feasible
        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            if ((sum + a[i]) > res) {
                student++;
                sum = a[i];
            } else {
                sum += a[i];
            }
        }
        return student <= k;
    }

    static int maxOf(int a[]) {

        int max = a[0];

        for (int i = 1; i < a.length; i++) {

            max = Math.max(a[i], max);
        }
        return max;
    }
    
    static int sumOf(int a[]) {
        
        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            sum += a[i];
        }
        return sum;
    }

    static int minPages(int a[], int key) {
        
        int min = maxOf(a); // The maximum number in the array is the minimum
        int max = sumOf(a); // THe sum of all the elements in the array is the maximum
        int res = 0;

        while (min <= max) {

            int mid = (min + max) / 2;

            if (isFeasible(a, key, mid)) {

                res = mid; // If the mid is feasible we put it in result and now repeat the same process for the result
                max = mid - 1; // pages could be more minimum hence we minus 1 from the result
            } 
            else {

                min = mid + 1; 
            }
        }
        return res;
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

        System.out.print("Enter the number of students : ");
        int k = s.nextInt();

        int pgs = minPages(array, k);

        System.out.println("The minimum pages are "+pgs);
    }
    
}
