package nivell1.Exercici5;

import java.io.*;

public class Serialitzar{

    public static void main (String[] args){

        ObjecteASerialitzar obj = new ObjecteASerialitzar("Nom Objecte", "Cognom Objecte");

        try {
            FileOutputStream serialize = new FileOutputStream("serializable.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(serialize);

            outputStream.writeObject(obj);
            outputStream.flush();
            outputStream.close();
        }catch (Exception exc){
            System.out.println(exc.getMessage());
        }


        //Deserialitzar:

        try {
            FileInputStream inSerialize = new FileInputStream("serializable.ser");
            ObjectInputStream inputStream = new ObjectInputStream(inSerialize);

            ObjecteASerialitzar objDeserialized = (ObjecteASerialitzar) inputStream.readObject();

            System.out.println(objDeserialized.getNom());
            System.out.println(objDeserialized.getCognom());
            objDeserialized.imprimir();

        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }

    }


}
