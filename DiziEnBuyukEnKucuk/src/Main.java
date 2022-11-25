import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Dizi : " + Arrays.toString(arr));
        System.out.print("Girilen Sayı : ");
        int input = scan.nextInt();
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[7];
        for (int i : arr) {
            if (i > min && i < input) {
                min = i;
            }
            if (i < max && i > input) {
                max = i;
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);


    }
}
