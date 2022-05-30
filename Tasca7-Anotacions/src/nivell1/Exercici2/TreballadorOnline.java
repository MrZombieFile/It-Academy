package nivell1.Exercici2;

public class TreballadorOnline extends Treballador {

    TreballadorOnline(String nom, String cognom, float preuHora){
        super (nom, cognom, preuHora);
    }

    private static final float COST_INTERNET = 60.00f;

    @Override
    public float calcularSou(float nombreHoresTreballadesAlMes){
        return nombreHoresTreballadesAlMes * this.getPreuHora() + this.COST_INTERNET;
    };

    @Deprecated
    public float calcularHoresTreballades(float setmanesTreballades, float horesTreballadesPerSetmana){
        return setmanesTreballades * horesTreballadesPerSetmana;
    }

}
