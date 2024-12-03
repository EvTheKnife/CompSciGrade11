import java.util.Scanner;


/*
 * 12/03/24
 * Chell, David H
 * Splits up words with "-"
 */
public class WordSplit {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine().toUpperCase();

    for (int i = 0; i < input.length(); i++) {

      if (i == input.length() - 1) {
        System.out.print(input.charAt(i)+"");
      }
      else {
        System.out.print(input.charAt(i) + "-");
      }

    }

  }

}
