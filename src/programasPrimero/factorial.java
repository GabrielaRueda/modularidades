package programasPrimero;
import javax.swing.JOptionPane;

public class factorial {
    public void Fac(String[] args) {
        int fact, num, x=1;
        byte resp=0;
        
         
        do{
            fact=1;
            num = Byte.parseByte(JOptionPane.showInputDialog("Escribe un numero del "
                + "que desea obtener el factorial. ")); 
        for(x = num; x>=1; x--){
            fact*=x;
        }
        
        JOptionPane.showMessageDialog(null,"El factorial de " + num + " es: " + fact);
        
              resp=Byte.parseByte(JOptionPane.showInputDialog("Capture 1, si desea realizar otro calculo"));
        }
              while (resp==1);
    }
}