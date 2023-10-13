import java.util.Scanner;

public class Third2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Podaj a:");
        
        while(! scanner.hasNextDouble()) {
            System.out.println("Niepoprawny format! Spróbuj ponownie.");
            scanner.next(); 
        }
        
        double a = scanner.nextDouble();

        System.out.println("Podaj b:");

        while(! scanner.hasNextDouble()) {
            System.out.println("Niepoprawny format! Spróbuj ponownie.");
            scanner.next(); 
        }

        double b = scanner.nextDouble();

        System.out.println("Podaj c:");

        while(! scanner.hasNextDouble()) {
            System.out.println("Niepoprawny format! Spróbuj ponownie.");
            scanner.next(); 
        }

        double c = scanner.nextDouble();

        
        // Obliczenie delty
        double delta = b * b - 4 * a * c;
        
        // Sprawdzenie przypadków
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Równanie tożsamościowe.");
                } else {
                    System.out.println("Równanie sprzeczne.");
                }
            } else {
                double x = -c / b;
                System.out.println("Równanie liniowe. x = " + x);
                verifyRoot(a, b, c, x);
            }
        } else {
            if (delta > 0) {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Dwa pierwiastki rzeczywiste: x1 = " + x1 + ", x2 = " + x2);
                verifyRoot(a, b, c, x1);
                verifyRoot(a, b, c, x2);
            } else if (delta == 0) {
                double x0 = -b / (2 * a);
                System.out.println("Jeden pierwiastek rzeczywisty: x0 = " + x0);
                verifyRoot(a, b, c, x0);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-delta) / (2 * a);
                System.out.println("Pierwiastki zespolone: z1 = " + realPart + " + " + imaginaryPart + "j");
                System.out.println("z2 = " + realPart + " - " + imaginaryPart + "j");
                System.out.println("Pierwiastki są zespolone, więc nie są pierwiastkami rzeczywistymi równania kwadratowego.");
            }
        
            scanner.close();
        }
    }

    public static void verifyRoot(double a, double b, double c, double x) {
        double result = a * x * x + b * x + c;
        if (Math.abs(result) < 1e-10) {
            System.out.println("Pierwiastek x = " + x + " jest poprawny.");
        } else {
            System.out.println("Pierwiastek x = " + x + " jest niepoprawny.");
        }
    }
}