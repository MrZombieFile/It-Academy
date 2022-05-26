package nivell1;

import java.util.List;

public class Venda {

    private List<Producte> llistaProductes;
    private double preuTotalVenda;

    public Venda (List<Producte> llista){
        this.llistaProductes = llista;
    }

    public void calcularTotal() throws VendaBuidaException {
        if (llistaProductes.size() == 0) {
            throw new VendaBuidaException();
        }else {
            double preuTotalVenda = 0;
            for (Producte producte : llistaProductes){
                preuTotalVenda += producte.getPreu();
            }
        }
    }
}
