public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0.0;
        for (double i : numbers) {
            sum += 1 / i;
        }
        double hAvarage = numbers.length / sum;
        System.out.println("Dizinin harmonik ortalaması = " + hAvarage);
    }
}