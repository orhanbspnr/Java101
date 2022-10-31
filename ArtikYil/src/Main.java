import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        boolean artikYil = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();
        if(yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artikYil = true;
                } else {
                    artikYil = false;
                }
            } else {
                artikYil = true;
            }

        }else {
            artikYil = false;
        }
        if (artikYil){
            System.out.println(yil + " bir artık yıldır.");
        }else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}