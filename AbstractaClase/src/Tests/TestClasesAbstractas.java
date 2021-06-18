package Tests;

import domain.FiguraGeometrica;
import domain.Rectangulo;

public class TestClasesAbstractas {

    public static void main(String[] args) {
        // upcasting se crea un objeto de tipo hijo y se le asinga al tipo padre.
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar(); // Se ejecuta el metodo de menor jerarquia = clase hija  y polimorfismo


    }
}
