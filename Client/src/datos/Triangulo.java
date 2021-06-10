package datos;


public class Triangulo extends Figura  {


    public Triangulo() {
        super();
    }
    
    private Float resultado(){
        
        Float a=this.getAltura();
        Float b=this.getBase();        
        
        return (a*b)/2;
    }

    @Override
    public Float calcular() {
        // TODO Implement this method
        return resultado();
    }
}
