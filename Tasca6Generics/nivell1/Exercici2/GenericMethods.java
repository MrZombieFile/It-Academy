package Tasca6Generics.nivell1.Exercici2;

public class GenericMethods {


    public static <T> void genericMethod(T a, T b, T c){
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
