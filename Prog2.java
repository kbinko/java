public class Prog2 {
    public static int znajdzMinimalnaWartosc(int[][] tablica, int numerKolumny) {
        if (tablica == null || tablica.length == 0 || numerKolumny < 0 || numerKolumny >= tablica[0].length) {
            throw new IllegalArgumentException("Nieprawidłowa tablica lub numer kolumny");
        }

        int min = Integer.MAX_VALUE;
        for (int[] wiersz : tablica) {
            if (wiersz != null && numerKolumny < wiersz.length) {
                min = Math.min(min, wiersz[numerKolumny]);
            }
        }
        return min;
    }

    // Tutaj możesz dodać metodę main do testowania, jeśli potrzebujesz
    public static void main(String[] args) {
        // Przykładowe wywołanie metody z testową tablicą
        int[][] testowaTablica = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int kolumnaDoSprawdzenia = 1;  // Przykładowy numer kolumny do sprawdzenia
        System.out.println("Minimalna wartość w kolumnie " + kolumnaDoSprawdzenia + " to: " + znajdzMinimalnaWartosc(testowaTablica, kolumnaDoSprawdzenia));
    }
}
