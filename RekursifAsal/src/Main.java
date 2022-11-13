import java.util.Scanner;

public class Main {
    static void asal(int n, int i) {
        if (n == i) {
            System.out.println(n + " sayısı ASALDIR !");
            return;
        } else if (n % i == 0) {
            System.out.println(n + " sayısı ASAL değildir !");
            return;
        }
        asal(n, i + 1);
    }

    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        n = scan.nextInt();
        asal(n, 2);
    }
}