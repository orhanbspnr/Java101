import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci eleman saysını giriniz :");
        n = input.nextInt();
        System.out.print(n + " elemanlı fibonacci serisi : ");
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + n3);
            n1 = n2;
            n2 = n3;
            System.out.println();

        }


    }
}
