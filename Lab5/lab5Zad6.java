package Lab5;
import java.util.Scanner;

public class lab5Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę ujemną typu int: ");
        int liczba = scanner.nextInt();

        int przesuniecieArytmetyczne = liczba >> 2;

        int przesuniecieLogiczne = liczba >>> 2;

        System.out.println("Wynik przesunięcia arytmetycznego: " + przesuniecieArytmetyczne);
        System.out.println("Wynik przesunięcia logicznego: " + przesuniecieLogiczne);
    }
}
