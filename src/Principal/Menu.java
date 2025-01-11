package Principal;//crear un programa
import javax.swing.JOptionPane; //importar una clase 
//Se van a importar las otras clases de esta manera "import nombreClase;

public class Menu {
    //atributo
    
    int x;
    
    //atributo es llamado asi porque esta declarado enre la clase principal y fuera de los metodos
    
    public static void main (String []args){ //metodo principal
        byte seleccion,a,b,c; //declaracion de variables
         String nom;
         
        seleccion=Byte.parseByte(JOptionPane.showInputDialog("Selecciona el "
                + " numero que corresponda a su eleccion"));
        
        switch(seleccion){
            case 1:
                break; //termina el caso
            case 2:
                break;//termina el caso
            case 3:
                break; //termina el caso
            default:
        }//cierra el switch
        nom=JOptionPane.showInputDialog("Ingresa tu nombre complteo");
        
        
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

