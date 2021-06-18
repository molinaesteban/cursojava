package accesodatos;

public  class ImplementacionMySql implements IAccesoDatos {


    @Override
    public void insertar() {
        System.out.println("insertar desde mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar dessde mysql");

    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde mysql");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde mysql");

    }
}
