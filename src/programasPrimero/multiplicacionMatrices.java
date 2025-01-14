package programasPrimero;
import javax.swing.JOptionPane;

public class multiplicacionMatrices {
    public static void main(String[] args) {

        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] mr = new int[3][3];

        System.out.println("Arreglo1");
         System.out.println("__________________");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa"
                        + " valor para el arreglo1"));
                System.out.print(m1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("arreglo2");
        System.out.println("__________________");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa "
                        + "valor para el arreglo2"));
                System.out.print(m2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("resultados");
        System.out.println("__________________");
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) {  
                mr[i][j] = m1[i][j] * m2[2 - i][2 - j];
                System.out.print(mr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
