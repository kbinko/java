package Lab6;
public class Lab6Zad6 {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "JAVA";
        System.out.println("Zadanie 6a:");
        System.out.println("equals: " + str1.equals(str2));
        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str2));
        System.out.println("compareTo: " + str1.compareTo(str2));
        System.out.println("compareToIgnoreCase: " + str1.compareToIgnoreCase(str2));

        String s1 = "Programowanie w Java";
        String s2 = "Java";
        System.out.println("\nZadanie 6b:");
        System.out.println("indexOf(s2): " + s1.indexOf(s2));
        System.out.println("indexOf(s2, 10): " + s1.indexOf(s2, 10));

        String nazwa = "Nazwa";
        System.out.println("\nZadanie 6c:");
        System.out.println("toLowerCase: " + nazwa.toLowerCase());
        System.out.println("toUpperCase: " + nazwa.toUpperCase());

        String kowalski = " Kowalski ";
        System.out.println("\nZadanie 6d:");
        System.out.println("trim: '" + kowalski.trim() + "'");
    }
}
