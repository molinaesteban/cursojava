package mx.com.gm.peliculas.datos;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

import java.util.List;


public interface AccesoDatos {
 Boolean existe(String nombreRecurso) throws AccesoDatosEx;
 List<Pelicula> listar (String nombreRecurso) throws LecturaDatosEx;
 void escribir (Pelicula pelicula,String nombreRecurso,boolean anexar) throws EscrituraDatosEx;
 String buscar (String nombreRecurso, String buscar)throws LecturaDatosEx;
 void crar(String nombreRecurso)throws AccesoDatosEx;
 void borrar(String nombreRecurso) throws AccesoDatosEx;

}
