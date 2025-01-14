package programasPrimero;
import javax.swing.JOptionPane;

public class areaVolumenCilindro {
    public static void main(String[] args) {
        
        short R=0, H=0, volumen, area;
         R=Short.parseShort(JOptionPane.showInputDialog("Digite el valor del Radio:"));
        
         H=Short.parseShort(JOptionPane.showInputDialog("Digite el valor de la Altura:"));
        
        area=(short) (Math.PI * Math.pow(R, 2));
        
        JOptionPane.showMessageDialog(null,"El area del cilindro es: " + area + ".");
        
       System.out.println();
        
         volumen= (short)( area * H);
         JOptionPane.showMessageDialog(null,"El volumen del cilindro es: " + volumen +". ");
             
   }
}
