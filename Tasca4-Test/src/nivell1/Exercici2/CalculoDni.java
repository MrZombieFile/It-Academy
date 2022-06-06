package nivell1.Exercici2;

public class CalculoDni {

    private int numeroDni;
    private String lletraDni;
    private String codiDni = numeroDni + lletraDni;

    public CalculoDni(int numero){
        int subNumero = numero % 23;

        String llistaLletres = "TRWAGMYFPDXBNJZSQVHLCKE";

        this.lletraDni = String.valueOf(llistaLletres.charAt(subNumero));
    }

    public int getNumeroDni() {
        return numeroDni;
    }

    public String getLletraDni() {
        return lletraDni;
    }

    public String getCodiDni() {
        return codiDni;
    }
}








/*
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
*/

