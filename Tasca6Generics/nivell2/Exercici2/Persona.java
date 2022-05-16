package Tasca6Generics.nivell2.Exercici2;

public class Persona {

    String nom;
    String cognoms;
    int edat;

    Persona(String nom, String cognoms, int edat){
        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = edat;
    }

    public String getCognoms() {
        return cognoms;
    }
}
