import java.util.Scanner;

public class Lab4Zad2 {

    public static void main(String[] args) {
        double[][] tabX = new double[3][3];
        readTab2D(tabX);
        printTab2D(tabX);
    }

    static void readTab2D(double y[][]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wczytywanie tablicy dwuwymiarowej:");
        
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.println("Wprowadź element [" + i + "][" + j + "]:");
                y[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();
    }

    static void printTab2D(double y[][]) {
        System.out.println("Wydruk tablicy dwuwymiarowej:");
        
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }
    }
}

