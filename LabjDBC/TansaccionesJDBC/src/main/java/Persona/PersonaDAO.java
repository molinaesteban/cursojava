package Persona;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Conexion.Conexion;

public class PersonaDAO {

    private Connection conexionTransaccional; // atributo que recibe un objeto coneccion fuera de esta clase

    private static final String SQL_SELECT = "select idpersona,nombre,email from persona"; //Definicion de la sentencia sql
    private static final String SQL_INSERT = "insert into persona(nombre,email) values (?,?)";
    private static final String SQL_DELETE = "DELETE FROM persona where idpersona  = ?";
    private static final String SQL_UPDATE = "UPDATE  persona SET nombre = ? ,email  = ? where idpersona = ?";

    /*  en el values
     en vez de llenar las columnas se coloca ? para despues usar el metodo por referencia.
    */

    public PersonaDAO() {
    }

    public PersonaDAO(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    } // constructor que recibe el objeto de tipo coneccion



    //regresa lista de tipo persona
    public List<Persona> seleccionar() throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {
            connection = this.conexionTransaccional !=null? this.conexionTransaccional : Conexion.getConnection();

            statement = connection.prepareStatement(SQL_SELECT);
            resultSet = statement.executeQuery(); //Ejecutal la sentencia sql-

            while (resultSet.next()) // iteracion del resultado de la consulta
            {
                int idpersona = resultSet.getInt("idpersona");
                String nombre = resultSet.getString("nombre");
                String email = resultSet.getString("email");

                persona = new Persona(idpersona, nombre, email);

                personas.add(persona);

            }
        }

        finally {
            try {
                Conexion.close(statement); //cerrar conexion
                Conexion.close(resultSet);
                if (this.conexionTransaccional == null){
                    Conexion.close(connection);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return personas;

    }

    public int insertar(Persona persona) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int registros = 0; //Variable para saber cuatos registros se modifican
        try {
            connection = this.conexionTransaccional !=null? this.conexionTransaccional : Conexion.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(1, persona.getNombre());
            preparedStatement.setString(2, persona.getEmail());
            // en caso de que los valores con tengan otro tipo de dato que no sea String se usa el set'Variable' pertinente
            registros = preparedStatement.executeUpdate();//executeUpdate atualiza el estado en la base de datos

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                Conexion.close(preparedStatement);
                if (this.conexionTransaccional == null){
                    Conexion.close(connection);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

        return registros;

    }

    public int eliminar(Persona persona) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registros = 0;

        try {
            connection = this.conexionTransaccional !=null? this.conexionTransaccional : Conexion.getConnection();
            preparedStatement = connection.prepareStatement(SQL_DELETE);
            preparedStatement.setInt(1, persona.getIdpersona());
            registros = preparedStatement.executeUpdate(); // regresa la cantidad de registros modificados
        } finally {

                Conexion.close(preparedStatement);
                if (this.conexionTransaccional == null){
                    Conexion.close(connection);
                }
            }


            return registros;

        }


    public int atualizar (Persona persona) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registros = 0;
    try{
        connection = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
        preparedStatement = connection.prepareStatement(SQL_UPDATE);
        preparedStatement.setString(1, persona.getNombre());
        preparedStatement.setString(2, persona.getEmail());
        preparedStatement.setInt(3, persona.getIdpersona());
        registros = preparedStatement.executeUpdate();

    }finally {
            try {
                Conexion.close(preparedStatement);
                if (this.conexionTransaccional == null){
                    Conexion.close(connection);
                }            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        return registros;


    }
}
