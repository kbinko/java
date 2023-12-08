package Lab9;

import java.util.Random;

public class Lab9z4 {

    public static void main(String[] args) {
        Linia lin1 = new Linia(10);
        Kwadrat kw1 = new Kwadrat(5);

        Random random = new Random();
        int liczba = random.nextInt(); 
        System.out.println("Wylosowana liczba: " + liczba);

        if (liczba % 2 == 0) {
            test(lin1);
        } else {
            test(kw1);
        }
    }

    public static void test(Figura figura) {
        figura.rysuj();
        if (figura instanceof Kwadrat) {
            int pole = figura.dlugosc * figura.dlugosc;
            System.out.println("Pole kwadratu: " + pole);
        }
    }
}

class Figura {
    protected int dlugosc;

    public Figura(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public void rysuj() {
        System.out.println("Rysowanie figury");
    }
}

class Linia extends Figura {

    public Linia(int dlugosc) {
        super(dlugosc);
    }

    @Override
    public void rysuj() {
        System.out.println("Rysowanie linii o długości: " + dlugosc);
    }
}

class Kwadrat extends Figura {

    public Kwadrat(int dlugosc) {
        super(dlugosc);
    }

    @Override
    public void rysuj() {
        System.out.println("Rysowanie kwadratu o boku: " + dlugosc);
    }
}
