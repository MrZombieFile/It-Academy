package Tasca2Exceptions.Nivell1.ShoppingCart;

public class Producte {
    public String nom;
    public float preu;

    Producte(String nom, float preu){
        this.nom = nom;
        this.preu = preu;
    }

    public float getPreu() {
        return preu;
    }

    public String getNom() {
        return nom;
    }

    //setPreu?
}
