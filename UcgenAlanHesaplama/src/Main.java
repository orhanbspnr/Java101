import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,u,alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz :");
        a = input.nextInt();
        System.out.print("İkinci kenarı giriniz :");
        b = input.nextInt();
        System.out.print("Üçüncü kenarı giriniz :");
        c = input.nextInt();

        u = (a+b+c)/2;
        alan = (int) Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan = " + alan);

    }
}