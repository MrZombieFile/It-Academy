package Tasca8Lambdas.nivell1.Ex6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdasSix implements  Ordering{


    @Override
    public ArrayList<String> order(ArrayList<String> llista){
        Comparator<String> stringLengthComparator = new Comparator<String>(){
            @Override
            public int compare(String o1, String o2)
            {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        Collections.sort(llista, stringLengthComparator);


        return llista;
    }

    @Override
    public ArrayList<String> select(Object[] llista){
        ArrayList<String> llistaARetornar = new ArrayList<>();
        for (Object element : llista){
            if (element instanceof String){
                llistaARetornar.add(element.toString());
            }else if (element instanceof Integer){

            }else {

            }
        }

        return llistaARetornar;
    }



    public static void main (String[] args){

        Object[] llista = {"ºººººººº", 213 , 11222, "ºººº", 987, "ººººº", "ººº", 668678, 564, "ººººººº", 0, "ºººººº"};

        ArrayList<String> novaLlista = new LambdasSix().order(new LambdasSix().select(llista));

        System.out.println(novaLlista);

    }


}
