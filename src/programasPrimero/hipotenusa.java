package programasPrimero;
import javax.swing.JOptionPane;

public class hipotenusa {
    public void Fac(String[] args) {
        
      double CatA=0, CatB=0, Hip;
       CatA=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor del Cateto A:"));
       CatB=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor del Cateto B:"));
        
           Hip= (double) Math.sqrt(Math.pow(CatA,2) + Math.pow(CatB,2));
           JOptionPane.showMessageDialog(null,"El resultado de la hipotenusa es de: " + Hip +". ");
       
    }
    }
