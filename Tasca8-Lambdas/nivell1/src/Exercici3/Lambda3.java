package Exercici3;

import java.util.Arrays;

public class Lambda3 {

    public static void main (String[] args){
        String[] mesosDeLAny = {"Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Decembre"};

        Arrays.asList(mesosDeLAny).stream().forEach((mes)-> System.out.println(mes));

    }


}
