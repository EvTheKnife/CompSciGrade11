def main() -> None:

  board = create_board()
  
  for turn in range(9):

    player_input(turn, board)

    is_won = win_con(turn, board)
    
    if is_won:
      break
  
    show_board(board)


  if is_won == False:
    print("It's a draw!")

def create_board() -> list[list[int]]:
  return [[0, 0, 0],
          [0, 0, 0],
          [0, 0, 0]]


def show_board(board: list[list[int]]) -> None:

  print("\n-------------------------------------")
  print("The current board is: ")
  for i in board:
    for j in i:
      if j == 0:
        print(" _ ", end="")
      if j == 1:
        print(" X ", end="")
      if j == 2:
        print(" O ", end="")
    print()
  print("-------------------------------------\n")

def player_input(turn: int, board: list[list[int]]) -> None:
  
    player_x_turn = turn % 2 == 0

    player_o_turn = turn % 2 == 1

    correct_input = False
    while correct_input == False:

      while True:
        try:
          player_col: int = int(input("Enter your column number: (left = 1, right = 3) "))
          if player_col < 1 or player_col > 3:
            print("Please enter a valid value")
          else:
            break
        except:
          print("Please enter a valid value")

      while True:
        try:
          player_row: int = int(input("Enter your row number: (top = 1, bottom = 3) "))
          if player_row < 1 or player_row > 3:
            print("Please enter a valid value")
          else:
            break
        except:
          print("Please enter a valid value")

      temp_board: list[list[str]] = [[" _ ", " _ ", " _ "],
                                     [" _ ", " _ ", " _ "],
                                     [" _ ", " _ ", " _ "]]




      if board[player_row - 1][player_col - 1] != 0:
        print("That spot is already taken, please try again")
        correct_input = False

      

      else:
        if player_x_turn:
          temp_board[player_row - 1][player_col - 1] = " X "
        elif player_o_turn:
          temp_board[player_row - 1][player_col - 1] = " O "

        print()
        for i in temp_board:
          for j in i:
            print(j, end="")
          print()
        correct_input = input("is this the correct position? ").lower() == "y"
    
      

    if correct_input:
      if player_x_turn:
        board[player_row - 1][player_col - 1] = 1
      if player_o_turn:
        board[player_row - 1][player_col - 1] = 2



def win_con(turn: int, board: list[list[int]]) -> bool:
  won: bool = False

  player_x_turn: bool = turn % 2 == 0
  player_o_turn: bool = turn % 2 == 1
  for i in board:
    if i[0] == i[1] == i[2] and i[0] != 0:
      won = True
    if won and player_x_turn:
      print("Player X won!")
      break
    if won and player_o_turn:
      print("Player O won!")
      break

  for i in range(3):
    if board[0][i] == board[1][i] == board[2][i] and board[0][i] != 0:
      won = True
    if won and player_x_turn:
      print("Player X won!")
      break
    if won and player_o_turn:
      print("Player O won!")
      break

  if board[0][0] == board[1][1] == board[2][2] and board[0][0] != 0:
    won = True
    if won and player_x_turn:
      print("Player X won!")
    if won and player_o_turn:
      print("Player O won!")
 
  
  if board[2][0] == board[1][1] == board[0][2] and board[2][0] != 0:
    won = True
    if won and player_x_turn:
      print("Player X won!")
    if won and player_o_turn:
      print("Player O won!")

  return won



if __name__ == "__main__":
  main()