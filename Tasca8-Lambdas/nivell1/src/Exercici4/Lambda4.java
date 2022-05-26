package Exercici4;

import java.util.Arrays;

public class Lambda4 {

    public static void main (String[] args){
        String[] mesosDeLAny = {"Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Decembre"};

        Arrays.asList(mesosDeLAny).stream().forEach(System.out::println);

    }


}
