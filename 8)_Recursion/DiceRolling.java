// HERE WE HAVE FIND OUT THE POSSIBLE MOVES AND POSITIONS OF THE PAWN WHEN THE DICE IS ROLLED FROM 1-6
// THE PAWN CAN GO DIRECTLY TO 6 IN ONE SHOT... OR IT CAN GO FROM 1 TO 2 THEN JUMP TO 6...OR 1-4-6... AND MANY MORE POSSIBLE COMBINATIONS


import java.util.Scanner;

public class DiceRolling 
{
    public static int dice(int s,int e)
    {
        if(s>e)
        {
            return 0;
        }

        // Only 1 path followed
        if(s==e)
        {
            return 1;
        }

        int c = 0;

        // This loop will run 6 times
        for(int i=1;i<=6;i++)
        {
            c += dice(s+i,e);
            System.out.println(i+" "+c);

            if(i==6)
            {
                System.out.println("-------------------");
            }
        }

        return c;
    }

    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        
        System.out.print("Enter the start point : ");
        int s = sca.nextInt();

        System.out.print("Enter the end point : ");
        int e = sca.nextInt();

        System.out.print(dice(s,e)+" paths");


    }
}
