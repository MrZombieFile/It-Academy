package Tasca6Generics.nivell2.Exercici2;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethods2 {


    public static <T> void genericMethod(Collection<?> collection){

        for (Object object: collection){
            System.out.println(object);
        }

    }


    public static void main(String[] args){

        Collection<Object> arrayL = new ArrayList<Object>();

        Informatic persona1 = new Informatic("Josep", "Clavell", 25);
        Informatic persona2 = new QATester("Josep", "Clara", 25);
        Persona persona3 = new Informatic("Josep", "Junyent", 25);
        Persona persona4 = new Persona("Josep", "Mas", 25);
        Animal lleo1 = new Animal("Lleó", "mascle", 12);

        arrayL.add(persona1);
        arrayL.add(persona2);
        arrayL.add(persona3);
        arrayL.add(persona4);
        arrayL.add(lleo1);

        genericMethod(arrayL);


    }




}
