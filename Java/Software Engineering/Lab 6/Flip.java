import java.util.Random;

public class Flip {
  public static void main(String[] args) {
    
    for (int i = 0; i < 10; i++) {
      System.out.println(flipACoin());

    }

  }

  public static String flipACoin() {
   
    String[] coin = {"Heads", "Tails"};

    Random rand = new Random();

    return coin[rand.nextInt(2)];
  }
}
