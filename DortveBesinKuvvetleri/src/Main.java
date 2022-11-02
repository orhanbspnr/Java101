import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();
        for(int i = 1; i <= n; i*=4){
            System.out.println("Dördün Katları : " + i);
        }
        for(int j =1; j <= n ; j*=5){
            System.out.println("Beşin Katları : " + j);
        }
    }
}