package Tasca8Lambdas.nivell2.Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class t8n2e1 implements Ordering {

    @Override
    public ArrayList<String> select(String[] llista){
        ArrayList<String> llistaARetornar = new ArrayList<>();
        for (String element : llista){
            if (element.length() == 3) {
                if (element.startsWith("A")) {
                    llistaARetornar.add(element);
                }
            }
        }

        return llistaARetornar;
    }



    public static void main (String[] args){

        String[] llista = {"Guillem","Martí","Antoni","Albert","Ada","Ana","Agustí","Maria","Nil","Anna"};

        ArrayList<String> novaLlista = new t8n2e1().select(llista);

        System.out.println(novaLlista);

    }


}
