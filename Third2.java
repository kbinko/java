import java.util.Scanner;

public class Third2 {
    private static double a, b, c;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        wprowadzDane(scanner);
        rozwiazanie();
        scanner.close();
    }
    
    public static void wprowadzDane(Scanner scanner) {
        System.out.println("Podaj a:");
        a = walidacja(scanner);
        
        System.out.println("Podaj b:");
        b = walidacja(scanner);

        System.out.println("Podaj c:");
        c = walidacja(scanner);
    }

    private static double walidacja(Scanner scanner) {
        while(!scanner.hasNextDouble()) {
            System.out.println("Niepoprawny format! Spróbuj ponownie.");
            scanner.next(); 
        }
        return scanner.nextDouble();
    }

    public static void rozwiazanie() {
        double delta = b * b - 4 * a * c;
        
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
                sprawdz(x);
            }
        } else {
            if (delta > 0) {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Dwa pierwiastki rzeczywiste: x1 = " + x1 + ", x2 = " + x2);
                sprawdz(x1);
                sprawdz(x2);
            } else if (delta == 0) {
                double x0 = -b / (2 * a);
                System.out.println("Jeden pierwiastek rzeczywisty: x0 = " + x0);
                sprawdz(x0);
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-delta) / (2 * a);
                System.out.println("Pierwiastki zespolone: z1 = " + realPart + " + " + imaginaryPart + "j");
                System.out.println("z2 = " + realPart + " - " + imaginaryPart + "j");
                System.out.println("Pierwiastki są zespolone, więc nie są pierwiastkami rzeczywistymi równania kwadratowego.");
            }
        }
    }

    public static void sprawdz(double x) {
        double result = a * x * x + b * x + c;
        if (Math.abs(result) < 1e-10) {
            System.out.println("Pierwiastek x = " + x + " jest poprawny.");
        } else {
            System.out.println("Pierwiastek x = " + x + " jest niepoprawny.");
        }
    }
}
