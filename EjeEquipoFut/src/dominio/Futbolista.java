package dominio;

public class Futbolista extends Persona{
   protected int dorsal;
   protected String pocicion;

    public Futbolista(String nombre, String apellido, int edad, int dorsal,String pocicion)
    {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.pocicion= pocicion;
    }

    @Override
    public String toString() {
        return "Futbolista{" + super.toString()+
                "dorsal=" + dorsal +
                ", pocicion='" + pocicion + '\'' +
                '}';
    }
}




