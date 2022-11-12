import java.util.Scanner;

public class Main {
    static int power(int a, int b){
        if((a == 1) || (b == 0)){
            return 1;
        }
        return a*power(a,b-1);
    }
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        a = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        b = scan.nextInt();
        System.out.print("Sonuç : " +  power(a,b));



    }
}