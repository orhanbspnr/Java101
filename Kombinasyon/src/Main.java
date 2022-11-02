import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r,nFac = 1,rFac = 1,fac3 =1,comb;
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : " );
        n = scan.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        r = scan.nextInt();
        for(int i = 1; i<= n; i++){
            nFac *= i;
        }
        for (int j = 1; j<=r; j++){
            rFac*= j;
        }
        for(int k= 1; k<=(n-r);k++){
            fac3 *=k;

        }

        comb = nFac/(rFac*fac3);
        System.out.print("Kombinasyon = " +comb);


    }
}