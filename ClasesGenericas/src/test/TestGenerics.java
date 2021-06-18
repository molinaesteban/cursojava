package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica <Integer> objetoInt = new ClaseGenerica<>(15);
        objetoInt.getObjeto();


        ClaseGenerica<String>objectoString = new ClaseGenerica<>("juan");
        objectoString.getObjeto();


        ClaseGenerica<Character> objetoChar = new ClaseGenerica<>('c');
        objetoChar.getObjeto();


    }
}
