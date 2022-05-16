package Tasca8Lambdas.nivell1.Ex2;

import java.util.ArrayList;

public class LambdasTwo {
    public static String[] cadenaStrings = {"Hello World", "Bonjour le monde", "Hola Mundo", "Hola Món", "Hallo Welt", "Witaj świecie", "Привет, мир", "Helo Byd", "Hej Verden", "Hallo Wereld"};




    public static void main(String[] args) {

        ArrayList<String> novaCadena = new ArrayList<String>();

        novaCadena = Filtrar.filtrar(cadenaStrings, 'o', 5);

        System.out.println(novaCadena);


    }


}