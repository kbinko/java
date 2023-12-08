package Lab7;

public class Lab7Zad2 {
    private int kola;
    private int siedzenia;
    private Kierownica kierownica;

    public Lab7Zad2(int kola, int siedzenia, Kierownica kierownica) {
        this.kola = kola;
        this.siedzenia = siedzenia;
        this.kierownica = kierownica;
    }

    public boolean startuj() {
        System.out.println("Samochód rusza.");
        return true;
    }

    public void hamuj(int jak) {
        System.out.println("Samochód hamuje z siłą: " + jak);
    }

    public void przyspiesz() {
        System.out.println("Samochód przyspiesza.");
    }

    public Kierownica getKierownica() {
        return kierownica;
    }

    public static class Kierownica {
        public boolean kręćWPrawo() {
            System.out.println("Kierownica skręca w prawo.");
            return true;
        }

        public boolean kręćWLewo() {
            System.out.println("Kierownica skręca w lewo.");
            return true;
        }

        public void zablokuj() {
            System.out.println("Kierownica zablokowana.");
        }

        public void odblokuj() {
            System.out.println("Kierownica odblokowana.");
        }
    }

    public static void main(String[] args) {
        Kierownica kierownica = new Kierownica();
        Lab7Zad2 car = new Lab7Zad2(4, 5, kierownica);

        // Testowanie instrukcji
        car.siedzenia = 5;
        car.getKierownica();
        kierownica.zablokuj();
        car.kierownica.kręćWLewo();
        System.out.println(car.kierownica.kręćWPrawo());
        car.kierownica.odblokuj();
        car.startuj();
    }
}
