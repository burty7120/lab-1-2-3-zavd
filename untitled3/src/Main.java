public class Main {
    public static void main(String[] args) {
        int number = 45;
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сума чисел: " + (double) sum);
    }
}