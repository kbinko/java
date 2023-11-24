package Lab7;


public class Lab7Zad1 {
    // Pola klasy Samochod
    private int kola;
    private int siedzenia;
    private int kierownica;

    // Konstruktor klasy Samochod
    public Lab7Zad1(int kola, int siedzenia, int kierownica) {
        this.kola = kola;
        this.siedzenia = siedzenia;
        this.kierownica = kierownica;

    }

    // Metoda startuj
    public boolean startuj() {
        System.out.println("Samochód rusza.");
        return true;
    }

    // Metoda hamuj
    public void hamuj(int jak) {
        return ;
    }

    // Metoda przyspiesz
    public void przyspiesz() {
        System.out.println("Samochód przyspiesza.");
    }

    public static void main(String[] args) {
        // Tworzenie obiektu klasy Samochod
        Lab7Zad1 a = new Lab7Zad1(4, 5, 1);

        // Testowanie instrukcji
        a.kola = 4;
        a.hamuj(20);
        a.przyspiesz();
    }
}
