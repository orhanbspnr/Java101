import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kilo,boy,indeks;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();
        indeks = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);

    }
}