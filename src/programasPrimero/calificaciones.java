package programasPrimero;
import javax.swing.JOptionPane;

public class calificaciones {
    public void Fac(String[] args) {
   
        int Nota;
        
        Nota=Short.parseShort(JOptionPane.showInputDialog("Favor de ingresar un numero: "));
        
       
        
        
        if  (Nota>=19 && Nota<=20) {
            JOptionPane.showMessageDialog(null,"Su nueva nota es: " + "A. ");
        } else if (Nota>=16 && Nota<=18 ){
            JOptionPane.showMessageDialog(null,"Su nueva nota es: " + "B. ");
        } else if (Nota>=13 && Nota<=15){
            JOptionPane.showMessageDialog(null,"Su nueva nota es: " + "C. ");
         } else if ( Nota>=10 && Nota<=12 ){
            JOptionPane.showMessageDialog(null,"Su nueva nota es: " + "D. ");
        } else if (   Nota>=1 && Nota<=9  ){
            JOptionPane.showMessageDialog(null,"Su nueva nota es: " + "E. ");
        } else {
             JOptionPane.showMessageDialog(null,"Su nota es invalida.");
        }
    }
}
