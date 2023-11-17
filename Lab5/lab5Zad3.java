package Lab5;
public class lab5Zad3 {

    public static String toBinary(int number) {
        if (number == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, (number % 2));
            number /= 2;
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {0, 1, 5, 12, 1024};

        for (int number : numbers) {
            System.out.println("Binarna reprezentacja liczby " + number + " to: " + toBinary(number));
        }
    }
}
