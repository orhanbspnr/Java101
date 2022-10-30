import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mesafe, yas, tip;
        double toplam, yasIndirimi, tipIndirimi;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz :");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş ) :");
        tip = input.nextInt();
        if ((mesafe > 0) && (yas > 0) && (tip == 1 || tip == 2)) {
            toplam = (mesafe * 0.10);

            if (yas < 12) {
                yasIndirimi = toplam * 0.5;
                toplam -= yasIndirimi;

            } else if (yas <= 24) {
                yasIndirimi = toplam * 0.1;
                toplam -= yasIndirimi;

            } else if (yas > 65) {
                yasIndirimi = toplam * 0.3;
                toplam -= yasIndirimi;

            }
            if (tip == 2) {
                tipIndirimi = toplam * 0.2;
                toplam = (toplam - tipIndirimi) * 2;
            }
            System.out.println("Toplam Tutar : " + toplam + " TL");

        } else

            System.out.println("Hatalı Veri Girdiniz!");
    }
}