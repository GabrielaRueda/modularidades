package programasPrimero;
import javax.swing.JOptionPane;
 
public class tresVariables {
   public void Fac(String[] args) {
   
   short A, B, C ;
   A=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor para  A:"));
    B=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor para B:"));
     C=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor para C:"));
        
        if ( A > B && A > C){
            JOptionPane.showMessageDialog(null,A + " es el mayor.");
           
        } else if ( B > A && B > C ){
              JOptionPane.showMessageDialog(null,B + " es el mayor.");
          
        } else {
             JOptionPane.showMessageDialog(null,C + " es el mayor.");
           
            
        }
         
    }
}
