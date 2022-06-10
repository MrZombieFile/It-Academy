package nivell1.Exercici5;

import java.io.Serializable;

public class ObjecteASerialitzar implements Serializable {

    private String nom;
    private String cognom;

    public ObjecteASerialitzar(String nom, String cognom){
        this.nom = nom;
        this.cognom = cognom;
    }

    public static boolean imprimir(){
        System.out.println("Quelcom");
        return true;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }
}
