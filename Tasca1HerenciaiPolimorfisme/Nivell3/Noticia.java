package Tasca1HerenciaiPolimorfisme.Nivell3;

public class Noticia {
    /*Primer declaro tots els atributs*/
    private String titular;
    private Redactor redactor;
    private String text ="";
    private int puntuacio;
    public static double preu;
    private String esport;
    private String competicio;
    private String club;
    private String jugador;

    Noticia(Redactor redactor,String titular,String text,String esport,String competicio,String club,String jugador){
        setRedactor(redactor);
        setTitular(titular);
        setText(text);
        calcularPreuNoticia(esport, competicio, club, jugador);
        calcularPuntuacioNoticia(esport, competicio, club, jugador);
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }
    public void setRedactor(Redactor redactor) {
        if (this.redactor != null){
            this.redactor.eliminarNoticia(this.titular, this.redactor.getDni());
        }
        this.redactor = redactor;
        this.redactor.novaNoticia(this.redactor, this.titular, this.text, this.esport, this.competicio, this.club, this.jugador);
        this.redactor = redactor;
    }
    public Redactor getRedactor() {
        return this.redactor;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public double calcularPreuNoticia(String esport, String competicio, String club, String jugador) {
        double calculPreu = 0d;
        switch (esport.toLowerCase()){
            case "futbol":
                calculPreu += 300;

                competicio.toLowerCase();
                club.toLowerCase();
                jugador.toLowerCase();

                if (competicio == "lliga de campions"){ calculPreu += 100; }
                if (club == "barça" || club == "madrid"){ calculPreu += 100; }
                if (jugador == "ferran torres" || jugador == "benzema"){ calculPreu += 50; }

                break;
            case "bàsquet", "basquet":
                calculPreu += 250;

                competicio.toLowerCase();
                club.toLowerCase();

                if (competicio == "eurolliga"){ calculPreu += 75; }
                if (club == "barça" || club == "madrid"){ calculPreu += 75; }

                break;
            case "tenis":
                calculPreu += 150;

                jugador.toLowerCase();

                if (jugador == "federer" || jugador == "nadal" || jugador == "djokovic"){ calculPreu += 100; }

                break;
            case "f1":
                calculPreu += 100;

                club.toLowerCase();

                if (club == "ferrari" || club == "mercedes"){ calculPreu += 50; }

                break;
            case "motociclisme":
                calculPreu += 100;

                club.toLowerCase();

                if (club == "honda" || club == "yamaha"){ calculPreu += 50; }

                break;
        }



        return calculPreu;
    }
    public static int calcularPuntuacioNoticia(String esport, String competicio, String club, String jugador) {
        int calculPunts = 0;
        switch (esport.toLowerCase()){
            case "futbol":
                calculPunts += 5;

                competicio.toLowerCase();
                club.toLowerCase();
                jugador.toLowerCase();

                if (competicio == "lliga de campions"){ calculPunts += 3; }
                if (competicio == "lliga"){ calculPunts += 2; }
                if (club == "barça" || club == "madrid"){ calculPunts += 1; }
                if (jugador == "ferran torres" || jugador == "benzema"){ calculPunts += 1; }

                break;
            case "bàsquet", "basquet":
                calculPunts += 4;

                competicio.toLowerCase();
                club.toLowerCase();

                if (competicio == "eurolliga"){ calculPunts += 3; }
                if (competicio == "acb"){ calculPunts += 2; }
                if (club == "barça" || club == "madrid"){ calculPunts += 1; }

                break;
            case "tenis":
                calculPunts += 4;

                jugador.toLowerCase();

                if (jugador == "federer" || jugador == "nadal" || jugador == "djokovic"){ calculPunts += 3; }

                break;
            case "f1":
                calculPunts += 4;

                club.toLowerCase();

                if (club == "ferrari" || club == "mercedes"){ calculPunts += 2; }

                break;
            case "motociclisme":
                calculPunts += 3;

                club.toLowerCase();

                if (club == "honda" || club == "yamaha"){ calculPunts += 3; }

                break;
        }



        return calculPunts;
    }
    public double getPreu(){
        return this.preu;
    }
    public int getPuntuacio(){
        return this.puntuacio;
    }

}
