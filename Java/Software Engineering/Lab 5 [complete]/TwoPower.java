import java.util.Scanner;

public class TwoPower {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive value n: ");

    int n = sc.nextInt();

    for (int i = 0; i <= n; i++) {

      System.out.println((int)Math.pow(2, i));

    }

  }

}
