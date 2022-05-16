package Tasca8Lambdas.nivell1.Ex2;

import java.util.ArrayList;

public class Filtrar {


    public static ArrayList<String> filtrar(String[] cadenaStrings, char AFiltrar, int mesDeXLletres){
        ArrayList<String> array = new ArrayList<>();
        for (String element : cadenaStrings){
            if (!element.contains(String.valueOf(AFiltrar)) || element.length() >= mesDeXLletres) {
                array.add(element);
            }

        }

        return array;
    }
}
