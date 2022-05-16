package Tasca8Lambdas.nivell2.Ex4;

import Tasca8Lambdas.nivell2.Ex4.Lambdas.Alfabetic;
import Tasca8Lambdas.nivell2.Ex4.Lambdas.CanviarAPer4;
import Tasca8Lambdas.nivell2.Ex4.Lambdas.FiltreE;
import Tasca8Lambdas.nivell2.Ex4.Lambdas.MostraElementsNumerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static java.awt.SystemColor.text;

public class Modificacions {

    Alfabetic alfabetic = new Alfabetic(){
        @Override
        public String[] ordenaAlfabeticament(Object[] llista) {
            TreeSet<Object> novaLlista = new TreeSet<>();
            for(Object element: llista){
                if (element instanceof String)
                novaLlista.add(element);
            }
            String[] llistaATornar = novaLlista.toArray(new String[novaLlista.size()]);
            return llistaATornar;
        }
    };

    CanviarAPer4 canviarAPer4 = new CanviarAPer4() {
        @Override
        public String[] canviaAPer4(Object[] llista) {
            String[] llistaRetornable = new String[llista.length];
            for (int i = 0; i < llista.length; i++){
                String c = "";
                if (llista[i] instanceof String) {
                    String cadena = "";
                    char[] jj = ((String) llista[i]).toCharArray();
                    for (char a : jj) {
                        if (a == 'a' || a == 'A'){
                            cadena = cadena.concat("4");
                        }else {
                            cadena = cadena.concat(Character.toString(a));
                        }
                    }
                    c = cadena;
                }
                llistaRetornable[i] = c;
            }
            System.out.println(llistaRetornable);
            return llistaRetornable;
        }
    };

    FiltreE filtreE = new FiltreE() {
        @Override
        public Object[] filtreE(Object[] llista) {

            List<Object> ambLaE = Arrays.stream(llista).filter(element -> element.toString().toLowerCase().contains("e")).collect(Collectors.toList());
            for (int i = 0; i < llista.length ; i++) {
                if (ambLaE.contains(llista[i])) {

                } else {
                    ambLaE.add(llista[i]);
                }
            }
            Object[] ambTot = ambLaE.toArray();
            return ambTot;
        }
    };

    MostraElementsNumerics mostraElementsNumerics = new MostraElementsNumerics() {
        @Override
        public ArrayList<Object> mostraElementsNumerics(Object[] llista) {
            ArrayList<Object> alo = new ArrayList<>();
            for (Object element : llista){
                if (element instanceof String){
                    CharSequence cs = element.toString();
                    if (Pattern.matches("[a-zA-Z]+", cs)){

                    }else{
                        alo.add(element);
                    }
                } else if (element instanceof Integer) {
                    alo.add(element);
                }else{

                }
            }

            return alo;
        }
    };

    public static void main(String[] args){
        Object[] llista = {"DDDDD", "CCCCC", "1", "2", "3", 23, "BBBBB", 2123, "AAAAA", 121, 45345, 2, "Luis", "Mireia", "Ana", "Antonio", 7967, "Guillem", 80780, "Jacinto", "Lluis"};

        String[] resultat1 = new Modificacions().alfabetic.ordenaAlfabeticament(llista);
        String[] resultat2 = new Modificacions().canviarAPer4.canviaAPer4(llista);
        Object[] resultat3 = new Modificacions().filtreE.filtreE(llista);
        ArrayList<Object> resultat4 = new Modificacions().mostraElementsNumerics.mostraElementsNumerics(llista);


        for (int i = 0; i < llista.length; i++){
            //System.out.print(llista[i]);
        }

        System.out.println("");

        for (int i = 0; i < resultat1.length; i++){
            //System.out.print(resultat1[i]);
        }


        System.out.println("");

        for (int i = 0; i < resultat2.length; i++){
            //System.out.print(resultat2[i]);
        }


        System.out.println("");

        for (int i = 0; i < resultat3.length; i++){
            //System.out.print(resultat3[i]);
        }


        System.out.println("");

        for (int i = 0; i < resultat4.size(); i++){
            System.out.print(resultat4.get(i));
        }


    }
}
