import java.util.Scanner;

public class Gradebook {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.print("Enter the user data: ");
    
    
    String studentName = sc.next();

    int n = sc.nextInt();

    int[] grades = new int[n];
    
    int average = 0;

    for (int i = 0; i < n; i++) {
      grades[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      average += grades[i];
    }

    System.out.println("\nThe average for " + studentName + " is" + (average / n));

  }
}
