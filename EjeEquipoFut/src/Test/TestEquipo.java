package Test;

import dominio.Entrenador;
import dominio.Futbolista;
import dominio.Persona;


import java.util.ArrayList;
import java.util.Scanner;

public class TestEquipo {

    static ArrayList <Persona> Equipo = new ArrayList<Persona>();
    static Scanner leer = new Scanner(System.in);

    public static void crearEquipo() {
        int opcion = 0;
        char respuesta;


        do {
            System.out.println("Agregar miembro al equipo");
            System.out.println("1. Entrenador");
            System.out.println("2. juador");
            System.out.println("3. Doctor");
            System.out.println("Opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    llenarEntrenador();
                    break;
                case 2:
                    llenarJugador();
                    break;
                case 3:

                    break;

                default:
                    System.out.println("Solo opciones Entre 1 y 3");
            }

            System.out.println("\nDesea introducir otro mimbro del equipo (s/n): ");
            respuesta = leer.next().charAt(0);
        } while (respuesta == 's' || respuesta == 'S');
    }

        public static void llenarEntrenador() {
            String nombre, apellido;
            int edad;
            String estrategia;
            System.out.println("Digite el nombre del entrenador");
            nombre = leer.next();
            System.out.println("Digite el apellido del entranador");
            apellido = leer.next();
            System.out.println("Digite la edad del entranador");
            edad= leer.nextInt();
            System.out.println("Digite la estrategia del entrenador");
            estrategia = leer.next();
            Entrenador Entrenador = new Entrenador(estrategia,nombre,apellido,edad);

        }
        public static void llenarJugador (){
            String nombre, apellido,pocicion;
            int edad,dorsal;
            System.out.println("Digite el nombre del jugador");
            nombre = leer.next();
            System.out.println("Digite el apellido del jugador");
            apellido = leer.next();
            System.out.println("Digite la edad del juador");
            edad= leer.nextInt();
            System.out.println("Digite la pocicion de juador");
            pocicion = leer.next();
            System.out.println("Digite el numero de la camisa del juador: ");
            dorsal = leer.nextInt();

            Futbolista futbolista = new Futbolista(nombre,apellido,edad,dorsal,pocicion);

            }


            public static void main(String[] args) {
        crearEquipo();
        llenarEntrenador();
        llenarJugador();

    }


    }



