import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,inputNumber,min = 0,max=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz :");
        inputNumber = scan.nextInt();
        for(int i =1; i <= inputNumber; i++){
            System.out.print(i + ".Sayıyı giriniz : ");
            number = scan.nextInt();
            if(i ==1){
            min = number;
            max = number;}
            if(number < min){
                min = number;
            }
            if(number > max){
                max = number;
            }
        }
        System.out.println("En küçük sayı: " + min);
        System.out.print("En büyük sayı: " + max);



    }
}