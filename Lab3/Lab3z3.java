package Lab3;
public class Lab3z3 {
    public static void main(String args[]) {
        int y[][] = new int[3][3];
        Tab2DReadPrint obj = new Tab2DReadPrint();
        obj.readTab2D(y);
        obj.printTab2D(y);
        obj.transpose2D(y);
    }
}

class Tab2DReadPrint {
    public void readTab2D(int tab[][]) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (i + 1) * (j + 2);
            }
        }
    }

    public void printTab2D(int tab[][]) {
        System.out.println("Tablica: ");
        for (int x[] : tab) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    public void transpose2D(int tab[][]) {
        int tab2[][] = new int[3][3];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab2[i][j] = tab[j][i];
            }
        }
        System.out.println("Transponowana tablica: ");
        for (int x[] : tab2) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
