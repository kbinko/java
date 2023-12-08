package Lab9;

import java.util.Scanner;

public class Lab9z2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz figurę (Linia/Kwadrat): ");
        String figuraTyp = scanner.nextLine();
        System.out.println("Podaj rozmiar figury: ");
        int rozmiar = scanner.nextInt();

        FiguraN figura;
        if (figuraTyp.equalsIgnoreCase("Linia")) {
            figura = new Linia(rozmiar);
        } else if (figuraTyp.equalsIgnoreCase("Kwadrat")) {
            figura = new Kwadrat(rozmiar);
        } else {
            System.out.println("Nieznany typ figury.");
            scanner.close();
            return;
        }
        
        scanner.close();
        figura.rysuj();
    }
}

abstract class FiguraN {
    protected int dlugosc;

    public FiguraN(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public abstract void rysuj();
}

class Linia extends FiguraN {

    public Linia(int dlugosc) {
        super(dlugosc);
    }

    @Override
    public void rysuj() {
        System.out.println("Rysowanie linii o długości: " + dlugosc);
    }
}

class Kwadrat extends FiguraN {

    public Kwadrat(int dlugosc) {
        super(dlugosc);
    }

    @Override
    public void rysuj() {
        System.out.println("Rysowanie kwadratu o boku: " + dlugosc);
    }
}
