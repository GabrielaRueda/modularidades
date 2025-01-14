package Principal;//crear un programa
import javax.swing.JOptionPane; //importar una clase 
import programasPrimero.*;

public class Menu {
    
    protected int x;
    
    
    public static void main (String []args){ //metodo principal
        byte seleccion; //declaracion de variables
         String nom;
         
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
                
                break; 
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            default:
        }//cierra el switch
        nom=JOptionPane.showInputDialog("Ingresa tu nombre completo");
        
        
        /*Crear un objeto
        NombreClase identificadorObjeto = new Constructor()
        
        -NombreClase: Clase que contierne el metodo que se quiere invocar.
        -identificadorObjeto: Es el nombre del objeto en minusculas. 
        -new: Sirve para identificar que es un nuevo objeto y que se reserva un 
        espacio en memoria para el mismo
        -Constructor: Es un metodo especial que lleva mismo nombre de la clase que 
        contiene el metodoque m,andare a llamar y se coloca parentesis.  */
        
        Menu objeto=new Menu();  //creacionDeObjeto
        objeto.registroDatos(nom); //invocar al metodo con un objeto
        
        
    }//cierra el metodo principal
    
    /*segundo metodo SINTAXIS
    modificadorAcceso tipoRetorno identificador(lista de parametros){...}
    Donde: 
    -modificador de acceso puede ser: publico, amigable, private o protegido
    -tipo de retorno puede ser: byte, short, int,long, float, double, boolean, char(return)
                                string(return)
                                void //quiere decir sin ningun tipo de retorno significa vacio
    -identificador (nombre del metodo), inicia con minuscula, nomenglatura camello,_, sin espacios.
    -lista de parametros: tipoDato identificador, por cada uno de ellos.
    ejemplo:(byte x, byte y)
    */
    
    public static void imprimirMensaje(){
        System.out.println("Estamos a punto de concluir tu primer semestre y ya eres "
                + "programadora. ");
    }
    
    public static void  registroDatos(String nombre){ //la lista de metodos es llamada tambien signatura
        System.out.println("Bienvenida " + nombre);
        imprimirMensaje();
    }
}//cierrra la claes

