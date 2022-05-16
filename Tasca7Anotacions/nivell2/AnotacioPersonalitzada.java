package Tasca7Anotacions.nivell2;

import Tasca7Anotacions.nivell2.Annotations.CustomAnotation;
import Tasca7Anotacions.nivell2.Annotations.Serialitzable;

import java.io.*;

@CustomAnotation.JsonSerializable
public class AnotacioPersonalitzada implements java.io.Serializable {

    private int a;
    private String obj;

    public AnotacioPersonalitzada(int a, String obj) {
        this.a = a;
        this.obj = obj;
    }


    @Serialitzable(directory = "/directori_final/fitxer_final.ser")
    AnotacioPersonalitzada anotacio1 = new AnotacioPersonalitzada(1, "hello world! hello world!! hello world!!! hello world!!!!");


    public static void main(String[] args) {
        @Serialitzable(directory = "/directori_final/fitxer_final.ser")
        AnotacioPersonalitzada anotacio2 = new AnotacioPersonalitzada(2, "hello world! hello world!! hello world!!! hello world!!!!");

        String directory = "/directori_final";
        String filename = "/fitxer_final.ser";
        String direction = "/home/kali/Desktop/JavaBCNActiva/Temari/ItAcademy - src/Tasca7Anotacions/nivell2";
        direction = direction.concat(directory).concat(filename);

        try {
            FileOutputStream file = new FileOutputStream(direction);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(anotacio2);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
        }catch(Exception exc){
            System.out.println("There was an error.");
        }



    }


}
