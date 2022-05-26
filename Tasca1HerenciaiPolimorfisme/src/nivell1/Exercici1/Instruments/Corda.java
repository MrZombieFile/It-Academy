package nivell1.Exercici1.Instruments;

public class Corda extends Instrument{

    public Corda(String nom, double preu){
        super(nom, preu);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de corda");
    }

    public static void newFunction(){
        System.out.println("Hola desde un metode static");
    }

}
