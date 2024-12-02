import java.util.Scanner;

class Main {

  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {

    int[][] board = createBoard();

    playerTurn(1, board);

  }
  public static int[][] createBoard() {

    int[][] board = {{0, 0, 0},
                     {0, 0, 0},
                     {0, 0, 0}};

    return board;

  }

  public static void playerTurn(int turn, int[][] board) {

    boolean playerXTurn = turn % 2 == 0;
    boolean playerOTurn = turn % 2 == 1;

    int playerCol, playerRow;

    boolean correctInput = false;

    while (!correctInput) {

      while(true) {
        try {
          System.out.print("Enter your column number (left = 1, right = 3)");

          playerCol = sc.nextInt();
          if (playerCol < 1 || playerCol > 3) {
            System.out.println("Please enter a valid value. ");
          }
          else {
            break;
          }
        } catch(Exception e) {
          System.out.println("Please enter a valid value. ");
        }
      }
      while(true) {
        try {
          System.out.print("Enter your row number (top = 1, bottom = 3)");

          playerRow = sc.nextInt();
          if (playerRow < 1 || playerRow > 3) {
            System.out.println("Please enter a valid value. ");
          }
          else {
            break;
          }
        } catch(Exception e) {
          System.out.println("Please enter a valid value. ");
        }
      }

      System.out.println(playerCol + " " + playerRow);

    }
  }
}

