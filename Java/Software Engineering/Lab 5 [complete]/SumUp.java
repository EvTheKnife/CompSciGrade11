import java.util.Scanner;
/**
 * This program adds the first n positive integers together
 * and prints this sum to the terminal window.  The value n is entered
 * from the keyboard.
 * 
 * @author  
 * @version 
 */
public class SumUp
{
    /**
     * Prompt the user for an integer, n, and prints the sum of the first
     * n positive integers.
     * 
     * @param args No command line arguments required.
     */
    public static void main(String args[])
    {
        Scanner sInput = new Scanner(System.in);
        int n = sInput.nextInt();

        System.out.println("The sum of the first " + n + " integers is " + sum(n));

        sInput.close();
    }

    /**
     * This method adds the integers [1, upperBound]
     * and returns the sum.
     * 
     * @return The sum of the integers in [1, upperBound].
     */
    public static int sum(int upperBound)
    {
        int answer = 0;

        for (int i = 1; i <= upperBound; i++)
        {
            answer = answer + i;
        }

        return answer;
    }
}
