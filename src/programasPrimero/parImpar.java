package programasPrimero;
import javax.swing.JOptionPane;

public class parImpar {
    public static void main(String[] args) {
        
      short N;
      N=Short.parseShort(JOptionPane.showInputDialog("Favor de ingresar un numero: "));
     
      if (N % 2 == 0){
          JOptionPane.showMessageDialog(null,"El numero " + N +  " es par. ");
          
    } else {
          JOptionPane.showMessageDialog(null,"El numero " + N +  " es impar. ");
          
      }
}
}