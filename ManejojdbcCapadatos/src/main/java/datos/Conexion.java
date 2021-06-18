package datos;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class Conexion {
    private static final String JDBC_URL ="jdbc:mysql://localhost:3306/test?useSSL=false&useTimezon=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "jmju17";

    //metodo que va a inicializar el pool de conexiones y solicitar una conexion a la base de datos

    public static DataSource getDataSource (){
        BasicDataSource dataSource = new BasicDataSource();
        //valores de configuracion del pool
        dataSource.setUrl(JDBC_URL);
        dataSource.setUsername(JDBC_USER);
        dataSource.setPassword(JDBC_PASSWORD);
        //definimos el tamaño inicial del pool de conexiones
        dataSource.setInitialSize(5); // cuantas conexiones inicializar por default
        return dataSource;
    }

    public static Connection getConnection() throws SQLException {
        return  getDataSource().getConnection();

    }
    public static void close(ResultSet rs) throws SQLException {
        rs.close();

    }

    public static void close (Statement statement){

    }

    public static void close(PreparedStatement statement) throws SQLException {
        statement.close();
    }
    public static void close (Connection connection) throws SQLException {
        connection.close();

    }

}
