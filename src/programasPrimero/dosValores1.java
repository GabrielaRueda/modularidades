package programasPrimero;
import javax.swing.JOptionPane;

public class dosValores1 {
    public static void main(String[] args) {
        
        short A=0, B=0;
        A=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor de  A:"));
        B=Short.parseShort(JOptionPane.showInputDialog("Ingrese un valor diferente para B:"));
         
         if (A == B){
             JOptionPane.showMessageDialog(null,"Los valores son iguales, deben ser distintos");
             
         }else if(A > B){
             
             JOptionPane.showMessageDialog(null,A + " es mayor. ");
             
         } else if (B > A) {
             JOptionPane.showMessageDialog(null,B +" es mayor." );
            
         }
         
    } 
            
}