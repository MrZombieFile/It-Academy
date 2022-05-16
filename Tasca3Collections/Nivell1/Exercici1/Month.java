package Tasca3Collections.Nivell1.Exercici1;

import java.util.ArrayList;
import java.util.HashSet;

public class Month {

    private String name;
    Month(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  static void main (String[] args){
        ArrayList<Month> llista = new ArrayList<Month>();

        Month gener = new Month("gener");
        llista.add(gener);
        Month febrer = new Month("febrer");
        llista.add(febrer);
        Month marc = new Month("març");
        llista.add(marc);
        Month abril = new Month("abril");
        llista.add(abril);
        Month maig = new Month("maig");
        llista.add(maig);
        Month juny = new Month("juny");
        llista.add(juny);
        Month juliol = new Month("juliol");
        llista.add(juliol);
        Month setembre = new Month("setembre");
        llista.add(setembre);
        Month octubre = new Month("obtubre");
        llista.add(octubre);
        Month novembre = new Month("novembre");
        llista.add(novembre);
        Month desembre = new Month("desembre");
        llista.add(desembre);

        Month agost = new Month("agost");
        llista.add(7, agost);

        for(Month months : llista) {
            System.out.println(months.getName());
        }

        HashSet<String> hs = new HashSet<String>();
        for (Month months : llista){
            try {
                if (months.getName().equals("agost"))
                    hs.add(months.getName());
            }catch (Exception exc){
                System.out.println("No es pot repetir");
            }
            hs.add(months.getName());
        }

        for (String months : hs){
            System.out.println(months);
        }


    }

}
