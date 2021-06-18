package test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        ArrayList<String> miLista = new ArrayList<>();
        // List miLista = new ArrayList();
       miLista.add("lunes");
       miLista.add("martes");
       miLista.add("miercoles");
       miLista.add("jueves");
       miLista.add("Viernes");
       //imprimir(miLista);
       /* se implementa la lista de tipo arraylist en la interface collection que es la padre de list
      y arrayalist*/

        Map miMapa = new  HashMap();
        miMapa.put(1,"esteban");
        miMapa.put(2,"molina");
        miMapa.put(3,"magdalena");

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());

        Set miSet = new HashSet();
        miSet.add(1);
        miSet.add(2);
        miSet.add("a");
        imprimir(miSet);






    }
    public  static  void  imprimir(Collection coleccion){
    //funcion tipo lambda

        coleccion.stream().map(elemento -> "elemento: " + elemento).forEach(System.out::println);

    }

}
