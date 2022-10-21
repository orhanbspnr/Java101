import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdv, kdvTutar,kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutar giriniz :");
        tutar = input.nextDouble();
        if (tutar>= 0 && tutar <= 1000){
            kdv = 0.18;
        }
        else
            kdv = 0.08;

        kdvTutar = tutar * kdv;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdv);
        System.out.println("KDV Tutarı : " + kdvTutar );
        System.out.println("KDV'li Tutar : " + kdvliTutar );


    }
}