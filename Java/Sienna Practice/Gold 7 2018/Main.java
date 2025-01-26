import java.util.Scanner;

class Main {

    static Scanner sc = new Scanner(System.in);

    public static int numCols, numRows, numNums;
    public static int[][][] numPos;
    public static int[][] grid;

    public static void main(String[] args) {

        inputs();

        grid();

    }
    public static void inputs() {
        System.out.print("Enter the number of columns ");
        numCols = sc.nextInt();
        System.out.print("Enter the number of rows ");
        numRows = sc.nextInt();

        System.out.print("Enter the number of numbers ");
        numNums = sc.nextInt();

        numPos = new int[numNums][2][2];

        for (int i = 0; i < numNums; i++) {
            System.out.println("Staring row, Starting col, Ending row, Ending col");
            numPos[i][0][0] = sc.nextInt() - 1; // [0][0] = Row position of starting num
            numPos[i][0][1] = sc.nextInt() - 1; // [0][1] = Column position of starting num
            numPos[i][1][0] = sc.nextInt() - 1; // [1][0] = Row position of ending num
            numPos[i][1][1] = sc.nextInt() - 1; // [1][1] = Column position of starting num
        }
    }
    public static void grid() {

        grid = new int[numRows][numCols];        

        for (int i = 1; i <= numNums; i++) {
            switch (i) {
                case 1 -> {
                    grid[numPos[0][0][0]][numPos[0][0][1]] = 1;
                    grid[numPos[0][1][0]][numPos[0][1][1]] = 1;
                }
                case 2 -> {
                    grid[numPos[1][0][0]][numPos[1][0][1]] = 2;
                    grid[numPos[1][1][0]][numPos[1][1][1]] = 2;
                }
                case 3 -> {
                    grid[numPos[2][0][0]][numPos[2][0][1]] = 3;
                    grid[numPos[2][1][0]][numPos[2][1][1]] = 3;
                }
                case 4 -> {
                    grid[numPos[3][0][0]][numPos[3][0][1]] = 4;
                    grid[numPos[3][1][0]][numPos[3][1][1]] = 4;
                }
                case 5 -> {
                    grid[numPos[4][0][0]][numPos[4][0][1]] = 5;
                    grid[numPos[4][1][0]][numPos[4][1][1]] = 5;
                }
            }
        }

        for (int i = 0; i < numCols; i++) {
            for (int j = 0; j < numRows; j++) {
                System.out.print(grid[j][i]);
            }
            System.out.println();
        }

    }

}   