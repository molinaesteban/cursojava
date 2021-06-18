package mx.com.gm.peliculas.negocio;

public interface CatalogoPeliculas {
    String Nombre_Recurso= "peliculas.txt";
    void agregarPelicula(String nombrePelicula);
    void listarPeliculas();
    void buscarPelicula(String buscar);
    void iniciarCatalogoPeliculas();
}
