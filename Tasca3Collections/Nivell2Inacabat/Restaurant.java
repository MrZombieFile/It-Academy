package Tasca3Collections.Nivell2Inacabat;

public class Restaurant {
    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio){
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }
}
