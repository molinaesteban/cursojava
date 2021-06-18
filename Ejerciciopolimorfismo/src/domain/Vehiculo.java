package domain;

public class Vehiculo {
    protected  String marca,modelo,matricula;

    public Vehiculo(String marca,String modelo,String matricula) {
        this.marca= marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }


    public String mostrardatos() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
