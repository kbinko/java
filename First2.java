import java.util.Scanner;
import static java.lang.Math.*;

public class First2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        double x = 0;
        boolean validInput = false;
        while(!validInput) {
            System.out.print("Podaj x: ");
            if(scanner.hasNextDouble()) {
                x = scanner.nextDouble();
                validInput = true;
            } 
            else {
                System.out.println("Niepoprawne dane! Podaj liczbę rzeczywistą!");
                scanner.next();
            }
            if (tan(x) + log10(abs(sin(x))) + pow(PI, x) == 0) {
                System.out.println("Mianownik wynosi zero. Dzielenie przez zero!");
                scanner.close();
                return;
            }
        }
        
        double numerator = log(x-1)/log(2) + cbrt(1/tan(x)) + ceil(pow(3, x)) + exp(pow(x, 3));
        double denominator = tan(x) + log10(abs(sin(x))) + pow(PI, x);
        
        double result = 0;
        if(denominator != 0) {
            result = numerator / denominator;
        } else {
            System.out.println("Mianownik wynosi zero. Dzielenie przez zero!");
            scanner.close();
            return;
        }
        
        System.out.printf("Wynik = %.4f" , result);
        
        scanner.close();
    }
}
