package Tasca7Anotacions.nivell1.ex1.Treballadors;

public class RevisioGas extends Treballador{
    private float kmRecorreguts;
    private float horesTreballadesPerSetmana;
    private float preuKilometre;
    public RevisioGas(String nom, String cognom, float preuHora, float kmRecorreguts, float horesTreballadesPerSetmana){
        super(nom, cognom, preuHora);
        this.kmRecorreguts = kmRecorreguts;
        this.horesTreballadesPerSetmana = horesTreballadesPerSetmana;
    }

    @Override
    public void treballar(){
        System.out.println("Revisant instal·lacio de gas");
    }

    @Override
    public float calcularSou(){
        float sou = getPreuHora() * getHoresTreballadesPerSetmana() + getKmRecorreguts() * getPreuKilometre();
        return sou;
    }

    public float getHoresTreballadesPerSetmana() {
        return horesTreballadesPerSetmana;
    }

    public void setHoresTreballadesPerSetmana(int horesTreballadesPerSetmana) {
        this.horesTreballadesPerSetmana = horesTreballadesPerSetmana;
    }

    public float getKmRecorreguts() {
        return kmRecorreguts;
    }

    public void setKmRecorreguts(float kmRecorreguts) {
        this.kmRecorreguts = kmRecorreguts;
    }

    public float getPreuKilometre() {
        return preuKilometre;
    }

    public void setPreuKilometre(float preuKilometre) {
        this.preuKilometre = preuKilometre;
    }
}
