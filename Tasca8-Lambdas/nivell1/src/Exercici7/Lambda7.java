package Exercici7;

import Exercici6.OrdenarStrings;
import Exercici6.StringAlone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Lambda7 {

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
            Arrays.sort(llistaNoOrdenada, (a, b) -> b.length() - a.length());
            return llistaNoOrdenada;
        };
        //La filtro i després la ordeno
        String[] novaLlista = ordre.ordenarStrings(stringAlone.filtrar(llista));

        for (String item: novaLlista) {
            System.out.println(item);
        }
    }


}
