import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlican = 5.0,toplam;
        int aMiktar,eMiktar,dMiktar,mMiktar,pMiktar;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? :");
        aMiktar = input.nextInt();
        armut *= aMiktar;
        System.out.print("Elma kaç kilo ? :");
        eMiktar = input.nextInt();
        elma *= eMiktar;
        System.out.print("Domates kaç kilo ? :");
        dMiktar = input.nextInt();
        domates *= dMiktar;
        System.out.print("Muz kaç kilo ? :");
        mMiktar = input.nextInt();
        muz*= mMiktar;
        System.out.print("Patlıcan kaç kilo ? :");
        pMiktar = input.nextInt();
        patlican *= pMiktar;


        toplam = (armut+elma+domates+muz+patlican);
        System.out.println("Toplam tutar : " + toplam);






    }
}