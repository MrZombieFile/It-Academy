package nivell1;

import java.util.ArrayList;

public class T2n1 {

    public static void main(String[] args){
        try {
            Producte producte1 = new Producte("producte1", 1.75);
            Producte producte2 = new Producte("producte2", 1.05);
            Producte producte3 = new Producte("producte3", 1.20);
            Producte producte4 = new Producte("producte4", 2.75);
            Producte producte5 = new Producte("producte5", 0.30);

            ArrayList<Producte> llistaDeProductes = new ArrayList<>();

            llistaDeProductes.add(producte1);
            llistaDeProductes.add(producte2);
            llistaDeProductes.add(producte3);
            llistaDeProductes.add(producte4);
            llistaDeProductes.add(producte5);



            Venda novaVenda = new Venda(llistaDeProductes);


            novaVenda.calcularTotal();


            //Fins aqui tot normal
            ArrayList<Producte> buit = new ArrayList<>();
            Venda vendaAmbError = new Venda(buit);

            vendaAmbError.calcularTotal();


//Comenta aquí per a veure l'ArrayIndexOutOfBounds

            //Preparo l'ArrayIndexOutOfBounds, amb algo molt molt senzill,
            // nomes per que salti
            Producte[] ArrayOutOB = new Producte[llistaDeProductes.size()];

            //Aqui genero l'ArrayIndexOutOfBounds
            for (int i = 0; i <= ArrayOutOB.length; i++){
                Producte producte = ArrayOutOB[i];
            }

//fins aquí



        }catch(VendaBuidaException exc){
            System.out.println("Hi ha hagut una excepció del tipus VendaBuidaException " + exc.getMessage());
        }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Hi ha hagut una excepció del tipus ArrayIndexOutOfBounds" + exc.getMessage());
        }



    }
}
