package mx.com.gm.peliculas.Test;
import mx.com.gm.peliculas.negocio.CatalogoPeliculas;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasimpl;

import java.util.Scanner;
public class Cpjlabfinal  {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CatalogoPeliculas catalogo = new CatalogoPeliculasimpl();


        var opcion = -1;
        while (opcion !=0){
            System.out.println("Elige una opcion: \n"+
                    "1. iniciar catalogo peliculas\n"+
                    "2. Agregar Peliculas \n"+
                    "3. Listar Peliculas\n"+
                    "4. Buscar Pelicula \n"+
                    "0. Salir");

            opcion =Integer.parseInt(leer.nextLine()) ;
            switch (opcion){
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("introduce el nombre de la pelicula");
                    var nombrePelicula = leer.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("introduce una pelicula para buscar");
                    var buscar = leer.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("opcion no reconocida");
                    break;

            }


        }

    }
}
