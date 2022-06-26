package nivell1.Exercici2;

import java.util.LinkedList;

public class T3n1E2 {

    public static void main (String[] args) {

        LinkedList<Integer> llista = new LinkedList<Integer>();
        for (int i = 0; i < 20; i++) {
            llista.add(i);
        }

        System.out.println("La primera llista:");
        System.out.println(llista);

        LinkedList<Integer> llista2 = new LinkedList<Integer>();
        for (int i = 20; i < 40; i++) {
            llista2.add(i);
        }

        System.out.println("La segona llista:");
        System.out.println(llista2);
        System.out.println("");

        LinkedList<Integer> llista3 = new LinkedList<Integer>();
        for (Integer i : llista){
            llista3.addFirst(i);
        }

        llista2.addAll(llista3);
        System.out.println("");
        System.out.println("I la primera llista al revés, inserida al final de la segona");
        System.out.println(llista2);



    }



}
