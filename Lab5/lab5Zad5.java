package Lab5;
import java.util.Scanner;

public class lab5Zad5 {

    public static int valueOfGroup(int n, int p) {
        int mask = (1 << n) - 1; 
        mask <<= p; 
        return mask;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, p = 0;

        boolean validInput = false;
        while (!validInput) {
            System.out.print("Podaj liczbę bitów n: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    validInput = true;
                } else {
                    System.out.println("Liczba bitów musi być większa od 0.");
                }
            } else {
                System.out.println("Nieprawidłowy format, spróbuj ponownie.");
                scanner.next(); 
            }
        }

        validInput = false;
        while (!validInput) {
            System.out.print("Podaj pozycję początkową p: ");
            if (scanner.hasNextInt()) {
                p = scanner.nextInt();
                if (p >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Pozycja początkowa musi być nieujemna.");
                }
            } else {
                System.out.println("Nieprawidłowy format, spróbuj ponownie.");
                scanner.next(); 
            }
        }

        int value = valueOfGroup(n, p);
        System.out.println("Wartość dziesiętna grupy " + n + "-bitów zaczynając od pozycji " + p + " to: " + value);
    }
}
