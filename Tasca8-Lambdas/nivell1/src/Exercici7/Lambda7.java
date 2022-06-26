package Exercici7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda7 {

    public static void main (String[] args){
        Object[] llista = {"ºººººººº", 213 , 11222, "ºººº", 987, "ººººº", "ººº", 668678, 564, "ººººººº", 0, "ºººººº"};

        List<String> llistatOrdenat = Arrays.stream(llista)
                .filter(x -> x instanceof String)
                .map(x -> (String) x)
                .collect(Collectors.toList());

        llistatOrdenat.sort((a, b) -> b.length() - a.length());

        System.out.println(llistatOrdenat);

    }


}
