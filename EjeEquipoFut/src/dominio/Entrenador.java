package dominio;

public class Entrenador extends  Persona{
    protected String Estrategia;

    public Entrenador(String estrategia,String nombre,String apellido,int edad)
    {
        super(nombre,apellido,edad);
        Estrategia = estrategia;
    }

    @Override
    public String toString() {
        return "Entrenador{" + super.toString() +
                "Estrategia='" + Estrategia + '\'' +
                '}';
    }
}
