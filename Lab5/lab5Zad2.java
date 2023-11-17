package Lab5;
public class lab5Zad2 {
    public static void main(String[] args) {
        short lanbit1 = 12;  
        short lanbit2 = -35; 

        System.out.println("a) ~lanbit1: " + (~lanbit1));
        System.out.println("b) ~lanbit2: " + (~lanbit2));
        System.out.println("c) lanbit1 & lanbit2: " + (lanbit1 & lanbit2));
        System.out.println("d) ~lanbit1 & lanbit2: " + (~lanbit1 & lanbit2));
        System.out.println("e) ~(lanbit1 & lanbit2): " + ~(lanbit1 & lanbit2));
        System.out.println("f) lanbit1 | lanbit2: " + (lanbit1 | lanbit2));
        System.out.println("g) ~(lanbit1 | lanbit2): " + ~(lanbit1 | lanbit2));
        System.out.println("h) (~lanbit1 | lanbit2): " + (~lanbit1 | lanbit2));
        System.out.println("i) lanbit1 ^ lanbit2: " + (lanbit1 ^ lanbit2));
        System.out.println("j) ~(lanbit1 ^ lanbit2): " + ~(lanbit1 ^ lanbit2));
    }
}
