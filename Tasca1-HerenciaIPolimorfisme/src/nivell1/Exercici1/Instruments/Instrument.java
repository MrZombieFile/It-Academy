package nivell1.Exercici1.Instruments;

public abstract class Instrument {

    private String nom;
    private double preu;

    public Instrument(String nom, double preu){
        this.nom = nom;
        this.preu = preu;
    }


    abstract public void play();

}
