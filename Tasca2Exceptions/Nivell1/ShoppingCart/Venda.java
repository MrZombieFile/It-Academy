package Tasca2Exceptions.Nivell1.ShoppingCart;

import Tasca2Exceptions.Nivell1.ShoppingCart.Exceptions.VendaBuidaException;

import java.util.ArrayList;
import java.util.Scanner;

public class Venda {

    public static double calcularTotal(ArrayList<Integer> llistaComanda){
        double preuFinal = 0;
        try{
            if (llistaComanda.size() == 0) {
                throw new VendaBuidaException("Per fer una venda primer has d'afegir productes");
            }else {
                for (int i : llistaComanda) {
                    switch(i){
                        case 1:
                            preuFinal += 1.80;
                            break;
                        case 2:
                            preuFinal += 1.75;
                            break;
                        case 3:
                            preuFinal += 1.60;
                            break;
                        case 4:
                            preuFinal += 1.85;
                            break;
                    }
                }
            }
        }catch(RuntimeException re){
            System.out.println(re.getMessage());
        }catch(Exception exc){
            System.out.println(exc.getMessage());

        }catch(Error e){
            System.out.println(e.getMessage());

        }finally {
            return preuFinal;
        }
    }

    public static int getNumberFromArray(int number){
        int suposatCalcul = 0;
        try{
            int[] array = new int[3];
            int i = array[number];
            return array[number];
        }catch(Exception exc){
            System.out.println("This number caused " + exc);
        }
        return suposatCalcul;
    }

    public static void main(String[] args){

        String[] options = {"1- Coca-cola: 1.80",
                            "2- Lemonade:  1.75",
                            "3- Fanta:     1.60",
                            "4- Trina:     1.85",
                            "5- No vull seguir demanant"};

        Scanner scanner = new Scanner(System.in);

        for (String s : options)
            System.out.println(s);

        int optionChoosed = -1;
        int repeticions = 0;
        ArrayList<Integer> optionList = new ArrayList<>();

        do{
            optionChoosed = scanner.nextInt();
            if(optionChoosed != 5)
                optionList.add(optionChoosed);
            repeticions++;
            if(repeticions%5 == 0){
                for (String s : options)
                System.out.println(s);}
        }while(optionChoosed != 5);

        double totalAPagar = Venda.calcularTotal(optionList);
        if(totalAPagar >= 0)
            System.out.println("El preu total de la seva comanda és de: " + totalAPagar);



        System.out.println();
        System.out.println();
        System.out.println("Introdueix un numero entre 0 i 3 si no vols provocar una excepcio");
        System.out.println();

        Scanner scanner2 = new Scanner(System.in);
        Venda.getNumberFromArray(scanner2.nextInt());


        System.out.println();
        System.out.println();
    }

}
