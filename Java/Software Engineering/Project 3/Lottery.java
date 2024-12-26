import java.io.File;
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

    private static int numTickets = 0;

    private static ArrayList<Integer> balls = new ArrayList<>();


    /**
     * This method is used to run the lottery. DO NOT EDIT THIS METHOD.
     *
     * @param args No command line arguments are necessary.
     */
    public static void main(String args[]) {
        setWinningNumbers();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the input file name: ");
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
          
        // I kinda stole this code from David, with his permission
        // -Chell December 11                   
        
        int i = 0;

        int randInt = rand.nextInt(1, 40);

        while (i < 5) {
            if (!balls.contains(randInt)) {
                balls.add(randInt);
                i++;
            }
            randInt = rand.nextInt(1, 40);
        }



        for (int j = 0; j < 5; j++) {
            // System.out.println(balls.get(j));
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
    @SuppressWarnings("ConvertToTryWithResources")
    private static void readInData(String fileName) throws FileNotFoundException {
        



        int ticket1, ticket2, ticket3, ticket4, ticket5;
        try {

            Scanner fileSc = new Scanner(new File(fileName));

            while (fileSc.hasNext()) {
                ticket1 = fileSc.nextInt();
                ticket2 = fileSc.nextInt();
                ticket3 = fileSc.nextInt();
                ticket4 = fileSc.nextInt();
                ticket5 = fileSc.nextInt();
                //System.out.println("Tickets: " + ticket1 + " " + ticket2 + " " + ticket3 + " " + ticket4 + " " + ticket5);

                numTickets++;

                matches(ticket1, ticket2, ticket3, ticket4, ticket5);

            }
        fileSc.close();       
        } catch (Exception e) {
            System.out.println("The input data file cannot be found.");
            System.exit(0);
        }
        
    }

    /**
     * This method prints the output formatted as shown in the example output.
     */
    private static void printOutput() {
        System.out.print("\f");
        System.out.print("The winning numbers are: " );
        for (int j = 0; j < 5; j++) {
            System.out.print(balls.get(j));
            System.out.print(" ");
        }

        System.out.println("\n");

        System.out.printf("Number of tickets played:  %,d %n%n", numTickets);

        
        
    }

    public static void matches(int t1, int t2, int t3, int t4, int t5) {
        
        int numMatch = 0;

        int[] tickets = {t1, t2, t3, t4, t5};

        for (int i : tickets) {
            if (balls.contains(i)) {
                numMatch++;
            }
        }

        switch (numMatch) {
            case 0:
                num0Match++;
                break;
            case 1: 
                num1Match++;
                break;
            case 2:
                num2Match++;
                break;
            case 3:
                num3Match++;
                break;
            case 4:
                num4Match++;
                break;
            case 5:
                num5Match++;
                break;
        }

        //System.out.println(num0Match + " " + num1Match + " " + num2Match + " " + num3Match + " " + num4Match + " " + num5Match + " " );
    }
}
