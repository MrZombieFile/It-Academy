package Tasca8Lambdas.nivell1.Ex1;

import java.util.ArrayList;

public class Filtrar {


    public static ArrayList<String> filtrar(String[] cadenaStrings, char AFiltrar){
        ArrayList<String> array = new ArrayList<>();
        for (String element : cadenaStrings){
            if (!element.contains(String.valueOf(AFiltrar))) {
                array.add(element);
            }

        }

        return array;
    }
}
