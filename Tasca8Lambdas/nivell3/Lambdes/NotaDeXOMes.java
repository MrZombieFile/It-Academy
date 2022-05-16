package Tasca8Lambdas.nivell3.Lambdes;

import Tasca8Lambdas.nivell3.Alumne;

public interface NotaDeXOMes {

    public Alumne[] notaDeXOMes(Alumne[] llista, float nota);
    public Alumne[] noSonDeXCurs(Alumne[] llista, String curs);

    public Alumne[] majorsDeXEdat(Alumne[] llista, Integer edat);
}
