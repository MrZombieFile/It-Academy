package Exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda1 {

    public static void main(String[] args){

        String[] cadenaStrings = {"Hello World", "Bonjour le monde", "Hola Mundo", "Hola Món", "Hallo Welt", "Witaj świecie", "Привет, мир", "Helo Byd", "Hej Verden", "Hallo Wereld"};

        List<String> ambLaO = Arrays.stream(cadenaStrings)
                .filter(x -> x.contains("o"))
                .collect(Collectors.toList());

        System.out.println(ambLaO);


    }



}