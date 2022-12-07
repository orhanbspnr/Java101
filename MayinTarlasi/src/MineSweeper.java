import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int[][] map;
    int[][] board;
    int row, col;
    int maxMineCount;
    boolean isGame = true;

    Random rnd = new Random();
    Scanner scan = new Scanner(System.in);

    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        map = new int[row][col];
        board = new int[row][col];
        maxMineCount = row * col / 4;

    }

    public void run() {
        int win = 0;
        prepare();
        System.out.println("Mayınların Konumu");
        print(map);
        System.out.println("=========================");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        while (isGame) {
            System.out.print("Satır Giriniz : ");
            int selRow = scan.nextInt();
            System.out.print("Sütun Giriniz : ");
            int selCol = scan.nextInt();
            if (selRow < 0 || selCol < 0 || selRow > row - 1 || selCol > col - 1) {
                System.out.println("Geçerli bir konum girmediniz !");
                break;
            } else if (map[selRow][selCol] == 0) {

                if ((selRow > 0) && (map[selRow - 1][selCol] == 1)) {
                    board[selRow][selCol]++;
                }
                if ((selCol > 0) && (map[selRow][selCol - 1] == 1)) {
                    board[selRow][selCol]++;
                }
                if ((selRow < row - 1) && (map[selRow + 1][selCol] == 1)) {
                    board[selRow][selCol]++;
                }
                if ((selCol < col - 1) && (map[selRow][selCol + 1] == 1)) {
                    board[selRow][selCol]++;
                }
                if ((selRow > 0 && selCol > 0) && (map[selRow - 1][selCol - 1] == 1)) {
                    board[selRow][selCol]++;
                }
                if ((selRow > 0 && selCol < col - 1) && (map[selRow - 1][selCol + 1] == 1)) {
                    board[selRow][selCol]++;
                }
                if ((selRow < row - 1 && selCol > 0) && (map[selRow + 1][selCol - 1] == 1)) {
                    board[selRow][selCol]++;
                }
                if ((selRow < row - 1 && selCol < col - 1) && (map[selRow + 1][selCol + 1] == 1)) {
                    board[selRow][selCol]++;
                }
                if (board[selRow][selCol] == 0) {
                    board[selRow][selCol] = -2;
                }
                win++;
                printB(board);
                if (win == (row * col) - maxMineCount) {
                    System.out.println("Kazandınız");
                    break;
                }
            }
            if (map[selRow][selCol] == 1) {
                isGame = false;
                System.out.println("Game Over");
                print(map);
            }

        }


    }

    public void prepare() {
        int rndR, rndC;
        int mineCount = 0;
        while (mineCount < maxMineCount) {
            rndR = rnd.nextInt(row);
            rndC = rnd.nextInt(col);
            if (map[rndR][rndC] == 0) {
                map[rndR][rndC] = 1;
                mineCount++;

            }

        }

    }


    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }


    }

    public void printB(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    System.out.print(" - ");
                } else if (arr[i][j] > 0) {
                    System.out.print(arr[i][j]);

                } else if (arr[i][j] == -2) {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }


    }
}

















