package Lab6;
import java.util.Scanner;

public class Lab6Zad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lan = "";
        int liczbaHex;

        do {
            System.out.println("Podaj kod Unikodu (w formacie heksadecymalnym, zakres 10000-10FFFF):");
            lan = sc.next();
            liczbaHex = Integer.decode(lan);
        } while (liczbaHex < 0x10000 || liczbaHex > 0x10FFFF);

        int highSurrogate = (liczbaHex - 0x10000) / 0x400 + 0xD800;
        int lowSurrogate = (liczbaHex - 0x10000) % 0x400 + 0xDC00;

        System.out.printf("Górny surogat: %04X\n", highSurrogate);
        System.out.printf("Dolny surogat: %04X\n", lowSurrogate);

        int high, low;
        do {
            System.out.println("Podaj wartość pierwszego surogatu (H, zakres D800-DBFF):");
            lan = sc.next();
            high = Integer.decode(lan);
        } while (high < 0xD800 || high > 0xDBFF);

        do {
            System.out.println("Podaj wartość drugiego surogatu (L, zakres DC00-DFFF):");
            lan = sc.next();
            low = Integer.decode(lan);
        } while (low < 0xDC00 || low > 0xDFFF);

        int calculatedUnicode = Character.toCodePoint((char) high, (char) low);
        System.out.printf("Odpowiadający kod Unikodu: %04X\n", calculatedUnicode);
    }
}
