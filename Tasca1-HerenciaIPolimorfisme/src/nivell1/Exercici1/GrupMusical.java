package nivell1.Exercici1;

import nivell1.Exercici1.Instruments.Corda;
import nivell1.Exercici1.Instruments.Percussio;
import nivell1.Exercici1.Instruments.Vent;

public class GrupMusical {

    public static void main(String[] args){
        //solució 1
        //Cadascun dels tipus d'instrument fan una cosa:
        Vent trombone = new Vent("trombó", 189.99);
        Corda guitar = new Corda("guitarra", 549.99);
        Percussio drums = new Percussio("tambor", 130.99);

        trombone.play();
        guitar.play();
        drums.play();


        //solució 2
        //Càrrega provocada per l'acces a un membre static:
        Corda.newFunction();


    }


}
