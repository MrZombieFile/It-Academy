package nivell1.Exercici2;

public class CalculoDni {

    int numeroDni;

    CalculoDni(int numero){
        this.numeroDni = numero;
    }

    public String obtenirLletra() {
        int subNumero = numeroDni % 23;

        String llistaLletres = "TRWAGMYFPDXBNJZSQVHLCKE";

        String lletraDni = String.valueOf(llistaLletres.charAt(subNumero));
        return lletraDni;
    }

    public int getNumeroDni() {
        return numeroDni;
    }
}
