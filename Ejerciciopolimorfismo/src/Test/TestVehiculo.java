package Test;

import domain.Vehiculo;
import domain.VehiculoDeportivo;
import domain.VehiculoFurgoneta;
import domain.VehiculoTurismo;

public class TestVehiculo {
    public static void main(String[] args) {
        Vehiculo misVehiculos [] = new Vehiculo[4];
        misVehiculos[0] = new Vehiculo("ferrari","A98","GFD1");
        misVehiculos [1] = new VehiculoTurismo("AB23","Mazda","XZ",4);
        misVehiculos [2] = new VehiculoDeportivo("20AS","mercedes","AMG",3000);
        misVehiculos [3]= new VehiculoFurgoneta("98MG","Toyota","TXL",2000);
        for (Vehiculo Vehiculos:misVehiculos){
            System.out.println(Vehiculos.mostrardatos());
        }

        
    }

}
