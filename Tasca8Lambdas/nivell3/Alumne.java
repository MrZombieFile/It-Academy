package Tasca8Lambdas.nivell3;

public class Alumne {

    private String nom;
    private Integer edat;
    private String curs;
    private float nota;

    Alumne(String nom, Integer edat, String curs, float nota){
        this.nom = nom;
        this.edat = edat;
        this.curs = curs;
        this.nota = nota;
    }

    public String getNom() {
        return nom;
    }

    public Integer getEdat() {
        return edat;
    }

    public String getCurs() {
        return curs;
    }

    public float getNota() {
        return nota;
    }
}
