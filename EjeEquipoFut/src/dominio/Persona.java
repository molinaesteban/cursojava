package dominio;

public class Persona {
    String nombre,apellido;
    int edad;

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido= apellido;
        this.edad = edad;

    }
}
