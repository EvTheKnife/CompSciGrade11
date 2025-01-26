LOG_NAME = "Python/School Projects/Health Project/log_file.txt" # replace to 'log_file.txt' when finished
log_file = open(LOG_NAME, "r+") 

first_level = "first_level.txt"
second_level_list = ["SecondLevel_1-1.txt", "SecondLevel_1-2.txt", "SecondLevel_1-3.txt"]
third_level_list = [["ThirdLevel_1-1/", ["ThirdLevel_1-1-1.txt", "ThirdLevel_1-1-2.txt"]], 
					["ThirdLevel_1-3/", ["ThirdLevel_1-3-1.txt", "ThirdLevel_1-3-2.txt", "ThirdLevel_1-3-3.txt"]]]
path_list = ["Python/School Projects/Health Project/ChoiceTree/FirstLevel/", "Python/School Projects/Health Project/ChoiceTree/SecondLevel/", "Python/School Projects/Health Project/ChoiceTree/ThirdLevel/", ]

first_choices = ["As much time as possible (1)", "Cry and sleep (2)", "Avoid him (3)"]
second_choices = [["Take a break (1)", "Push through (2)"], ["Miss out on time and regret it (END)"], ["Turn down and leave (1)", "Talk to him (2)", "Reluctantly join in (3)"]]
ending_list = [["Didn't spend as much time as you'd like (END)", "Fall asleep in class (END)"], [""], ["Confusion and depression (END)", "Emotionally healed after talking (END)", "Confusion and depression (END)"]]


choice_lvl_2 = -1
choice_lvl_3 = -1
path_end = False

def main() -> None:	
	
	
	main_screen_choice = main_screen()
	if (main_screen_choice == 1):
		for i in range(1, 4):
			seek_file(i)
			
			if (i > 1 and (choice_lvl_2 == 2 or i == 3)):
				if (choice_lvl_2 == 2):
					log_progress(first_choices[choice_lvl_2 - 1], 	second_choices[1][0], "")
					return 0
				elif (i == 3):
					log_progress(first_choices[choice_lvl_2 - 1], second_choices[choice_lvl_2 - 1][choice_lvl_3 - 1], ending_list[choice_lvl_2 - 1][choice_lvl_3 - 1])
					return 0
	elif (main_screen_choice == 2):
		print("\n" + log_file.read())
		log_file.seek(0, 0)
		return 0
	elif (main_screen_choice == 3):
		print("Buh-Bye!")
		return 1
	else:
		print("Enter a valid option")
		return 0
	
	
	
def main_screen() -> int:
	print('Welcome to "Choose Your Own Adventure"')
	
	print("\n1. Start")
	print("2. View a log of the paths You've Chosen")
	print("3. Quit")
	
	return int(input("\n\nWhat would you like to do? "))
	
def log_progress(option_1, option_2, ending) -> None:
	content = log_file.readlines()
	if (ending == ""):
		options_add = option_1 + " -> " + option_2
	else: 
		options_add = option_1 + " -> " + option_2 + " -> " + ending

	if (options_add not in content):
		log_file.write("\n" + options_add)
	
	log_file.seek(0, 0)
		
def track_plays() -> int:
	return len(log_file.readlines())
		
def pick_option() -> int:
	return int(input("What do you do? "))
	
def seek_file(level):
	if (level == 1):
		print()
		choice_file = open(path_list[0] + first_level, "r")
		print(choice_file.read())
	elif (level == 2):
		global choice_lvl_2
		choice_lvl_2 = pick_option() 
		print()
		choice_file = open(path_list[1] + second_level_list[choice_lvl_2 - 1] , "r")
		print(choice_file.read())
	elif (level == 3 ):
		global choice_lvl_3
		choice_lvl_3 = pick_option()
		print()
		if (choice_lvl_2 == 1):
			choice_file = open(path_list[2] + third_level_list[0][0] + third_level_list[0][1][choice_lvl_3 - 1])
		elif (choice_lvl_2 == 3):
			choice_file = open(path_list[2] + third_level_list[1][0] + third_level_list[1][1][choice_lvl_3 - 1])
		print(choice_file.read())
		
	choice_file.close()


	
if __name__ == "__main__":
	
	run = True
	while (run):
		main_func = main()
		if main_func == 0:
			run = input("Would you like to play again? (Y/N) ").lower() == "y"
			print("\n")
		elif main_func == 1:
			run = False
	
log_file.close()
