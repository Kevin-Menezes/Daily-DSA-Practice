import java.util.Scanner;

public class BacktrackingPermutation 
{

    public static String swap(String s,int l,int r)
    {
        char temp;

        char chArr[] = s.toCharArray();
        temp = chArr[l];
        chArr[l] = chArr[r];
        chArr[r] = temp;
        return String.valueOf(chArr);
    }

    public static void permute(String s , int l, int r)
    {
        if(l==r)
        {
            System.out.println(s);
        }
        else
        {
            for(int i=l;i<=r;i++)
            {
                s = swap(s,l,i);
                permute(s,l+1,r);
                s = swap(s,l,i);
            }
        }
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string : ");

        String str = s.nextLine();

        int n = str.length();

        permute(str,0,n-1);
    }
    
}
