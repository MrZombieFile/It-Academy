package Tasca6Generics.nivell3NoHoEntenc;

public class Tasca6Nivell3 {


    public static void main(String[] args){

        Smartphone smartphone1 = new Smartphone();

        Generic generic1 = new Generic();

        generic1.metodeGeneric1(smartphone1);
        Foto foto1 = generic1.metodeGeneric2(smartphone1);
        //foto1.ferFoto();
    }

}
