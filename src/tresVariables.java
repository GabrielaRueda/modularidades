import javax.swing.JOptionPane;
 
public class tresVariables {
    public static void main(String[] args) {
 //  Scanner a = new Scanner(System.in);
   
   short A, B, C ;
   A=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor para  A:"));
    B=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor para B:"));
     C=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor para C:"));
       /* System.out.println("Ingrese un valor para A");
        A=a.nextInt();
        System.out.println("Ingrese un valor para B");
        B=a.nextInt();
        System.out.println("Ingrese un valor para C");
        C=a.nextInt();*/
        
        if ( A > B && A > C){
            JOptionPane.showMessageDialog(null,A + " es el mayor.");
           // System.out.println( A + " es el mayor.");
        } else if ( B > A && B > C ){
              JOptionPane.showMessageDialog(null,B + " es el mayor.");
          //  System.out.println( B + " es el mayor. " );
        } else {
             JOptionPane.showMessageDialog(null,C + " es el mayor.");
           // System.out.println(C + " es el mayor. ");
            
        }
         
    }
}
