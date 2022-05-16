package Tasca8Lambdas.nivell1.Ex3;

public class LambdaThree {

    public static void printMonths(String[] mesosDeLAny, PrintImplementation print){
        for (String element : mesosDeLAny){
            print.print(element);
        }

    }

    public static void main (String[] args){
        String[] mesosDeLAny = {"Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Decembre"};


        printMonths(mesosDeLAny, new PrintImplementation());

    }

}
