package genericos;

public class ClaseGenerica <T> {
    protected T objeto;
    //Definicion de atributo generico

    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        System.out.println("El tipo t es: "+objeto.getClass().getSimpleName());
        return objeto;
    }
}
