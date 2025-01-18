package programasPrimero;
import javax.swing.JOptionPane;

public class cicloDoWhile {
    public void Fac(String[] args) {
        float estatura, imc;
        int peso;
        byte resp=0;
        do {
            peso=Integer.parseInt(JOptionPane.showInputDialog("Captura tu peso "
                    + "en (kg): "));
            estatura=Float.parseFloat(JOptionPane.showInputDialog("Captura "
                    + "estatura en forma de metros"));
            imc= (peso/(estatura*estatura));
            if(imc<18.49){
                JOptionPane.showMessageDialog(null, "Peso Bajo");
            }else if(imc>=18.50 && imc<= 24.99){
                JOptionPane.showMessageDialog(null, "Peso Normal");
            }else if(imc>=25 && imc<=29.99) {    
                JOptionPane.showMessageDialog(null, "Sobre Peso");
            }else if(imc>=30 && imc<=34.99) {    
                JOptionPane.showMessageDialog(null, "Obesidad leve");
            }else if(imc>=35 && imc<=39.99) {        
                JOptionPane.showMessageDialog(null, "Obesidad Media");
            }else{  
          
                JOptionPane.showMessageDialog(null, "Obesidad Morbida");  
                
            }
            resp=Byte.parseByte(JOptionPane.showInputDialog("Capture 1, si desea"
                    + " realizar otro calculo"));
        } while (resp==1);
        
    }
}
