package Tasca6Generics.nivell2;

import Tasca6Generics.nivell2.Persona;

public class GenericMethods2 {


    public static <T> void genericMethod(Object a, T b, T c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }


    public static void main(String[] args){

        Persona persona = new Persona("A", "F", 34);

        String text = "Hello Generics";

        int numero = 34;




        genericMethod(persona, text, numero);


    }





}
