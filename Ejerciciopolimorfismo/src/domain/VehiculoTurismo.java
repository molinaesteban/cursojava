package domain;

public class VehiculoTurismo extends Vehiculo {
     private int numeroPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }


    public String mostrarDatos() {
        System.out.println("El numero de puertas es: "+ numeroPuertas);
        return super.mostrardatos();
    }
}
