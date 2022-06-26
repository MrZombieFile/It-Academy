package Exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda2 {

    public static String[] cadenaStrings = {"Hello", "Bonjour le monde", "Hola Mundo", "Hola Món", "Hallo Welt", "Witaj świecie", "Привет, мир", "Helo Byd", "Hej Verden", "Hallo Wereld"};

    public static void main(String[] args){

        List<String> llistatAmbOi5 = Arrays.stream(cadenaStrings)
                .filter(x -> x.contains("o"))
                .filter(x -> x.length() >5)
                .collect(Collectors.toList());

        System.out.println(llistatAmbOi5);

    }




}
