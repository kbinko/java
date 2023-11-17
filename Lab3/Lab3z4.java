package Lab3;
public class Lab3z4 {
    public static void main(String[] args) {
        Pierwsza obj = new Pierwsza();
        double wynik = obj.Oblicz(5); 
        System.out.println("Wynik sumy odwrotności silni dla 5 liczb: " + wynik);
    }
}

class Pierwsza {
    private double silnia(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * silnia(n - 1);
    }

    public double Oblicz(int n) {
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += 1 / silnia(i);
        }
        return suma;
    }
}
