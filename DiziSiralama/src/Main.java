import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        n = scan.nextInt();
        int[] list = new int[n];
        int number;
        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < n; i++) {
            number = scan.nextInt();
            list[i] = number;
            System.out.println((i + 1) + " elemanı : " + list[i]);
        }
        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));


    }
}