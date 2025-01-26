import random
import time


def main() -> None:
    

def hit_calc():
    hit = random.randint(0, 1)
    if (hit == 0):
        return True
    elif (hit == 1):
        return False

def reload():
    print("Reloading... ")
    time.sleep(15)
    print("Done! ")

if __name__ == "__main__":
    main()