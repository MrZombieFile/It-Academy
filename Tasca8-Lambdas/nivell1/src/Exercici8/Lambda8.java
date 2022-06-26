package Exercici8;

public class Lambda8 {

    public static void main (String[] args){

        Reverse reverse = (cadena) -> {
            String reversed = "";

            for(int i = cadena.length() - 1; i >= 0; i--){
                reversed = reversed + cadena.charAt(i);

            }


            return reversed;
        };

        System.out.println(reverse.reverse("Volem comprovar si el reverse és correcte"));



    }

}
