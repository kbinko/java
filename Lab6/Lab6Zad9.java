package Lab6;
public class Lab6Zad9 {
    public static void main(String[] args) {
        String s1 = "programowanie";

        StringBuilder sb1 = new StringBuilder(s1);

        sb1.append(" obiektowe I");

        sb1.setCharAt(0, 'P');

        String result = sb1.toString();
        System.out.println(result);
    }
}
