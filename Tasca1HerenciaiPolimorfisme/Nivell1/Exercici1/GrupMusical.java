package Tasca1HerenciaiPolimorfisme.Nivell1.Exercici1;

public class GrupMusical {

    public static void main (String[] args){
        abstract class instrument{
            String name;
            double price;
            abstract public void play();
        }

        class Vent extends instrument{
            private final String kind = "vent";

            Vent(String nom, double preu){
                this.name = nom;
                this.price = preu;
            }

            @Override
            public void play() {
                System.out.println("Està sonant un instrument de " + kind);
            }
        }
        class Corda extends instrument{
            public final String kind = "corda";
            static String newKind;
            static {
                newKind = "keys";

            }
            Corda(String nom, double preu){
                this.name = nom;
                this.price = preu;
            }

            @Override
            public void play() {
                System.out.println("Està sonant un instrument de " + kind);
            }
        }
        class Percussio extends instrument{

            public final String kind = "percussio";

            Percussio(String nom, double preu){
                this.name = nom;
                this.price = preu;
            }

            @Override
            public void play() {
                System.out.println("Està sonant un instrument de " + this.kind);
            }
        }

        //solució 1
        Vent trombone = new Vent("trombó", 189.99);
        Corda guitar = new Corda("guitarra", 549.99);
        Percussio drums = new Percussio("tambor", 130.99);

        trombone.play();
        guitar.play();
        drums.play();

        //solució 2
        String newKind = Corda.newKind;
        System.out.println(newKind);


    }


}













