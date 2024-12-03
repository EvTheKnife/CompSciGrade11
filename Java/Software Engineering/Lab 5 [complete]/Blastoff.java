/**
 * This code prints 10 9 8 7 6 5 4 3 2 1 Blastoff!!!
 * to the terminal window, all on one line with spaces 
 * in between the numbers and Blastoff!!!
 * 
 * @author 
 * @version 
 */
public class Blastoff
{
    /**
     * Main method for our class.
     * 
     * @param args No command line arguments required.  
     */
    public static void main(String args[])
    {
        System.out.println(blastoff());
    }

    /**
     * Attempts to return the string "10 9 8 7 6 5 4 3 2 1 Blastoff!!!"
     *
     * @return String with contents 10 9 8 7 6 5 4 3 2 1 Blastoff!!!
     */
    public static String blastoff()
    {
        String answer = "10 ";

        for (int x = 9; x >= 1; x--)
        {
            answer = answer + x + " ";
            
        }
        answer = answer + "Blastoff!!!";

        return answer;
    }    
}
