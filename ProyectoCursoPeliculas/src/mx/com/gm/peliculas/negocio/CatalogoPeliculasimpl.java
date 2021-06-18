package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.datos.AccesoDatos;
import mx.com.gm.peliculas.datos.ImplemtacionArchivo;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasimpl implements CatalogoPeliculas{


    public CatalogoPeliculasimpl() {
    }
    private AccesoDatos datos;

    public CatalogoPeliculasimpl(AccesoDatos datos) {
        this.datos = new ImplemtacionArchivo();

    }


    @Override
    public void agregarPelicula(String nombrePelicula) {
       Pelicula pelicula = new Pelicula (nombrePelicula);
       boolean anexar = false;
        try {
            anexar= datos.existe(Nombre_Recurso);
            datos.escribir(pelicula,Nombre_Recurso,anexar);
        } catch (AccesoDatosEx accesoDatosEx) {
            accesoDatosEx.printStackTrace(System.out);
        }


    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.listar(Nombre_Recurso);
            for (var pelicula:peliculas) {
                System.out.println("pelicula = " + pelicula);

            }
        } catch (LecturaDatosEx lecturaDatosEx) {
            lecturaDatosEx.printStackTrace();
        }


    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(Nombre_Recurso ,buscar);
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace();
        }
        System.out.println("resultado = " + resultado);
    }

    public void iniciarCatalogoPeliculas() {
        try {
            if(this.datos.existe(Nombre_Recurso)){
                datos.borrar(Nombre_Recurso);
                datos.crar(Nombre_Recurso);

            }
            else    datos.crar(Nombre_Recurso);
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace();
        }

    }
}
