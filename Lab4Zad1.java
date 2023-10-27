import java.util.Scanner;
import java.util.Arrays;

public class Lab4Zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] x = new double[8];
        
        System.out.println("\nWczytywanie wartości dla tablicy x:");
        readTab1D(x);
        System.out.print("\nTablica x: ");
        printTab1D(x);
        
        double[] xKopia = Arrays.copyOf(x, x.length);
        System.out.print("\nKopia tablicy x: ");
        printTab1D(xKopia);
        
        double[] xDoubleSize = new double[2 * x.length];
        for (int i = 0; i < xDoubleSize.length; i++) {
            xDoubleSize[i] = Math.random() * 100; // liczby pseudolosowe od 0 do 100
        }
        System.out.print("\nTablica xDoubleSize: ");
        printTab1D(xDoubleSize);

        int start = 2;
        int end = 6;
        double[] temp = Arrays.copyOfRange(x, start, end);
        int[] z = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            z[i] = (int) Math.round(temp[i]);
        }
        System.out.print("\nTablica z: ");
        for (int value : z) {
            System.out.print("\n" + value + " ");
        }
        System.out.println();
        sc.close();
    }

    static void readTab1D(double x[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.print("Podaj wartość dla x[" + i + "]: ");
            x[i] = sc.nextDouble();
            sc.nextLine();
        }
        sc.close();
    }

    static void printTab1D(double x[]) {
        for (double value : x) {
            System.out.printf("\n%.2f ", value);
        }
        System.out.println();
    }
}
