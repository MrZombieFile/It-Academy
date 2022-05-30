package nivell1.Exercici2;

public class T6n1E2 {

    public static void main (String[] args){

        GenericMethods genericMethods1 = new GenericMethods();
        GenericMethods genericMethods2 = new GenericMethods();

        genericMethods1.metodeGeneric("Hola Món", "Sóc un", "String");
        genericMethods2.metodeGeneric(123, 45, 678);
        genericMethods2.metodeGeneric(123.23f, 45.05f, 678.07f);

        //Genero les persones

        Persona persona1 = new Persona("Josep", "Martinez", 32);
        Persona persona2 = new Persona("Lluis", "Gutierrez", 20);
        Persona persona3 = new Persona("Antonio", "Lopez", 43);

        //Les passo al metode generic
        genericMethods1.metodeGeneric(persona1, persona2, persona3);

        //no surt a la consola perque l'objecte apunta al hashcode


    }


}
