import datos.Conexion;
import datos.DAOpersona;
import datos.PersonaDAOJDBC;
import domain.Persona;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ManejoPersonas {
    public static void main(String[] args) {

        Connection conexion = null; // la conexion se maneja fuera del la clase jdb por eso se instancia

        try {
            conexion = Conexion.getConnection();


            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            //comprovacion del que el commint no este en true para cuando se ejecuten las setencias no halla autcommit
            // solo hasta que se haga commit maual.

            DAOpersona DAOpersona = new PersonaDAOJDBC(conexion); // se declara la variable con la interface

            List<Persona> personaDAOList =  DAOpersona.seleccionar();

            for(Persona persona : personaDAOList){
                System.out.println("persona DTO = " + persona);
            }


            //se utiliza el constructor que recibe la conexion para que tengamos la oportunidad de hacer commint o roolback

            /*Persona cambioPersona = new Persona();
            cambioPersona.setIdpersona(2);
            cambioPersona.setEmail("magdamar89@gmail.com");
            personaDAO.actualizar(cambioPersona); //se pasa el objeto completo cambio persona para modificar

            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("carlos");
            nuevaPersona.setEmail("carlos141@gmail.com");
            personaDAO.insertar(nuevaPersona); */

            //commit de la transaccion.

            conexion.commit();
            System.out.println("se ha realizado el commit");


        } catch (SQLException throwables) {
            throwables.printStackTrace(System.out);
            System.out.println("entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }

        }


    }
}