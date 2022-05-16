package Tasca7Anotacions.nivell1.ex1.Treballadors;

public abstract class Treballador {

    private String nom;
    private String cognom;
    private float preuHora;

    Treballador(String nom, String cognom, float preuHora){
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public float getPreuHora() {
        return preuHora;
    }

    public abstract void treballar();

    public abstract float calcularSou();


}
