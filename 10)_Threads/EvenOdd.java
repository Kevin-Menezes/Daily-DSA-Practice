// Here we implement the runnable class to perform multithreading
class Sum implements Runnable
{
    public void run()
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.println(i);
        }

    }
}

// Here we implement the runnable class to perform multithreading
class Even implements Runnable
{
    // We define the run function that is already declared in the Runnable interface
    public void run()
    {
        System.out.println();

        // We run a for loop from 1 to 10 numbers and check if they are divisible by 2 
        // If they are divisible by 2 we print the even numbers
        for(int i = 1; i<=10; i++)
        {
            if(i%2==0){System.out.println(i);}        
        }
        System.out.println();
    }
}

// Here we implement the runnable class to perform multithreading
class Odd implements Runnable
{
    public void run()
    {
        // We run a for loop from 1 to 10 numbers and check if they are not divisible by 2 
        // If they are not divisible by 2 we print the odd numbers
        for(int i = 1; i<=10; i++)
        {
            if(i%2!=0){System.out.println(i);}        
        }
        
    }
}


public class EvenOdd 
{
    // Here we define the main function that gets implicitly called when the program is executed
    public static void main(String args[]) throws InterruptedException
    {
        // We create 3 objects of the thread class that takes in the object of the Sum, Even and Odd classes as its argument
        Thread t1 = new Thread(new Sum());
        Thread t2 = new Thread(new Even());
        Thread t3 = new Thread(new Odd());

        t1.start();
        Thread.sleep(3000); // We use sleep function so that the threads get systematically executed and not overlap each other
        t2.start();
        Thread.sleep(3000);
        t3.start();
    }
}
