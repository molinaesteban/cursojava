package Test;

import static manejoarchivos.ManejoArchivos.leerArchivo;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var  nombreArchivo =   "juan.txt";
        /*anexarArchivo(nombreArchivo,"Java master");
        escribirArchivo(nombreArchivo,"Adios");
        escribirArchivo(nombreArchivo,"java master");
        anexarArchivo(nombreArchivo,"java master"); */
        leerArchivo(nombreArchivo);
    }


}
