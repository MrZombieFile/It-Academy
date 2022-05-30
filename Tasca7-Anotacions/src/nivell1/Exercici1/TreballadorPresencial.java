package nivell1.Exercici1;

public class TreballadorPresencial extends Treballador{

    TreballadorPresencial(String nom, String cognom, float preuHora){
        super (nom, cognom, preuHora);
    }

    private static float benzina = 160f;

    @Override
    public float calcularSou(float nombreHoresTreballadesAlMes){
        return nombreHoresTreballadesAlMes * this.getPreuHora() + benzina;
    };
}
