
import java.util.Scanner;

/**
 * Lab 6, Part 3
 *
 * @author
 * @version
 */
public class Lab6Part3 {

    /**
     * This program will continually read in names from the keyboard, and then
     * respond with the output
     *
     * HELLO, <input name>.
     *
     * where <input name> is the input.
     *
     * The program will stop if the input is the word STOP.
     *
     * @param args No command line arguments necessary.
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please type in a name:  ");
        String nameInput = sc.nextLine();

        while (!nameInput.equals("STOP")) {
            System.out.println("Hello, " + nameInput + ".");
            System.out.print("Please type in a name:  ");
            nameInput = sc.nextLine();
        }
    }

}
