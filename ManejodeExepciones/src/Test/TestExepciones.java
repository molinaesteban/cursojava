package Test;

import Aritmetica.Aritmetica;
import exepciones.OperacionesExcepcion;

public class TestExepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = Aritmetica.division(10, 0);
        }catch (OperacionesExcepcion e){
            System.out.println("Ocurrio un error de tipo operacionExecepcion");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out);
        }
        finally {
            System.out.println("Se reviso la divicion entre cero");
        }

        System.out.println("resultado = " + resultado);
    }

}
