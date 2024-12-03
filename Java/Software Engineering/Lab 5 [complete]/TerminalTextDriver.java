import java.util.Scanner;

/*
 * 12/03/24
 * Chell, David H
 * Prints hello an inputted amount of times
 */
public class TerminalTextDriver {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("How many times to output \"Hello\"? ");

    int times = sc.nextInt();

    for (int i = 0; i < times; i++) {
      TerminalText.printHello();
    }
  }
}
