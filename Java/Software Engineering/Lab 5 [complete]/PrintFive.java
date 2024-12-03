
/**
 * This code prints Five to the terminal window five times,
 * each on its own line.
 * 
 * @author 
 * @version 
 */
public class PrintFive
{
    /**
     * Main method for our printing.
     * 
     * @param args No command line arguments required.
     */
    public static void main(String args[])
    {
        System.out.println(printFive());
    }

    /**
     * This method creates a string where the
     * word five is repeated five times.  When the
     * string is printed, each word should print on
     * its own line.
     * 
     * @return The created string.
     */
    public static String printFive()
    {
        String answer = "";
        for (int i = 0; i < 5; i++)
        {
            answer = answer + "Five\n";
        }
        return answer;
    }

}
