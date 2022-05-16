
package Tasca3Collections.Nivell2Inacabat;

import java.util.*;

public class t3n2 {

    public static HashSet<Restaurant> guia = new HashSet<Restaurant>();

    public static void afegeixComentari(TreeMap list, Restaurant restaurant) {
        System.out.println(list.get(restaurant.getNom()));

        if (list.get(restaurant.getNom()) != null){
            // EL PROBLEMA HI ES AQUI, QUE DEURIA AFEGIR AL TREESET<INTEGER> ELS
            // NÚMEROS PERO NO HI PUC ACCEDIR
            Object obj = list.get(restaurant.getNom());
             restaurant.getPuntuacio();
        }else{
            TreeSet<Integer> treeSetInteger = new TreeSet<>();
            treeSetInteger.add(restaurant.getPuntuacio());
            list.put(restaurant.getNom(), treeSetInteger);
        }

    }


    public static void main(String[] args) {

        TreeMap<HashSet<String>, TreeSet<Integer>> list =new TreeMap<HashSet<String>, TreeSet<Integer>>();

        Restaurant comentari1 = new Restaurant("Restaurant1", 9);
        Restaurant comentari2 = new Restaurant("Restaurant1", 9);
        Restaurant comentari3 = new Restaurant("Restaurant1", 9);

        Restaurant comentari4 = new Restaurant("Restaurant2", 6);
        Restaurant comentari5 = new Restaurant("Restaurant2", 5);
        Restaurant comentari6 = new Restaurant("Restaurant2", 6);

        afegeixComentari(list, comentari1);
        afegeixComentari(list, comentari2);
        afegeixComentari(list, comentari3);

        afegeixComentari(list,comentari4);
        afegeixComentari(list,comentari5);
        afegeixComentari(list,comentari6);

        //resumeixo els dos blocs de dalt en un sol:

        afegeixComentari(list,new Restaurant ("Restaurant1", 8));
        afegeixComentari(list, new Restaurant("Restaurant1", 9));

        afegeixComentari(list, new Restaurant("Restaurant3", 8));
        afegeixComentari(list, new Restaurant("Restaurant3", 7));
        afegeixComentari(list, new Restaurant("Restaurant3", 6));


        //System.out.println(list.descendingKeySet().toString());

        String sa = list.descendingKeySet().toString();
        String[] sa2 = sa.split(",");

        //System.out.println(list.descendingMap());


        for (int i = 0; i < sa2.length; i++) {
            //System.out.println(list.get(k));
            System.out.println(list.get(sa2[i]).isEmpty());
//            System.out.println(list.get(i));
        }
    }
}
