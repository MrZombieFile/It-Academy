package Exercici1;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda1 {

    public static String[] cadenaStrings = {"Hello World", "Bonjour le monde", "Hola Mundo", "Hola Món", "Hallo Welt", "Witaj świecie", "Привет, мир", "Helo Byd", "Hej Verden", "Hallo Wereld"};

    public static void main(String[] args){

        LletraO novaLlista = (cadenaStrings) -> {
            ArrayList<String> array = new ArrayList<>();
            for (String element : cadenaStrings){
                if (element.contains(String.valueOf('o'))) {
                    array.add(element);
                }

            }
            return array.toArray(new String[array.size()]);
        };

        System.out.println(Arrays.toString(novaLlista.tornarResultatsAmbO(cadenaStrings)));

    }




}