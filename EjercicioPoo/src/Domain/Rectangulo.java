package Domain;

public class Rectangulo extends Poligono {
    double lado1,lado2;

    public Rectangulo( double lado1 , double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo{"+super.toString()+
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                '}';
    }

    @Override
    public double Area() {
        double area;
        area = this.lado2 * this.lado1;
        return  area;

    }

}
