
import java.util.Scanner;

/**
 * This program reads integers from the keyboard until a 0 is read. Then, this
 * program prints the sum of the positive integers read.
 *
 * @author
 * @version
 */
public class SumUp {

    public static void main(String args[]) {

        Scanner sInput = new Scanner(System.in);
        int total = 0;
        int inputNumber;

        System.out.print("Type in a number => ");
        inputNumber = sInput.nextInt();

        while (inputNumber != 0) {
            total += inputNumber;
            System.out.print("Type in a number => ");
            inputNumber = sInput.nextInt();
        }

        System.out.println("The total is " + total + ".");
        sInput.close();
    }
}
