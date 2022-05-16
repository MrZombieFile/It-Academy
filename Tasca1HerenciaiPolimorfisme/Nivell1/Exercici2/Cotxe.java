package Tasca1HerenciaiPolimorfisme.Nivell1.Exercici2;

public class Cotxe {

    public static void main (String[] args) {


        CharacteristicsCotxe cotxe1 = new CharacteristicsCotxe("3", 210, "MAZDA");
        //Per a entrar a speedUp(), el qual és no-static, fem una instància de la classe
        // i entrem al mètode a partir de l'objecte que s'ha creat:
        cotxe1.speedUp();

        cotxe1.brake();
        //el mètode estàtic (brake) s'inicialitza a l'inici de la càrrega del main()
        //es pot accedir havent instanciat la classe CaracteristiquesCotxe
        // i creat un objecte, com adalt, però també
        // es pot accedir sense que sigui necessari haver instanciat la classe
        // com a continuació:

        CharacteristicsCotxe.brake();


        /*Ara, faig la demostració de com canvien les classes statiques, que
        deia després de { brand="mazda" } a CharacteristicsCotxe.java
        * */

        System.out.println(cotxe1.model);
        CharacteristicsCotxe cotxe2 = new CharacteristicsCotxe("model-4", 180, "Tesla");
        System.out.println(cotxe1.model);

        /*Ara, si intento canviar la potència d'algun dels objectes cotxe que ja
        han sigut creats em dona error:
        * */

        //cotxe1.power = 130;


    }

}
