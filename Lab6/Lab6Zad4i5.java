package Lab6;
public class Lab6Zad4i5 {
    public static void main(String[] args) {
        
        String val1 = "\u5B66\uD8F0\uDE30";
        int length = val1.length();
        int codePointCount = val1.codePointCount(0, val1.length());
        System.out.println("Zadanie 4:");
        System.out.println("Długość łańcucha: " + length);
        System.out.println("Liczba jednostek kodowych: " + codePointCount);

        String pozdrowienie = "Hello";
        char first = pozdrowienie.charAt(0);
        int cp = pozdrowienie.codePointAt(0);
        System.out.println("\nZadanie 5a:");
        System.out.println("charAt(0): " + first);
        System.out.println("codePointAt(0): " + cp);

        String val2 = "\u0041\uD8F0\uDE30";
        int cp1 = val2.codePointAt(0);
        int cp2 = val2.codePointAt(1);
        System.out.println("\nZadanie 5b:");
        System.out.println("Jednostka kodowa dla 0: " + cp1);
        System.out.println("Jednostka kodowa dla 1: " + cp2);

        System.out.println("\nZadanie 5c:");
        System.out.println("Jednostka kodowa cp1 jest znakiem surogatowym: " + Character.isSupplementaryCodePoint(cp1));
        System.out.println("Jednostka kodowa cp2 jest znakiem surogatowym: " + Character.isSupplementaryCodePoint(cp2));
    }
}
