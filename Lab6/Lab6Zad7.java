package Lab6;
public class Lab6Zad7 {
    public static void main(String[] args) {
        String str = "zielony,niebieski,czerwony";
        String[] results = str.split(",");

        System.out.println("Podział łańcucha:");
        for (String result : results) {
            System.out.println(result);
        }
    }
}
