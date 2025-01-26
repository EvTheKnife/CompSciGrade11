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
	
    /*x
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
    private static int[] idkAnymore = {num0Match, num1Match, num2Match, num3Match, num4Match, num5Match};


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

        System.out.println("Numbers Matched    Number Tickets    Payout per matched ticket    Total Payout");
        System.out.println("---------------    --------------    -------------------------    ------------");

        int[] nums = {0, 1, 2, 3, 4, 5};

        double[] payout = calcPayout();
        double profit1 = calcProfit();
        for (int i = 0; i < 6; i++) {
            System.out.printf("%12d %8s", nums[i], "");
            System.out.printf("%9d %8s", idkAnymore[i], "");
            System.out.printf("%5s %,10.2f %14s", "$", payout[i], "");
            System.out.printf("%1s %,12.2f", "$", idkAnymore[i] * payout[i]);
            System.out.println();
        }
        System.out.println();
        System.out.printf("Profit: %1s%,11.2f%n", "$", profit1);

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
                idkAnymore[0]++;
                break;
            case 1: 
                idkAnymore[1]++;
                break;
            case 2:
                idkAnymore[2]++;
                break;
            case 3:
                idkAnymore[3]++;
                break;
            case 4:
                idkAnymore[4]++;
                break;
            case 5:
                idkAnymore[5]++;
                break;
        }

        //System.out.println(num0Match + " " + num1Match + " " + num2Match + " " + num3Match + " " + num4Match + " " + num5Match + " " );
    }

    public static double[] calcPayout() {

        double[] payoutList = new double[6];

        payoutList[0] = 0;
        payoutList[1] = (0.10 * numTickets) / idkAnymore[1];
        payoutList[2] = (0.12 * numTickets) / idkAnymore[2];
        payoutList[3] = (0.15 * numTickets) / idkAnymore[3];
        payoutList[4] = (0.18 * numTickets) / idkAnymore[4];
        payoutList[5] = (0.20 * numTickets) / idkAnymore[5];

        for (int i = 1; i < 6; i++) {
            if (idkAnymore[i] == 0) {
                payoutList[i] = 0;
            }
        }

        return payoutList;
    }

    public static double calcProfit() {

        double totalRevenue = numTickets;

        double[] payout = calcPayout();

        for (int i = 0; i < 6; i++) {
            totalRevenue -= payout[i] * idkAnymore[i];
        }
        
        return totalRevenue;

    }

}