import java.util.ArrayList;

public class NonRepeatingThrice {
    static int findUnique(ArrayList<Integer> a, int n, int k) 
    {

        byte sizeof_int = 4; // We create the bytes
        int INT_SIZE = 8 * sizeof_int; // We create 32 bytes
        int count[] = new int[INT_SIZE]; // We create a 32 byte count array

        for (int i = 0; i < INT_SIZE; i++) // This loop runs 32 times
        {
            for (int j = 0; j < a.size(); j++) // This runs till the size of the array
            {
                if ((a.get(j) & (1 << i)) != 0) // First it checks all the 0th position bit of all the numbers in the array one by one
                                                
                    count[i] += 1; // Then it moves to the 1st bit of all the numbers in the array.....similarly 2nd ......32nd
                                
            }

        }

        int res = 0;
        for (int i = 0; i < INT_SIZE; i++) // This runs 32 times
            res += (count[i] % 3) * (1 << i); // This returns the bit value which keeps on getting added

        // if it is divisible by 3 then mod comes 0 and then 0*1 is 0

        return res;


        // -------------------------------------------------------------------------------------------------------------------------


        // // Create a count array to store count of
        // // numbers that have a particular bit set.
        // // count[i] stores count of array elements
        // // with i-th bit set.
        // byte sizeof_int = 4;
        // int INT_SIZE = 8 * sizeof_int;
        // int count[] = new int[INT_SIZE];

        // // AND(bitwise) each element of the array
        // // with each set digit (one at a time)
        // // to get the count of set bits at each
        // // position
        // for (int i = 0; i < INT_SIZE; i++)
        //     for (int j = 0; j < n; j++)
        //         if ((a[j] & (1 << i)) != 0)
        //             count[i] += 1;

        // // Now consider all bits whose count is
        // // not multiple of k to form the required
        // // number.
        // int res = 0;
        // for (int i = 0; i < INT_SIZE; i++)
        //     res += (count[i] % k) * (1 << i);
        // return res;
    }

    public static void main(String args[]) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        a.add(3);
        a.add(6);
        a.add(8);
        a.add(1);
        int n = a.size();
        int k = 3;
        System.out.println(findUnique(a, n, k));
    }

}
