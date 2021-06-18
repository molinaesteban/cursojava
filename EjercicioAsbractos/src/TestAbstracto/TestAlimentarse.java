package TestAbstracto;

import dominio.AnimalCarnivoro;
import dominio.Planta;
import dominio.Servivo;

public class TestAlimentarse {
    public static void main(String[] args) {
        Planta mango = new Planta();
        mango.alimentarse();

        AnimalCarnivoro tigre = new AnimalCarnivoro();
        tigre.alimentarse();


    }
}
