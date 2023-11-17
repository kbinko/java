package Lab6;
import java.util.Date;

public class Lab6Zad1 {
    public static void main(String[] args) {
 
        String s1 = "ANS";

        String s2 = new String("ANS");

        String existingString = "Przykładowy napis";
        String s3 = new String(existingString);

        char[] tabZnakowa = {'a', 'b', 'c'};
        String s4 = new String(tabZnakowa);

        Date currentDate = new Date();
        
        String liczbaStr = "123";
        
        int liczbaInt1 = Integer.parseInt(liczbaStr);
        
        int liczbaInt2 = Integer.valueOf(liczbaStr).intValue();
        
        System.out.println("Wartość numeryczna (valueOf): " + liczbaInt2);
        System.out.println("Wartość numeryczna (parseInt): " + liczbaInt1);
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);
        System.out.println("Dzisiaj jest " + currentDate);
    }
}
