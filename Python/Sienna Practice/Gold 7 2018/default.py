def main() -> None:
    numCol = int(input("Col "))
    numRow = int(input("Row "))

    numNums = int(input("Number nums "))

    numbers = []

    for i in range(numNums):
        pos = input().split()
        numbers.append((pos[0], pos[1]))
        numbers.append((pos[2], pos[3]))
    

if __name__ == "__main__":
    main()