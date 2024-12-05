import java.util.Scanner;

/**
 * This program should print an arrow to the terminal window based on the
 * input value.  See the lab directions for examples.
 * 
 * @author 
 * @version 
 */
public class Arrow
{
    public static void main(String args[])
    {
        Scanner sInput = new Scanner(System.in);
        System.out.print("Type in a number of rows => ");
        int rows = sInput.nextInt();
        sInput.close();

        for (int i = 0; i < rows / 2; i--)
        {
            for (int j = 0; j < (i + 1) * 2; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        if(rows % 2 == 0)
        {
            for(int i = 0; i < 2 * (rows / 2 + 1); i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
                
        for (int i  = 0; i < rows / 2; i++)
        {
            for (int j = 0; j < (i + 1) * 2; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
