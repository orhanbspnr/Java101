import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k,toplam = 0,adet = 0;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        k = input.nextInt();
        for(int i = 0; i<= k; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                toplam+= i;
                adet++;
            }


        }
        ortalama = toplam /(adet-1);
        System.out.println("0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması : " +ortalama);

    }
}