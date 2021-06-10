package app;

import datos.Figura;
import datos.Rectangulo;
import datos.Triangulo;

public class Sistema {

    private static Triangulo tri = new Triangulo();
    private static Rectangulo rec = new Rectangulo();

    public Sistema() {
        super();
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        
        Float rt = tri.calcular();
        
        Float rr = rec.calcular();
        
            
        System.out.println(" " + rt.intValue() + " " );
        
        System.out.println(" " + rr.intValue() + " "  );
        
    }
    
    
}
