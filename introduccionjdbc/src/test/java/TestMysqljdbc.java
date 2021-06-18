import java.sql.*;

public class TestMysqljdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezon=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Connection conexion = DriverManager.getConnection(url,"root","jmju17");
                Statement instruccion = conexion.createStatement();
                String sql = "SELECT idpersona,nombre,email FROM persona";
                ResultSet resultado = instruccion.executeQuery(sql);
                while (resultado.next()){
                    System.out.print("Id persona: "+ resultado.getInt("idpersona"));
                    System.out.print(" Nombre: "+resultado.getString("nombre"));
                    System.out.println(" Email: "+resultado.getString("email"));

                }
                resultado.close();
                instruccion.close();
                conexion.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace(System.out);
        }

    }
}
