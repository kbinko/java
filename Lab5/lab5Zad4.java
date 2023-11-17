package Lab5;
public class lab5Zad4 {
    public static void main(String[] args) {
        int mask0 = 0; 

        int maskaA = mask0 & ~(1 << 3);
        System.out.println("a) Maska z 3-cim bitem ustawionym na 0: " + Integer.toBinaryString(maskaA));

        int maskaB = mask0 | (1 << 3);
        System.out.println("b) Maska z 3-cim bitem ustawionym na 1: " + Integer.toBinaryString(maskaB));

        int p = 4; 

        int maskaC = ~((1 << p) - 1);
        System.out.println("c) Maska p-bitowa (p = " + p + ") z zerami na najmłodszych pozycjach: " + Integer.toBinaryString(maskaC));

        int maskaD = (1 << p) - 1;
        System.out.println("d) Maska p-bitowa (p = " + p + ") z jedynkami na najmłodszych pozycjach: " + Integer.toBinaryString(maskaD));

        int maskaE = (1 << (32 - p)) - 1;
        System.out.println("e) Maska p-bitowa (p = " + p + ") z zerami na najstarszych pozycjach: " + Integer.toBinaryString(maskaE));

        int maskaF = ~((1 << (32 - p)) - 1);
        System.out.println("f) Maska p-bitowa (p = " + p + ") z jedynkami na najstarszych pozycjach: " + Integer.toBinaryString(maskaF));
    }
}
