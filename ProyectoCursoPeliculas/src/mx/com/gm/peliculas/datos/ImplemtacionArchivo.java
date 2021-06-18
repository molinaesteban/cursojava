package mx.com.gm.peliculas.datos;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ImplemtacionArchivo implements AccesoDatos {


    @Override
    public Boolean existe(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
         return archivo.exists();


    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        File archivo = new File(nombreRecurso);
        List <Pelicula> peliculaList = new ArrayList();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            try {
                linea = entrada.readLine();
                while (linea != null){
                    Pelicula pelicula = new Pelicula(linea);
                    peliculaList.add(pelicula);
                    linea = entrada.readLine();

                }
                entrada.close();
            } catch (IOException e) {
                e.printStackTrace();
                throw new LecturaDatosEx("Error al listar pelicula"+e.getMessage());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Error listar peliculas"+e.getMessage());
        }
        return peliculaList;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        var archivo = new File(nombreRecurso);
        try {
            var salida = new  PrintWriter(new FileWriter(archivo,anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se  ha escrito informacion al archivo: "+ pelicula);

        } catch (IOException e) {
            e.printStackTrace();
            throw new EscrituraDatosEx("Eror al escribir peliculas: "+ e.getMessage());
        }


    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        String resultado = null;
        try {
            var entrada = new   BufferedReader(new FileReader(archivo));
            String linea = null;
            try {
                linea = entrada.readLine();

            } catch (IOException e) {
                e.printStackTrace();
            }
            int indice = 1;
            while (linea != null){
                if (buscar != null && buscar.equals(linea)){
                    resultado = "Pelicula"+linea + "encontrada en el indicie: "+indice;
                    break;
                }
                linea = entrada.readLine();
                indice++;


            }
            entrada.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Error al buscar pelicula: "+ e.getMessage());
        }

        return resultado;
    }

    @Override
    public void crar(String nombreRecurso) throws AccesoDatosEx {
        var archivo = new File(nombreRecurso);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException e) {
            e.printStackTrace();
            throw new AccesoDatosEx("error al crear el archivo: "+e.getMessage());
        }


    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
        var archivo = new File(nombreRecurso);
        if(archivo.exists()){
            archivo.delete();
            System.out.println("se ha borrado el archivo");
        }

    }
}
