package Principal;//crear un programas
import javax.swing.JOptionPane; //importar una clase 
import programasPrimero.*;

public class Menu {
    
    protected int x;    
   public static void main (String []args){ //metodo principal
        byte seleccion; //declaracion de variables
         int doo;
         
     do {
        seleccion=Byte.parseByte(JOptionPane.showInputDialog("Estas son las "
                + "opciones de los programas que puede ejecutar: \n"
                + "Seleccione un numero para seguir con el programa. \n"
                + "\n"
                + "1. Ingresar dos nummeros y obtener el mayor.\n "
                + "2. Ingresar dos numeros y saber cual es el mayor.\n"
                + "3. Obtener la hipotenusa de un triangulo rectangulo.\n"
                + "4. Obtener el area y volumen de un cilindro.\n"
                + "5. Determinar si un numero es par o impar.\n"
                + "6. Calificaciones.\n"
                + "7. Descuentos y ofertas de la cafeteria.\n"
                + "8. Bonos dependiendo de los talleres de TEC.\n "
                + "9. Calcular area de un rectangulo, circulo o triangulo.\n"
                + "10. Calcular de IMC. (Indice de Masa Corporal).\n"
                + "11. Obtener el factorial de un numero.\n"
                + "12. Obtener las tablas basicas de multiplicar.\n"
                + "13. Mostrar un arbol de navidad de asteriscos.\n"
                + "14. Obten tu promedio general y por unidad.\n"
                + "15. Obten una multiplicacion de dos matrices.\n"));
        
        switch(seleccion){
            case 1:
                dosValores1 objeto1=new dosValores1();
                objeto1.Fac(args);
                break; 
            case 2:
                tresVariables objeto2=new tresVariables();
                objeto2.Fac(args);
                break;
            case 3:
                hipotenusa objeto3=new hipotenusa();
                objeto3.Fac(args);
                break;
            case 4:
                areaVolumenCilindro objeto4=new areaVolumenCilindro();
                objeto4.Fac(args);
                break;
            case 5:
                parImpar objeto5=new parImpar();
                objeto5.Fac(args);
                break;
            case 6:
                calificaciones objeto6=new calificaciones();
                objeto6.Fac(args);
                break;
            case 7:
                bolitasColores objeto7=new bolitasColores();
                objeto7.Fac(args);
                break;
            case 8:
                talleres objeto8=new talleres();
                objeto8.Fac(args);
                break;
            case 9:
                swichFiguras objeto9=new swichFiguras();
                objeto9.Fac(args);
                break;
            case 10:
                cicloDoWhile objeto10=new cicloDoWhile();
                objeto10.Fac(args);
                break;
            case 11:
                factorial objeto11=new factorial();
                objeto11.Fac(args);
                break;
            case 12:
                tablasMultiplicar objeto12=new tablasMultiplicar();
                objeto12.Fac(args);
                break;
            case 13:
                arbolNavideño objeto13=new arbolNavideño();
                objeto13.Fac(args);
                break;
            case 14:
                promedioMatrices objeto14=new promedioMatrices();
                objeto14.Fac(args);
                break;
            case 15:
                multiplicacionMatrices objeto15=new multiplicacionMatrices();
                objeto15.Fac(args);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Intente nuevamente");
        }//cierra el switch
        doo=Integer.parseInt(JOptionPane.showInputDialog("Presiona '1' si quieres volver a ver el menú principal. "));
     }while(doo==1);
   }
}//cierrra la claes

