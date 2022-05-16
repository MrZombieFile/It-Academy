package Tasca1HerenciaiPolimorfisme.Nivell3;

import java.util.ArrayList;

public class Redaccio_Exercici1 {
    private ArrayList<Noticia> noticies;
    private ArrayList<Redactor> redactors;

    //alternative


    public void introduirRedactor(String dni, String nom) {
        Redactor newRedactor = new Redactor(dni , nom );
        this.redactors.add(newRedactor);
    }
    public Redactor eliminarRedactor(Redactor redactor){
        int i = 0;
        while(i < redactors.size() && redactor == null){
            i++;
            if(redactors.get(i).getDni().equals(redactor.getDni())){
                redactors.remove(i);
            }
        }
        return redactor;

    }
    public static void introduirNoticia(Redactor redactor,String titular,String text,String esport,String competicio,String club,String jugador){
        Noticia noticiaNova = new Noticia(redactor, titular, text, esport, competicio, club, jugador);
    }
    public static void eliminarNoticia(Redactor redactor, String titular){
        redactor.eliminarNoticia(titular, redactor.getDni());
    }
    public static ArrayList mostraTotRedactor(ArrayList<Noticia> totesLesNoticies, Redactor redactor){

        ArrayList<Noticia> noticies = redactor.buscarNoticia(totesLesNoticies, redactor.getDni());
        return noticies;
    }
    public static int calcularPuntuacio(ArrayList<Noticia> noticies, Redactor redactor, Noticia noticia){
        int i = 0;
        int puntuacio = -1;
        while(i < noticies.size() && puntuacio == -1) {
            if (noticies.get(i).getTitular().equals(noticia.getTitular()) &&
                    noticies.get(i).getRedactor().getDni().equals(noticia.getRedactor().getDni())){
                puntuacio = noticies.get(i).getPuntuacio();
            }
            i++;
        }
        return puntuacio;
    }
    public static double calcularPreu(ArrayList<Noticia> noticies, Redactor redactor, Noticia noticia){
        int i = 0;
        double preu = -1;
        while(i < noticies.size() && preu == -1) {
            if (noticies.get(i).getTitular().equals(noticia.getTitular()) &&
                    noticies.get(i).getRedactor().getDni().equals(noticia.getRedactor().getDni())){
                preu = noticies.get(i).getPreu();
            }
            i++;
        }
        return preu;
    }


    public static void main (String[] args){
        //Hola Mundo
    }



}
