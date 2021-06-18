package domain;

public class VehiculoFurgoneta extends Vehiculo {
int Carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        Carga = carga;
    }

    public int getCarga() {
        return Carga;
    }

    @Override
    public String mostrardatos() {
        System.out.println("Carga = " + Carga);
        return super.mostrardatos();
    }
}

