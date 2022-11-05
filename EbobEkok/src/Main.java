import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, min, ebob, ekok;
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz :");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz :");
        n2 = input.nextInt();
        min = n1;
        if (n1 > n2) {
            min = n2;
        }
        int i = min;
        while (i >= 1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob = i;
                System.out.println("ebob = " + ebob);
                break;
            }
            i--;
        }
        int k = 1;
        while (k <= n1 * n2) {
            if ((k % n1 == 0) && (k % n2 == 0)) {
                ekok = k;
                System.out.print("ekok = " + ekok);
                break;
            }
            k++;

        }


    }
}
