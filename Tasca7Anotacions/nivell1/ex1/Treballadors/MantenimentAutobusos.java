package Tasca7Anotacions.nivell1.ex1.Treballadors;

public class MantenimentAutobusos extends EmpleatTMB{

    public MantenimentAutobusos(String nom, String cognom, float preuHora, float kmRecorreguts, float horesTreballadesPerSetmana){
        super(nom, cognom, preuHora, kmRecorreguts, horesTreballadesPerSetmana);

    }

    @Override
    public void treballar(){
        System.out.println("Reparant autobus");
    }

    @Override
    public float calcularSou(){
        float sou = getPreuHora() * getHoresTreballadesPerSetmana() + getKmRecorreguts() * getPreuKilometre();
        return sou;
    }

    @Deprecated
    public void imprimirT10(){
        System.out.println("Imprimint T10");
    }

}
