package Exercici2;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda2 {

    //Si vull fer una variable global, la deixo abans o després del main?
    public static String[] cadenaStrings = {"Hello", "Bonjour le monde", "Hola Mundo", "Hola Món", "Hallo Welt", "Witaj świecie", "Привет, мир", "Helo Byd", "Hej Verden", "Hallo Wereld"};

    public static void main(String[] args){

        //imprimeixo la cadena original abans, i aixi es pot comparar a la consola.
        //El primer string és només Hello per a poder filtrarlo amb el 5 de length.
        System.out.println(Arrays.toString(cadenaStrings));

        Exercici1.LletraO novaLlista = (cadenaStrings) -> {
            ArrayList<String> array = new ArrayList<>();
            for (String element : cadenaStrings){
                if (element.contains(String.valueOf('o'))) {
                    array.add(element);
                }

            }
            return array.toArray(new String[array.size()]);
        };

        String[] llista = novaLlista.tornarResultatsAmbO(cadenaStrings);

        System.out.println(Arrays.toString(llista));

        MesDe5Lletres llistaFiltrada5Lletres = (cadenaStrings) -> {
            ArrayList<String> array = new ArrayList<>();
            for (String element : cadenaStrings){
                if (element.length() > 5) {
                    array.add(element);
                }

            }
            return array.toArray(new String[array.size()]);
        };

        String[] llista2 = llistaFiltrada5Lletres.mesDe5Lletres(llista);

        //El primer String té 5 lletres, el segon és "Bonjour le monde"
        System.out.println(Arrays.toString(llista2));


    }




}
