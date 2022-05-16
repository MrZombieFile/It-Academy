package Tasca1HerenciaiPolimorfisme.Nivell3;

import java.util.ArrayList;

public class Redactor {
    private String nom;
    private String dni;
    private static double sou;
    private ArrayList<Noticia> noticies;

    static {
        sou = 1500.00;
    }

    public Redactor(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
    }

    //noticia


    public ArrayList<Noticia> getNoticies() {
        return noticies;
    }


    public void novaNoticia(Redactor redactor, String titular, String text, String esport, String competicio, String club, String jugador){

        getNoticies().add(new Noticia(redactor, titular, text, esport, competicio, club, jugador));
    }
    public void eliminarNoticia(String titular, String dni){
        getNoticies().remove(buscarNoticia(getNoticies(), titular, dni));
    }
    public Noticia buscarNoticia(ArrayList<Noticia> noticies, String titular, String dni){
        int i = 0;
        Noticia elQueEsBusca = null;
        while(i < noticies.size() && elQueEsBusca == null) {
            if (noticies.get(i).getTitular() == titular
                    && noticies.get(i).getRedactor().getDni().equals(dni) ){
                elQueEsBusca = noticies.get(i);
            }
            i++;
        }
        return elQueEsBusca;
    }

    public ArrayList<Noticia> buscarNoticia(ArrayList<Noticia> totesLesNoticies, String dni){
        ArrayList<Noticia> elQueEsBusca = null;
        for( int i = 0; i < totesLesNoticies.size(); i++) {
            if (totesLesNoticies.get(i).getRedactor().getDni().equals(dni)){
                elQueEsBusca.add(totesLesNoticies.get(i));
            }
        }
        return elQueEsBusca;
    }

    public double getSou(){
        return this.sou;
    }
    public void setSou(double sou){
        this.sou = sou;
    }

    public String getDni(){
        return this.dni;
    }

    protected String getNom(){ return this.nom; }


}
