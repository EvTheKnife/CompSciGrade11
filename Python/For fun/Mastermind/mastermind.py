import random as rand

def main():
    board = make_board()
    print(make_key())
    


def make_board() -> list[list[str]]:
		return [[None, None, None, None],
    				[None, None, None, None],
            [None, None, None, None],
            [None, None, None, None],
            [None, None, None, None],
            [None, None, None, None],
            [None, None, None, None],
            [None, None, None, None],
            [None, None, None, None],
            [None, None, None, None],
            [None, None, None, None],
            [None, None, None, None],
            [None, None, None, None]]

def assign_color(colorNum: int) -> str:
    color_dict = {
    		1: "Red",
        2: "Blue",
        3: "Green",
        4: "Yellow",
        5: "Black",
        6: "White"}

    return color_dict.get(colorNum, "Invalid Color")

def make_key() -> list[str]:
   
	
	
	return 0

main()
