package Tasca8Lambdas.nivell3;

import Tasca8Lambdas.nivell3.Lambdes.ComençaPerA;
import Tasca8Lambdas.nivell3.Lambdes.NotaDeXOMes;

import java.util.ArrayList;

public class LambdasNivell3 {



    public static void main(String[] args){

        Alumne[] llista = {
                new Alumne("lluis", 23, "Java", 6.7f),
                new Alumne("alfred", 19, "Java", 7.2f),
                new Alumne("antoni", 23, "Node", 9.3f),
                new Alumne("josep", 32, "Java", 5.6f),
                new Alumne("josep lluis", 28, "Java", 5.0f),
                new Alumne("josep antoni", 44, "Node", 6.2f),
                new Alumne("jordi", 26, "Java", 6.9f),
                new Alumne("mireia", 30, "Java", 6.7f),
                new Alumne("jaume", 32, "Node", 7.4f),
                new Alumne("vicenç", 41, "Java", 8.0f)
        };

        //Ex1:

        for (Alumne alumne : llista){
            System.out.print(alumne.getNom() + " " + alumne.getEdat() + "    ");
        }

        //Print amb la A:

        ComençaPerA subLlista = new ComençaPerA(){
            @Override
            public Alumne[] seleccionarA(Alumne[] llista, char lletra) {
                ArrayList<Alumne> entremig = new ArrayList<>();
                for (Alumne noi: llista){
                    if (noi.getNom().toLowerCase().charAt(0) == lletra){
                        entremig.add(noi);
                    }
                }

                Alumne[] aRetornar = new Alumne[entremig.size()];
                for (int i = 0; i < entremig.size(); i++){
                    aRetornar[i] = entremig.get(i);
                }

                return aRetornar;
            }
        };

        Alumne[] ambLaA = subLlista.seleccionarA(llista, 'a');

        for (Alumne alu : ambLaA){
            System.out.println("");
            System.out.println(alu.getNom() + " " + alu.getEdat() + " " + alu.getCurs() + " " + alu.getNota());
        }

        //Delimitació
        System.out.println("");

        NotaDeXOMes subLlistaAmbNota = new NotaDeXOMes(){
            @Override
            public Alumne[] notaDeXOMes (Alumne[] llista, float nota) {
                ArrayList<Alumne> entremig = new ArrayList<>();
                for (Alumne noi: llista){
                    if (noi.getNota() >= nota ){
                        entremig.add(noi);
                    }
                }

                Alumne[] aRetornar = new Alumne[entremig.size()];
                for (int i = 0; i < entremig.size(); i++){
                    aRetornar[i] = entremig.get(i);
                }

                return aRetornar;
            }

            @Override
            public Alumne[] noSonDeXCurs(Alumne[] llista, String curs) {
                ArrayList<Alumne> entremig = new ArrayList<>();
                for (Alumne noi: llista){
                    if (!noi.getCurs().equals(curs) ){
                        entremig.add(noi);
                    }
                }

                Alumne[] aRetornar = new Alumne[entremig.size()];
                for (int i = 0; i < entremig.size(); i++){
                    aRetornar[i] = entremig.get(i);
                }

                return aRetornar;
            }

            @Override
            public Alumne[] majorsDeXEdat(Alumne[] llista, Integer edat) {
                ArrayList<Alumne> entremig = new ArrayList<>();
                for (Alumne noi: llista){
                    if (noi.getEdat() > edat ){
                        entremig.add(noi);
                    }
                }

                Alumne[] aRetornar = new Alumne[entremig.size()];
                for (int i = 0; i < entremig.size(); i++){
                    aRetornar[i] = entremig.get(i);
                }

                return aRetornar;
            }
        };

        Alumne[] mesDeX = subLlistaAmbNota.notaDeXOMes(llista, 6.7f);


        System.out.println("(El tall és a 6.7)");

        for (Alumne alu : mesDeX){
            System.out.print(alu.getNom() + " " + alu.getEdat() + " " + alu.getCurs() + " " + alu.getNota() + "    ");
        }

        Alumne[] noCurs = subLlistaAmbNota.noSonDeXCurs(subLlistaAmbNota.notaDeXOMes(llista, 6.7f), "Java");

        System.out.println();
        System.out.println();
        System.out.println("Amb tall de 6.7 i que no fan el curs de Java:");
        for (Alumne alu : noCurs){
            System.out.print(alu.getNom() + " " + alu.getEdat() + " " + alu.getCurs() + " " + alu.getNota() + "    ");
        }

        Alumne[] javaMajorsDe30 = subLlistaAmbNota.majorsDeXEdat(subLlistaAmbNota.noSonDeXCurs(llista, "Node"), 30);

        System.out.println();
        System.out.println();
        System.out.println("Amb més de 30 anys i que fan el curs de Java:");
        for (Alumne alu : javaMajorsDe30){
            System.out.print(alu.getNom() + " " + alu.getEdat() + " " + alu.getCurs() + " " + alu.getNota() + "    ");
        }
    }

}
