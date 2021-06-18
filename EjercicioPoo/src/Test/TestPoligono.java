package Test;

import Domain.Poligono;
import Domain.Rectangulo;
import Domain.Triangulo;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPoligono {
    //Arreglo dinamico
    static ArrayList <Poligono> poligono = new ArrayList <Poligono>();
    static Scanner leer = new Scanner(System.in);

    public static void llebnarPoligono(){
        int opcion = 0;
        char respuesta ;
        do {
            do {
                System.out.println("Digite que poligono desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.println("Opcion: ");
                opcion = leer.nextInt();

            }while (opcion <1 || opcion>2);

            switch (opcion){
                case 1 : llenarTriangulo();
                    break;
                case 2: llenarRectangulo();
                    break;

            }
            System.out.println("\nDesea introducir otro poligono (s/n): ");
            respuesta = leer.next().charAt(0);
            System.out.println("");


        }while (respuesta == 's' || respuesta == 'S');

        }
        public static void llenarTriangulo(){
        double lado1,lado2,lado3;
            System.out.println("Digite el lado1 del Triangulo");
            lado1 = leer.nextDouble();
            System.out.println("Digite el lado2 del Triangulo");
            lado2 = leer.nextDouble();
            System.out.println("Digite el lado3 del Triangulo");
            lado3 = leer.nextDouble();
            Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
            poligono.add(triangulo); // Almacenamiento del objeto en el array list por polimorfismo
        }
        public  static void llenarRectangulo(){
        double lado1,lado2;
        System.out.println("Digite el lado1 del Rectangulo");
        lado1 = leer.nextDouble();
        System.out.println("Digite el lado2 del Rectangulo");
        lado2 = leer.nextDouble();
        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        poligono.add(rectangulo);


    }
    public  static  void mostrarResultados(){
        //Recorriendo el arreglo de poligonos
        for (Poligono poli:poligono){
            System.out.println(poli.toString());
            System.out.println("Area ="+ poli.Area());

        }
    }


    public static void main(String[] args) {
        llebnarPoligono();
        mostrarResultados();



    }
}
