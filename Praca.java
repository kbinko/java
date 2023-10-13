public class Praca {

    public static void main(String[] args) {

        System.out.println("abs: Zwraca wartość bezwzględną argumentu");
        System.out.println("abs(-123.45) = " + Math.abs(-123.45));
        System.out.println();

        System.out.println("addExact: Dodaje dwie wartości, rzucając wyjątek w przypadku przepełnienia");
        System.out.println("addExact(100, 200) = " + Math.addExact(100, 200));
        System.out.println();

        System.out.println("copySign: Zwraca pierwszy argument z tym samym znakiem, co drugi argument");
        System.out.println("copySign(123.4, -1.0) = " + Math.copySign(123.4, -1.0));
        System.out.println();

        System.out.println("decrementExact: Dekrementuje argument, rzucając wyjątek w przypadku przepełnienia");
        System.out.println("decrementExact(5) = " + Math.decrementExact(5));
        System.out.println();

        System.out.println("expm1: Zwraca e^x - 1");
        System.out.println("expm1(2) = " + Math.expm1(2));
        System.out.println();

        System.out.println("floorDiv: Dzieli dwie wartości, zaokrąglając wynik w dół");
        System.out.println("floorDiv(7, 3) = " + Math.floorDiv(7, 3));
        System.out.println();

        System.out.println("floorMod: Zwraca resztę z dzielenia (modulus), zaokrąglając wynik w dół");
        System.out.println("floorMod(7, 3) = " + Math.floorMod(7, 3));
        System.out.println();

        System.out.println("getExponent: Zwraca wykładnik używany w reprezentacji liczby zmiennoprzecinkowej");
        System.out.println("getExponent(123.45) = " + Math.getExponent(123.45));
        System.out.println();

        System.out.println("hypot: Zwraca sqrt(x^2 + y^2) bez przepełnienia pośredniego");
        System.out.println("hypot(3, 4) = " + Math.hypot(3, 4));
        System.out.println();

        System.out.println("IEEERemainder: Zwraca resztę dzielenia zgodnie ze standardem IEEE");
        System.out.println("IEEERemainder(7.0, 3.0) = " + Math.IEEEremainder(7.0, 3.0));
        System.out.println();

        System.out.println("incrementExact: Inkrementuje argument, rzucając wyjątek w przypadku przepełnienia");
        System.out.println("incrementExact(5) = " + Math.incrementExact(5));
        System.out.println();

        System.out.println("max: Zwraca większy z dwóch argumentów");
        System.out.println("max(10, 20) = " + Math.max(10, 20));
        System.out.println();

        System.out.println("min: Zwraca mniejszy z dwóch argumentów");
        System.out.println("min(10, 20) = " + Math.min(10, 20));
        System.out.println();

        System.out.println("multiplyExact: Mnoży dwie wartości, rzucając wyjątek w przypadku przepełnienia");
        System.out.println("multiplyExact(10, 20) = " + Math.multiplyExact(10, 20));
        System.out.println();

        System.out.println("negateExact: Zmienia znak wartości, rzucając wyjątek w przypadku przepełnienia");
        System.out.println("negateExact(10) = " + Math.negateExact(10));
        System.out.println();

        System.out.println("nextDown: Zwraca najbliższą mniejszą wartość zmiennoprzecinkową");
        System.out.println("nextDown(1.23) = " + Math.nextDown(1.23));
        System.out.println();

        System.out.println("nextUp: Zwraca najbliższą większą wartość zmiennoprzecinkową");
        System.out.println("nextUp(1.23) = " + Math.nextUp(1.23));
        System.out.println();

        System.out.println("nextAfter: Zwraca wartość zmiennoprzecinkową sąsiednią w kierunku drugiego argumentu");
        System.out.println("nextAfter(1.23, 5.67) = " + Math.nextAfter(1.23, 5.67));
        System.out.println();

        System.out.println("random: Zwraca losową wartość z zakresu [0, 1)");
        System.out.println("random() = " + Math.random());
        System.out.println();

        System.out.println("rint: Zwraca najbliższą wartość całkowitą liczby zmiennoprzecinkowej");
        System.out.println("rint(1.23) = " + Math.rint(1.23));
        System.out.println();

        System.out.println("scalb: Mnoży liczbę zmiennoprzecinkową przez 2 podniesione do potęgi");
        System.out.println("scalb(1.5, 2) = " + Math.scalb(1.5, 2));
        System.out.println();

        System.out.println("signum: Zwraca wartość znaku funkcji");
        System.out.println("signum(-123.45) = " + Math.signum(-123.45));
        System.out.println();

        System.out.println("subtractExact: Odejmuje dwie wartości, rzucając wyjątek w przypadku przepełnienia");
        System.out.println("subtractExact(100, 50) = " + Math.subtractExact(100, 50));
        System.out.println();

        System.out.println("toDegrees: Konwertuje kąt z radianów na stopnie");
        System.out.println("toDegrees(3.14159) = " + Math.toDegrees(3.14159));
        System.out.println();

        System.out.println("toIntExact: Konwertuje wartość na int, rzucając wyjątek w przypadku przepełnienia");
        System.out.println("toIntExact(100L) = " + Math.toIntExact(100L));
        System.out.println();

        System.out.println("toRadians: Konwertuje kąt ze stopni na radiany");
        System.out.println("toRadians(180) = " + Math.toRadians(180));
    }
}
