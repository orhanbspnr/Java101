import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematik,turkce,fizik,kimya,muzik,toplamnot = 0,derssayisi = 0;
        double avarage;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        matematik = input.nextInt();
        if(matematik >= 0 && matematik <= 100 ){
            toplamnot += matematik;
        derssayisi++;
        }else {
            System.out.println("Ders notunuz 0 ile 100 aralığında olmadığı için ortalamaya dahil edilmeyecektir.");
        }
        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        if(turkce >= 0 && turkce <= 100 ){
            toplamnot += turkce;
            derssayisi++;
        }else {
            System.out.println("Ders notunuz 0 ile 100 aralığında olmadığı için ortalamaya dahil edilmeyecektir.");
        }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        if(fizik >= 0 && fizik <= 100 ){
            toplamnot += fizik;
            derssayisi++;
        }else {
            System.out.println("Ders notunuz 0 ile 100 aralığında olmadığı için ortalamaya dahil edilmeyecektir.");
        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        if(kimya >= 0 && kimya <= 100 ){
            toplamnot += kimya;
            derssayisi++;
        }else {
            System.out.println("Ders notunuz 0 ile 100 aralığında olmadığı için ortalamaya dahil edilmeyecektir.");
        }

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();
        if(muzik >= 0 && muzik <= 100 ){
            toplamnot += muzik;
            derssayisi++;
        }else {
            System.out.println("Ders notunuz 0 ile 100 aralığında olmadığı için ortalamaya dahil edilmeyecektir.");
        }

        avarage = toplamnot / derssayisi;
        System.out.println("Ortalamanız : " + avarage);

        if(avarage <= 55){
            System.out.println("Sınıfta kaldınız.");
        }else{
            System.out.println("Sınıfı geçtiniz");
        }


    }
}