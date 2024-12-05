import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * (Add your description here.)
 *
 * @author
 * @version
 */
public class Lottery {

    /*
     * Private global static (class) variables.
     * 
     * These variables can be used anywhere in this class.  You do not need to 
     * pass them as parameters between methods.
     * 
     * You may not remove or add any of these variables.
     */

    private static Random rand = new Random();

    //The 5 winning lottery numbers.
    private static int ball1, ball2, ball3, ball4, ball5;

    //The number of tickets that have 0 matches, 1 match, ..., 5 matches.
    private static int num0Match, num1Match, num2Match, num3Match, num4Match, num5Match;

    /**
     * This method is used to run the lottery. DO NOT EDIT THIS METHOD.
     *
     * @param args No command line arguments are necessary.
     */
    public static void main(String args[]) {
        setWinningNumbers();


        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the input file name:  ");
        String fileName = sc.nextLine();
        sc.close();

        try {
            readInData(fileName);
        } catch (FileNotFoundException fne) {
            System.out.println("The input data file cannot be found.");
            System.exit(0);
        }

        printOutput();
    }

    /**
     * The method sets the global static (class) variables ball1, ball2, ...,
     * ball5 to random values in [1, 39]. Each of the 5 numbers selected must be
     * unique. E.g.,
     *
     * {17, 9, 28, 12, 1}
     *
     * is a valid selection, but
     *
     * {17, 9, 28, 12, 17}
     *
     * is not a valid selection because 17 was selected twice.
     */
    private static void setWinningNumbers() {
        
        ball1 = rand.nextInt(1, 5);
        ball2 = rand.nextInt(1, 5);
        ball3 = rand.nextInt(1, 5);
        ball4 = rand.nextInt(1, 5);
        ball5 = rand.nextInt(1, 5);

        int[] balls = {ball1, ball2, ball3, ball4, ball5};
        ArrayList<Integer> newBalls = new ArrayList<Integer>();
        while (newBalls.size() > 5) {
            for (int i = 0; i < 5; i++) {
                if (!newBalls.contains(balls[i])) {
                    newBalls.add(balls[i]);
                } else {
                    balls[i] = rand.nextInt(1, 5);
                    System.out.println("Dupe");
                    break;
                }
            }
        }

        for (int i : balls) {
            System.out.println(i);
        }

    }

    /**
     * This method reads all of the lottery tickets from the input file. As each
     * ticket is read, the number of matches is recorded by updating the
     * appropriate global static (class) variable. E.g., if the ticket read
     * matches 3 of the winning numbers, num3Match is incremented by 1.
     *
     * @param fileName The name of the input file. This file must be a CSV file
     * in the format expected for this project.
     */
    private static void readInData(String fileName) throws FileNotFoundException {
        
    }

    /**
     * This method prints the output formatted as shown in the example output.
     */
    private static void printOutput() {
        //Add your code here.
    }
}
