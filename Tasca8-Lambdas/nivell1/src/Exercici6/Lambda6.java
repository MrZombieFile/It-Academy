package Exercici6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda6 {

    public static void main (String[] args){
        Object[] llista = {"ºººººººº", 213 , 11222, "ºººº", 987, "ººººº", "ººº", 668678, 564, "ººººººº", 0, "ºººººº"};


        StringAlone stringAlone = (llistaBarrejada) -> {

            ArrayList<String> stringAloneList = new ArrayList<>();
            Arrays.stream(llistaBarrejada).forEach(
                    (i) -> {
                        if( i instanceof String) {
                            stringAloneList.add(i.toString());
                        }
                    }
            );
            return stringAloneList.toArray(new String[stringAloneList.size()]);

        };

        OrdenarStrings ordre = (llistaNoOrdenada) -> {
            Arrays.sort(llistaNoOrdenada, Comparator.comparingInt(String::length));
            return llistaNoOrdenada;
        };

        String[] novaLlista = ordre.ordenarStrings(stringAlone.filtrar(llista));

        for (String item: novaLlista) {
            System.out.println(item);
        }
    }


}
