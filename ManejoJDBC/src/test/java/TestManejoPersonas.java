

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.List;


public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();


        //Insertando un nuevo objeto de tipo persona
       // Persona personanueva = new Persona("carlos","carlosmail2@gmail.com");
       // personaDAO.insertar(personanueva);


        //eliminar un registro

        Persona personaEliminar = new Persona(6);
        personaDAO.eliminar(personaEliminar);

        //atualizar
       // Persona personaUpdate = new Persona(4,"esteban","esteban12@gmail.com");
       //personaDAO.atualizar(personaUpdate);

        //Listado de personas
       List<Persona> personaList = personaDAO.seleccionar();
       //imprimir la lista
       personaList.stream().map(persona -> "persona = " + persona).forEach(System.out::println);









    }


}
