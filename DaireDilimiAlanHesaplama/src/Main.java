import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r,a;
        double pi = 3.14,alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap giriniz :");
        r = input.nextInt();
        System.out.print("Merkez açısının ölçüsünü giriniz :");
        a = input.nextInt();
        alan = (pi * (r*r)* a)/360;
        System.out.println("Alan = " + alan);



    }
}