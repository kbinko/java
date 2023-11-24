public class ArrayGenerator {

    public static Object generujTablice(int wiersze, int kolumny, int numerAlbumu) {
        if (numerAlbumu % 2 == 0) {
            // Zwraca tablicę typu double
            return new double[wiersze][kolumny];
        } else if (numerAlbumu % 3 == 0) {
            // Zwraca tablicę typu int
            return new int[wiersze][kolumny];
        } else if (numerAlbumu % 5 == 0) {
            // Zwraca tablicę typu byte
            return new byte[wiersze][kolumny];
        } else {
            // Zwraca tablicę typu char
            return new char[wiersze][kolumny];
        }
    }

    public static void main(String[] args) {
        // Przykład użycia metody
        int numerAlbumu = 19484;  // Przykładowy numer albumu
        Object tablica = generujTablice(3, 3, numerAlbumu);
        // Tutaj można dodać kod do manipulowania lub wyświetlania zwróconej tablicy
    }
}
