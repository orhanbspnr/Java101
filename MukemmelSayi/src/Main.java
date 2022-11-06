import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number * 2) {
            System.out.print(number + " Mükemmel sayıdır.");
        } else {
            System.out.print(number + " Mükemmel sayı değildir.");
        }

    }
}