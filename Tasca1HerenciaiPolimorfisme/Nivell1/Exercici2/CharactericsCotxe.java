package Tasca1HerenciaiPolimorfisme.Nivell1.Exercici2;




class CharacteristicsCotxe {
    public static final String brand;
    static String model;
    final int power;

    //model i power es poden inicialitzar al constructor de la classe:
    //al contrari que brand, que només s'nicialitza un cop per programa
    //i ha de ser final.
    CharacteristicsCotxe(String model, int power, String brand){
        this.model = model;
        this.power = power;
    }
    //Es pot inicialitzar amb un block static, ara no es gaire beneficiós
    //però en el moment que el programa creixi sí que ho serà.
    /*Passarà una mica com a l'exercici anterior, que es fa tota la lògica
    del programa i després es farà la inicialització dels blocs, primer
    l'estàtic i després el bloc que no es static, per a donar pas més tard
    al constructor. L'avantatge trobo que hi és al manteniment del codi.
     */
    static{
        brand = "mazda";
    }
    /*Com que l'atribut model es static, farem una instància d'aquest i li
    donarem un nom, per a després fer una altre instancia i donar-li un altre.
    com que no es final, el que passarà es que el model del primer objecte instanciat
    passarà a dir-se com el model del segon objecte instanciat. Això ho faré
    fóra de la classe.
    * */
    static void brake(){
        System.out.println("El vehicle està frenant");
    }

    void speedUp(){
        System.out.println("El vehicle està accelerant");
    }
}