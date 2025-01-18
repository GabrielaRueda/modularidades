package programasPrimero;
public class arbolNavideño { 
    
    public void Fac(String[] args) {
        
        int altura = 10;      
        System.out.printf("""
                          ¡Feliz Navidad y Prospero Anio Nuevo!
                          """); 
        
        for (int i = 0; i < altura; i++) {
            for (int j = altura - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }   
            for (int i = 0; i < altura / 3; i++) {
            for (int j = 0; j < altura - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("** ");
        }
            System.out.printf("""
                              ¡Que todos sus deseos se hagan realidad
                              Bendiciones y Felices Fiestas!
                              """); 
    }
}

