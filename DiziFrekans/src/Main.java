import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(list));
        int[] fr = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            fr[i] = 1;
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    fr[i]++;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    list[j] = 0;
                }
            }
        }

        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < list.length; i++) {
            if (fr[i] >= 1) {
                if (list[i] != 0) {
                    System.out.println(list[i] + " sayisi " + fr[i] + " kere tekrar edildi");
                }
            }
        }
    }
}