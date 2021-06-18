package domain;

public class Rectangulo extends  FiguraGeometrica{
    public  Rectangulo (String TipoFigura){
        super(TipoFigura);
    }


    //implementacion de la clase padre
    @Override
    public void dibujar() {
        System.out.println("se imprime un :"+this.getClass().getSimpleName());

    }
}
