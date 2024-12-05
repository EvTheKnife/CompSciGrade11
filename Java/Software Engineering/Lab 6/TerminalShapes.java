import java.util.Scanner;

public class TerminalShapes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("What size would you like? ");
    int size = sc.nextInt();

    printRect(size);

    printTriangle(size);

    printPyramid(size);

  }

  public static void printRect(int size) {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size * 2; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
  public static void printTriangle(int size) {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void printPyramid(int size) {
    for (int i = 0; i < size + 1; i++) {
      for (int j = size; j > i; j--) {
        System.out.print(" ");
      }
      for (int j = 1; j < i * 2; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  

}
