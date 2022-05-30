package nivell1.Exercici2;

public class Treballador {

    private String nom;
    private String cognom;
    private float preuHora;

    public Treballador(String nom, String cognom, float preuHora){
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public float calcularSou(float nombreHoresTreballades){
        return nombreHoresTreballades * preuHora;
    }

    public float getPreuHora() {
        return preuHora;
    }
}
