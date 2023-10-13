import java.util.Random;
import java.util.Scanner;

public class Second2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n5 liczb typu int");
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt());
        }

        System.out.println("\n10 liczb typu float");
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextFloat());
        }

        System.out.println("\n12 liczb z zakresu [0,n)");
        System.out.println("\nPodaj wartość n: ");
        int n = scanner.nextInt();
        for (int i = 0; i < 12; i++) {
            System.out.println(random.nextInt(n));
        }


        System.out.println("\n15 liczb z zakresu [-10,20]");
        int x = -10;
        int y = 20;
        for (int i = 0; i < 15; i++) {
            int number = random.nextInt(y - x + 1) + x;
            System.out.println(number);
        }

        scanner.close();
    }
}
