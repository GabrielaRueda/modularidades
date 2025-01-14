package programasPrimero;
import javax.swing.JOptionPane;

public class talleres {
    public static void main(String[] args) {
        String siguiente;
        double descuento, totalFinal;
        
        
        siguiente=(JOptionPane.showInputDialog("Dijite siguiente para continuar. " ));
        
        JOptionPane.showMessageDialog(null,"Los talleres que se encuentran disponibles son: ");  
        
       
            descuento= (189000/9000);
            totalFinal= (double) 9000;
            JOptionPane.showMessageDialog(null,"En el taller Basquetbol , el monto asignado es de: $" + totalFinal + " tomando en cuenta que tiene un descuento de: " + descuento + "%.");  
      
            descuento= (189000/15000);
            totalFinal= (double)15000;
            JOptionPane.showMessageDialog(null,"En el taller Volibol, el monto asignado es de: $" + totalFinal + " tomando en cuenta que tiene un descuento de: " + descuento + "%.");  
      
            descuento= (189000/50000);
            totalFinal= (double) 50000;
            JOptionPane.showMessageDialog(null,"En el taller Artes, el monto asignado es de: $" + totalFinal + " tomando en cuenta que tiene un descuento de: " + descuento + "%.");  
       
            descuento= (189000/15000);
            totalFinal= (double) 15000;
            JOptionPane.showMessageDialog(null,"En el taller Futbol, el monto asignado es de: $" + totalFinal + " tomando en cuenta que tiene un descuento de: " + descuento + "%.");  
      
            descuento= (189000/50000);
            totalFinal= (double) 50000;
            JOptionPane.showMessageDialog(null,"En el taller Taekwondo, el monto asignado es de: $" + totalFinal + " tomando en cuenta que tiene un descuento de: " + descuento + "%.");  
       
            descuento= (189000/25000);
            totalFinal= (double) 25000;
            JOptionPane.showMessageDialog(null,"En el taller Ajedrez, el monto asignado es de: $" + totalFinal + " tomando en cuenta que tiene un descuento de:" + descuento + ".");  
        
            descuento= (189000/12000);
            totalFinal= (double) 12000;
            JOptionPane.showMessageDialog(null,"En el taller Musica, el monto asignado es de: $" + totalFinal + " tomando en cuenta que tiene un descuento de:" + descuento + ".");  
       
            descuento= (189000/13000);
            totalFinal= (double) 13000;
            JOptionPane.showMessageDialog(null,"En el taller Atletismo, el monto asignado es de: $" + totalFinal + " tomando en cuenta que tiene un descuento de:" + descuento + ".");  
       
            JOptionPane.showMessageDialog(null,"Esto seria todo, GRACIAS. ");
        }
}
