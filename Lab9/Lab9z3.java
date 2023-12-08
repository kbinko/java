package Lab9;

import java.util.Random;

public class Lab9z3 {

    public static void main(String[] args) {
        Random random = new Random();
        int liczba = random.nextInt(); 
        System.out.println("Wylosowana liczba: " + liczba);

        Figura figura;
        if (liczba % 2 == 0) {
            figura = new Linia(10); 
        } else {
            figura = new Kwadrat(5); 
        }

        Class<?> klasaFigury = figura.getClass();
        System.out.println("Nazwa klasy to: " + klasaFigury.getName());
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

