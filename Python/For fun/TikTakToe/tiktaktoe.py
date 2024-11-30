def main() -> None:

  board = create_board()
  

  for i in range(3):
    player_x(0, board)
  for i in board:
      for j in i:
        print(j, end="")
      print()

  win_con(board)


def create_board() -> list[list[int]]:
  return [[0, 0, 0],
          [0, 0, 0],
          [0, 0, 0]]



def player_x(turn: int, board: list[list[int]]) -> None:
  if turn % 2 == 0: # verify its actually player X's turn

    correct_input = False
    while correct_input == False:
    
      player_x_col: int = int(input("Enter your column number: (left = 1, right = 3) "))
      player_x_row: int = int(input("Enter your row number: (top = 1, bottom = 3) "))

      temp_board: list[list[str]] = [[" _ ", " _ ", " _ "],
                                     [" _ ", " _ ", " _ "],
                                     [" _ ", " _ ", " _ "]]
      

      if player_x_row < 1 and player_x_row > 3:
        print("That spot is invalid, please try again")
        correct_input = False
        
      
      elif player_x_col < 1 and player_x_col > 3:
        print("That spot is invalid, please try again")
        correct_input = False
        

      


      elif board[player_x_row - 1][player_x_col - 1] != 0:
        print("That spot is already taken, please try again")
        correct_input = False

      

      else:
        temp_board[player_x_row - 1][player_x_col - 1] = " X "
        print()
        for i in temp_board:
          for j in i:
            print(j, end="")
          print()
        correct_input = input("is this the correct position? ").lower() == "y"
    
    

    if correct_input:
      board[player_x_row - 1][player_x_col - 1] = 1



def player_o(turn: int, board: list[list[int]]) -> None:
  if turn % 2 == 1: # verify its actually player O's turn

    correct_input = False
    while correct_input == False:
    
      player_o_col: int = int(input("Enter your column number: (left = 1, right = 3) "))
      player_o_row: int = int(input("Enter your row number: (top = 1, bottom = 3) "))

      temp_board: list[list[str]] = [[" _ ", " _ ", " _ "],
                                     [" _ ", " _ ", " _ "],
                                     [" _ ", " _ ", " _ "]]
      
      temp_board[player_o_row - 1][player_o_col - 1] = " O "
      print()
      for i in temp_board:
        for j in i:
          print(j, end="")
        print()

      if board[player_o_row - 1][player_o_col - 1] != 0:
        print("That spot is already taken, please try again")
        correct_input = False
      else:
        correct_input = input("is this the correct position? ").lower() == "y"
    
    

    if correct_input:
      board[player_o_row - 1][player_o_col - 1] = 2




def win_con(board: list[list[int]]) -> bool:
  won: bool = False

  for i in board:
    if i[0] == i[1] == i[2]:
      won = True
    if won:
      print("Player won!")
      break
    
  for i in range(3):
    if board[0][i] == board[1][i] == board[2][i]:
      won = True
    if won:
      print("Player won!")
      break

  if board[0][0] == board[1][1] == board[2][2]:
    won = True
    print("player won!")
  
  if board[2][0] == board[1][1] == board[0][2]:
    won = True
    print("player won!")





if __name__ == "__main__":
  main()