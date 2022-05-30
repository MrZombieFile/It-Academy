package nivell1.Exercici2;

public class TreballadorPresencial extends Treballador {

    TreballadorPresencial(String nom, String cognom, float preuHora){
        super (nom, cognom, preuHora);
    }

    private static float benzina = 160f;

    @Override
    public float calcularSou(float nombreHoresTreballadesAlMes){
        return nombreHoresTreballadesAlMes * this.getPreuHora() + benzina;
    };



    @Deprecated
    @SuppressWarnings("deprecation")
    public float calcularHoresTreballades(float setmanesTreballades, float horesTreballadesPerSetmana){
        return setmanesTreballades * horesTreballadesPerSetmana;
    }

}
