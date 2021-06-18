package Aritmetica;

import exepciones.OperacionesExcepcion;

public class Aritmetica {
    public static int division (int numerador, int denominador) throws OperacionesExcepcion{
        if (denominador == 0){
            throw new OperacionesExcepcion("Division entre cero");

        }
        return numerador/denominador;
    }
}
