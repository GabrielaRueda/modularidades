package programasPrimero;
public class tablasMultiplicar {
    public static void main(String[] args) {
        
        int n = 10;
        for (int x = 1; x <= n; x++) {
            System.out.printf(("Tabla del " + x + "\t"));
        }
        System.out.println();
        for (int y = 1; y <= n; y++) {
            for (int x = 1; x <= n; x++) {
                System.out.printf(x + " * " + y + " = " + (x * y) + "\t");
            }
            System.out.println();
        }
    }
}