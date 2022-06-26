package nivell1.Exercici1;

import java.util.ArrayList;
import java.util.HashSet;

public class T3n1E1 {

    public static void main(String[] args) {
        Month month1 = new Month("Gener");

        ArrayList<Month> months = new ArrayList<Month>();
        months.add(month1);

        months.add(new Month("Febrer"));
        months.add(new Month("Març"));
        months.add(new Month("Abril"));
        months.add(new Month("Maig"));
        months.add(new Month("Juny"));
        months.add(new Month("Juliol"));
        months.add(new Month("Setembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Novembre"));
        months.add(new Month("Desembre"));


        for (int i = 0; i < months.size(); i++) {
            System.out.println(i + " " + months.get(i).getName());
        }

        System.out.println("#################################");

        months.add(7, new Month("Agost"));

        for (int i = 0; i < months.size(); i++) {
            System.out.println(i + " " + months.get(i).getName());
        }

        HashSet<String> monthsHashSet = new HashSet<>();

        for (Month month : months){
            monthsHashSet.add(month.getName());
        }

        monthsHashSet.add("Agost");
        monthsHashSet.add("Agost");
        monthsHashSet.add("Agost");

        for(String month : monthsHashSet){
            System.out.println(month);
        }
    }
}
