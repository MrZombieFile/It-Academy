package nivell1.Exercici1.Instruments;

public class Percussio extends Instrument{

    public Percussio(String nom, double preu){
        super(nom, preu);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de percussio");
    }
}
