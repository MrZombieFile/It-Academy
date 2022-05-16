package Tasca8Lambdas.nivell1.Ex8;

public class LambdasEight{

    public static void main (String[] args) {
        Reverse cadenaDelReves = new Reverse() {
            @Override
            public String reverse(String parametre) {
                String reverse = "";

                for(int i = parametre.length() - 1; i >= 0; i--)
                {
                    reverse = reverse + parametre.charAt(i);
                }


                return reverse;
            }
        };

        System.out.println(cadenaDelReves.reverse("World Hello"));

    }


}
