package Exercici6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda6 {

    public static void main (String[] args){
        Object[] llista = {"ºººººººº", 213 , 11222, "ºººº", 987, "ººººº", "ººº", 668678, 564, "ººººººº", 0, "ºººººº"};

        List<String> llistatOrdenat = Arrays.stream(llista)
                .filter(x -> x instanceof String)
                .map(x -> (String) x)
                .collect(Collectors.toList());

        llistatOrdenat.sort((a, b) -> a.length() - b.length());

        System.out.println(llistatOrdenat);

    }


}
