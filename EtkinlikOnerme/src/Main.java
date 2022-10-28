import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz :");
        heat = input.nextInt();
        if(heat <5) {
            System.out.print("Kayak yapabilirsiniz.");
        } else if (heat < 10) {
            System.out.print("Sinemaya gidebilirsiniz.");
        } else if ((heat >= 10) && (heat <= 15)) {
            System.out.print("Sinemaya veya Pikniğe gidebilirsiniz.");
        } else if ((heat > 15) && (heat <= 25)) {
            System.out.print("Pikniğe gidebilirsiniz.");
        }else {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }

    }
}