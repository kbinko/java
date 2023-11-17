package Lab5;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class lab5Zad1 {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("10.5");
        BigDecimal number2 = new BigDecimal("4.5");

        BigDecimal suma = number1.add(number2);
        BigDecimal roznica = number1.subtract(number2);
        BigDecimal iloczyn = number1.multiply(number2);
        BigDecimal iloraz = number1.divide(number2, 2, RoundingMode.HALF_UP);

        System.out.println("Suma: " + suma);
        System.out.println("Różnica: " + roznica);
        System.out.println("Iloczyn: " + iloczyn);
        System.out.println("Iloraz: " + iloraz);
    }
}
