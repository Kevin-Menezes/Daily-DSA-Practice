// Here we implement the runnable class to perform multithreading
class Sum implements Runnable
{
    // We define the run function that is already declared in the Runnable interface
    public void run()
    {
        // We run a for loop from 1 to 10 numbers and print them
        for(int i = 1; i<=10; i++)
        {
            System.out.println(i);

        }

    }

}

public class SumOfNaturalNo
{
    // Here we define the main function that gets implicitly called when the program is executed
    public static void main(String args[])
    {
        // We create an object of the thread class that takes in the object of the Sum class as its argument
        Thread t = new Thread(new Sum());

        // Here we execute the function
        t.start();

    }
    
}
