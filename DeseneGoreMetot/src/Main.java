import java.util.Scanner;

public class Main {

    static int negative(int n){
        if(n <= 0){

            return n;
        }
        System.out.print(n + " ");
        return negative(n-5);


        }
        static int positive(int n, int y){
        if(n >y){
            return n;
        }else{
            System.out.print(n + " ");
            return positive(n+5,y);
        }

        }


    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        number = scan.nextInt();
        System.out.print("Çıktısı : ");
        positive(negative(number),number);




    }
}