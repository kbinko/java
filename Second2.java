import java.util.Random;
import java.util.Scanner;

public class Second2 {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printInt(5);
        printFloat(10);
        printInRange();
        printBetween(15);

        scanner.close();
    }

    private static void printInt(int count) {
        System.out.println("\n" + count + " liczb typu int");
        for (int i = 0; i < count; i++) {
            System.out.println(random.nextInt());
        }
    }

    private static void printFloat(int count) {
        System.out.println("\n" + count + " liczb typu float");
        for (int i = 0; i < count; i++) {
            System.out.println(random.nextFloat());
        }
    }

    private static void printInRange() {
        System.out.println("\n12 liczb z zakresu [0,n)");
        System.out.println("\nPodaj wartość n: ");
        int n = scanner.nextInt();
        for (int i = 0; i < 12; i++) {
            System.out.println(random.nextInt(n));
        }
    }

    private static void printBetween(int count) {
        System.out.println("\n" + count + " liczb z zakresu [-10,20]");
        int x = -10;
        int y = 20;
        for (int i = 0; i < count; i++) {
            int number = random.nextInt(y - x + 1) + x;
            System.out.println(number);
        }
    }
}
