import java.util.Scanner;

class Main {

  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {

    boolean isWon = false;

    int[][] board = createBoard();

    for (int turn = 0; turn < 9; turn++) {
      playerTurn(turn, board);

      isWon = winCon(turn, board);

      if (isWon) {
        break;
      }
      showBoard(board);
    }
    if (!isWon) {
      System.out.println("It's a draw!");
    }



  }
  public static int[][] createBoard() {

    int[][] board = {{0, 0, 0},
                     {0, 0, 0},
                     {0, 0, 0}};

    return board;

  }

  public static void showBoard(int[][] board) {

    System.out.println("\n-------------------------------------");
    System.out.println("The current board is: ");
    
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (board[i][j] == 0) {
          System.out.print(" _ ");
        } else if (board[i][j] == 1) {
          System.out.print(" X ");
        } else if (board[i][j] == 2) {
          System.out.print(" O ");
        }
      }
      System.out.println();
    }
    System.out.println("-------------------------------------\n");
  }


  public static void playerTurn(int turn, int[][] board) {

    boolean playerXTurn = turn % 2 == 0;
    boolean playerOTurn = turn % 2 == 1;

    int playerCol = 0;
    int playerRow = 0;

    boolean correctInput = false;

    while (!correctInput) {

      while(true) {
        try {
          System.out.print("Enter your column number (left = 1, right = 3) ");

          playerCol = Integer.parseInt(sc.nextLine());
          
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
          System.out.print("Enter your row number (top = 1, bottom = 3) ");

          playerRow = Integer.parseInt(sc.nextLine());

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
      
      String[][] tempBoard = {{" _ ", " _ ", " _ "},
                              {" _ ", " _ ", " _ "},
                              {" _ ", " _ ", " _ "}};
      
      

      if (board[playerRow - 1][playerCol - 1] != 0) {
        System.out.println("That spot is already taken, please try again! ");
        correctInput = false;
      } else {
        if (playerXTurn) {
          tempBoard[playerRow - 1][playerCol - 1] = " X ";
        } if (playerOTurn) {
          tempBoard[playerRow - 1][playerCol - 1] = " O ";
        }
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
            System.out.print(tempBoard[i][j]);
          }
          System.out.println();
        }

        System.out.print("Is this the correct position? (Y / N) ");
        correctInput = sc.nextLine().equalsIgnoreCase("y");
        
        
      }
    }

    if (correctInput) {
      if (playerXTurn) {
        board[playerRow - 1][playerCol - 1] = 1;
      }
      if (playerOTurn) {
        board[playerRow - 1][playerCol - 1] = 2;
      }
    }

  }


  public static boolean winCon(int turn, int[][] board) {
  
    boolean playerXTurn = turn % 2 == 0;
    boolean playerOTurn = turn % 2 == 1;

    boolean won = false;

    for (int i = 0; i < 3; i++) {
      if (board[i][0] == board [i][1] && board[i][1] == board[i][2] && board[i][0] != 0) {
        won = true;
        break;
      }
    }
    for (int i = 0; i < 3; i++) {
      if (board[0][i] == board [1][i] && board[1][i] == board[2][i] && board[0][i] != 0) {
        won = true;
        break;
      }
    }
    if (board[0][0] == board [1][1] && board[1][1] == board[2][2] && board[0][0] != 0) {
      won = true;
    }
    if (board[2][0] == board [1][1] && board[1][1] == board[0][2] && board[2][0] != 0) {
      won = true;
    }

    if (won) {
      if (playerXTurn) {
        System.out.println("Player X won!");
      } else if (playerOTurn) {
        System.out.println("Player O won!");
      }
    }
    return won;

  }

}

