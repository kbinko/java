import java.util.Scanner;
import static java.lang.Math.*;

public class First2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        double x = 0;
        boolean validInput = false;
        while(!validInput) {
            System.out.print("Podaj wartość x: ");
            try {
                x = scanner.nextDouble();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Niepoprawny format! Spróbuj ponownie.");
                scanner.next(); 
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
        
        System.out.println("Wynik = " + result);
        
        scanner.close();
    }
}
