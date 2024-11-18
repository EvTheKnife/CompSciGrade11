import java.util.Scanner;

public class Green6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numRestrictions = sc.nextInt();

        String[] restrictions = new String[numRestrictions * 2];

        for (int i = 0; i < numRestrictions * 2; i += 2) {
            restrictions[i] = sc.next();
            restrictions[i + 1] = sc.next();
        }
         

        sc.close();
    }    
}
