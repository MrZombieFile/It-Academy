package Tasca8Lambdas.nivell2.Ex2;

import java.util.ArrayList;

public class t8n2e22 {

    public static String novaLlista(Integer[] llistaVella){

        ArrayList<String> novaLlista = new ArrayList<>();

        for (Integer nou : llistaVella){
            if (nou % 2 == 0)
                novaLlista.add("e" + nou.toString());
            else
                novaLlista.add("o" + nou.toString());

        }
        String stringARetornar = "";

        stringARetornar = String.join(",", novaLlista);

        return stringARetornar;
    }



    public static void main (String[] args) {

        Integer[] llista = {12, 324 ,45, 56, 5,756,8 ,546 , 2,34,1234,26,47 ,568,679, 67, 76,845, 567, 56,84};

        System.out.println(novaLlista(llista));
    }


}
