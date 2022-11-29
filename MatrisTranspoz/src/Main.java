import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Satır sayısı : ");
        int row = scan.nextInt();
        System.out.print("Sütun sayısı : ");
        int col = scan.nextInt();

        int[][] matris = new int[row][col];
        int[][] transpoze = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print((i + 1) + ". satır " + (j + 1) + ". sütun : ");
                matris[i][j] = scan.nextInt();
            }
        }

        System.out.println();

        System.out.println("Matris : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println();

        System.out.println("Transpoze : ");

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transpoze[i][j] = matris[j][i];
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}