package nivell1.Exercici2;

public class Cotxe {

    private static final String MARCA = "BMW";
    private static String model;
    private final int potencia;


    public Cotxe(String model, int potencia) {
        this.model = model;
        this.potencia = potencia;
    }
    //La marca es una constant, pel que s'ha d'inicialitzar al principi,
    // la potència i el model es poden inicialitzar del mateix mode, pero
    // no només.


    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }

    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }

    public static String getMARCA() {
        return MARCA;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Cotxe.model = model;
    }

    public int getPotencia() {
        return potencia;
    }



}
