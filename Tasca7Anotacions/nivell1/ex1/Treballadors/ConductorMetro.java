package Tasca7Anotacions.nivell1.ex1.Treballadors;

public class ConductorMetro extends EmpleatTMB{

    public ConductorMetro(String nom, String cognom, float preuHora, float kmRecorreguts, float horesTreballadesPerSetmana){
        super(nom, cognom, preuHora, kmRecorreguts, horesTreballadesPerSetmana);

    }

    @Override
    public void treballar(){
        System.out.println("Conduint metro");
    }


}
