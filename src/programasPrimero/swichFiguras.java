package programasPrimero;
import javax.swing.JOptionPane; //Importacion de la clase de cierto paquete

public class swichFiguras {  //Definir la clase, en este caso el publico o el
    //amigable
    public static void main(String[] gaby) { //Es un metodo, se caracteriza por
        //que tiene parentesis y la llave
        
        byte opcion; //declaracion de variables y su asigancion de que tipo es.
        double a = 0, b=0, h=0, r=0;
        opcion = Byte.parseByte(JOptionPane.showInputDialog("MENU DE OPCIONES \n "
                + "1.- TRIANGULO \n 2.- RECTANGULO \n 3.- CIRCULO \n Escribe el "
                + "numero de tu eleccion "));   
         
        switch (opcion){
            case 1 -> {
                b = Double.parseDouble(JOptionPane.showInputDialog("Digite un valor "
                        + "para la base: "));
                h = Double.parseDouble(JOptionPane.showInputDialog("Digite un valor"
                        + " para la altura: "));
                a = (b*h)/2;
            }
            case 2 -> {
                b = Double.parseDouble(JOptionPane.showInputDialog("Digite un valor"
                        + " para la base: " ));
                h = Double.parseDouble(JOptionPane.showInputDialog("Digite un valor "
                        + "para la altura:" ));
                a = b *h;
            }
            case 3 -> {
                r = Double.parseDouble(JOptionPane.showInputDialog("Digite un valor "
                        + "para la el radio: "));
                a = ((double) Math.PI * (r*r));
            }
            default -> JOptionPane.showMessageDialog(null,("Solo es posible elegir "
                    + "1, 2 o 3 \n Intente nuevamente. "));
                }
        JOptionPane.showMessageDialog(null, ("El resultado del area de: " + a ));
    } //cierra el metodo main
} //cierra la clase 
