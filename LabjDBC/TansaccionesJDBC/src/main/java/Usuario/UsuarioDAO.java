package Usuario;

import Conexion.Conexion;
import Persona.PersonaDAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "select idusuario,usuario,password from usuario";
    private static final String SQL_INSERT = "insert into usuario (usuario,password) values (?,?)";
    private static final String SQL_DELETE = "delete from usuario where idusuario = ?";
    private static final String SQL_UPDATE = "UPDATE  usuario set usuario = ?, password = ?";

    public UsuarioDAO(){

    }

    public UsuarioDAO(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }


    public List<Usuario> seleccionaru() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Usuario usuario = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            connection = this.conexionTransaccional != null? this.conexionTransaccional : Conexion.getConnection();
            preparedStatement = connection.prepareStatement(SQL_SELECT);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idusuario = resultSet.getInt("idusuario");
                String usuarioo = resultSet.getString("usuario");
                String password = resultSet.getString("password");

                usuario = new Usuario(idusuario,usuarioo,password);
                usuarios.add(usuario);
            }


        } finally {
            try {
                Conexion.close(preparedStatement);
                Conexion.close(resultSet);
                Conexion.close(connection);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return usuarios;

    }


    public int insertar(Usuario usuario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        int registros = 0; //Variable para saber cuatos registros se modifican
        try {
            connection = this.conexionTransaccional !=null? this.conexionTransaccional : Conexion.getConnection();
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(1, usuario.getTipoUsuario());
            preparedStatement.setString(2, usuario.getPassword());
            // en caso de que los valores con tengan otro tipo de dato que no sea String se usa el set'Variable' pertinente
            registros = preparedStatement.executeUpdate();//executeUpdate atualiza el estado en la base de datos


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

    public int eliminar(Usuario usuario) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registros = 0;

        try {
            connection = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            preparedStatement = connection.prepareStatement(SQL_DELETE);
            preparedStatement.setInt(1, usuario.getIdusuario());
            registros = preparedStatement.executeUpdate(); // regresa la cantidad de registros modificados



        } finally {
            try {
                Conexion.close(preparedStatement);
                if (this.conexionTransaccional == null){
                    Conexion.close(connection);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


            return registros;

        }
    }

    public int atualizar(Usuario usuario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registros = 0;

        try {
            connection = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            preparedStatement = connection.prepareStatement(SQL_UPDATE);
            preparedStatement.setString(1, usuario.getTipoUsuario());
            preparedStatement.setString(2, usuario.getPassword());
            registros = preparedStatement.executeUpdate();

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
}
