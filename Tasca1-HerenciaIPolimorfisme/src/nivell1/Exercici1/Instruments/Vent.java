package nivell1.Exercici1.Instruments;

public class Vent extends Instrument{

    public Vent(String nom, double preu){
        super(nom, preu);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de vent");
    }
}
