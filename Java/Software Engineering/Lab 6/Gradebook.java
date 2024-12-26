import java.util.Scanner;

public class Gradebook {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String studentName = "";
    int n = 0;
    System.out.print("Enter the user data: ");
    
    while (true) {
    
      studentName = sc.next();

      n = sc.nextInt();     

      int average = 0;

      for (int i = 0; i < n; i++) {
        average += sc.nextInt();
      }

      if (studentName.equals("STOP") && n == 0) {
        break;
      }

      System.out.println("The average for " + studentName + " is " + (average / n));

      System.out.print("Enter the user data: ");

    }
  }
}
