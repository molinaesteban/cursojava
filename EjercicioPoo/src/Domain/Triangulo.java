package Domain;

public class Triangulo extends Poligono {
   private double lado1,lado2,lado3;

    public Triangulo(double lado1,double lado2,double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    @Override
    public double Area() {
        double area;
        area =this.lado1 * this.lado2 * this.lado3 / 2;

        return area;
    }

    @Override
    public String toString() {
        return "Triangulo{" + super.toString() +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }
}
