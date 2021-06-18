package test;
import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        //datos.insertar();
        //imprimir(datos);

        datos = new ImplementacionOracle();
        //datos.listar();
        //imprimir(datos);
        imprimir(datos);
    }

    //Metodo generico que recibe dato de tipo interface
    public static void imprimir(IAccesoDatos datos){
        datos.eliminar();
    }
}
