public class Lab3z1 {

    public static void main(String args[]) {
        double x[] = new double[5];
        readTab1D(x);
        printTab1d(x);
        maxMin(x);
    }

    public static void readTab1D(double x[]) {
        double z=1;
        for (int i = 0; i < 5; i++) {
            x[i] = z;
            z++;
        }
    }

    public static void printTab1d(double tab[]) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void maxMin(double tab[]) {
        double max = tab[0];
        double min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            } else if (tab[i] < min) {
                min = tab[i];
            }
        }
        System.out.println("Max: " + max + " Min: " + min);
    }
    
}
