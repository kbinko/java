package Lab4;
import java.math.BigInteger;

public class Lab4Zad4 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("23452347654222");
        BigInteger b = BigInteger.valueOf(123456);

        BigInteger suma = a.add(b);
        BigInteger roznica = a.subtract(b);
        BigInteger iloczyn = a.multiply(b);
        BigInteger iloraz = a.divide(b);
        BigInteger modulo = a.mod(b);

        System.out.println("Suma: " + suma);
        System.out.println("Różnica: " + roznica);
        System.out.println("Iloczyn: " + iloczyn);
        System.out.println("Iloraz: " + iloraz);
        System.out.println("Modulo: " + modulo);

        BigInteger c = new BigInteger("123456789");
        BigInteger wynik = c.multiply(a.add(b).subtract(BigInteger.valueOf(100)));
        System.out.println("Wartość wyrażenia: " + wynik);
    }
}
