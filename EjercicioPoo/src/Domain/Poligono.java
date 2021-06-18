package Domain;

public abstract class Poligono  {
    protected  int numerolados;
public  abstract double Area();

    public Poligono(int numerolados) {
        this.numerolados = numerolados;
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "numerolados=" + numerolados +
                '}';
    }

}
