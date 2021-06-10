package datos;

import javax.swing.JOptionPane;


public class Rectangulo extends Figura {


    public Rectangulo() {
        super();
    }

    
    private Float resultado(){
        
        Float a=this.getAltura();
        Float b=this.getBase();        
        
        return (a*b);
    }

    @Override
    public Float calcular() {
        // TODO Implement this method
        return resultado();
    } 
      
}
