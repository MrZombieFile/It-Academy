package Tasca2Exceptions.Nivell2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*do{
            System.out.println("Introduexi un numero enter entre -128 i 128");
            try {
                int num;
                num = Integer.parseInt(scanner.next());
                if (num < 128 && num > -128) {
                    done = llegirByte((byte)num);
                }
            }catch(Exception exc) {
                exc = null;
                System.out.println("Aquest no és un nombre vàlid");
                System.out.println("Introduexi un numero enter entre -128 i 128");
            }
        }while (!done);*/


        System.out.println("Introdueixi un numero entre -128 i 128");
        llegirByte(scanner.next());
        System.out.println("Introdueixi un numero entre -2 147 483 648 i 2 147 483 647");
        llegirInt(scanner.next());
        System.out.println("Introdueixi un numero entre  -1.4x10^-45 i 1.4x10^38");
        llegirFloat(scanner.next());
        System.out.println("Introdueixi un numero entre 4.9x10^-324 i 1.7x10^+308");
        llegirDouble(scanner.next());

    /*########################################################################*/

        System.out.println("Introdueixi un caràcter de text");
        llegirChar(scanner.next());
        System.out.println("Introdueixi un string de text");
        llegirString(scanner.next());
        System.out.println("Digues si (S)Acceptes o (n)Rebutges la condició");
        llegirSiNo(scanner.next());

    }

    public static byte llegirByte(String missatge){
        boolean done = false;
        byte variable;
        try{
            do{
                variable = Byte.parseByte(missatge);
                if (variable < 128  && variable > -128 ){
                    done = true;
                }else{
                    System.out.println("Aquest no és un nombre vàlid");
                    System.out.println("Introdueixi un numero entre -128 i 128");
                    Scanner scanner = new Scanner(System.in);
                    Entrada.llegirByte(scanner.next());
                }
            }while(!done);
            return variable;
        }catch(InputMismatchException exc){
            System.out.println("Aquest no és un nombre vàlid");
            System.out.println("Introdueixi un numero entre -128 i 128");
            Scanner scanner = new Scanner(System.in);
            Entrada.llegirByte(scanner.next());
        }catch(Exception exc){
            System.out.println("Aquest no és un nombre vàlid");
            System.out.println("Introdueixi un numero entre -128 i 128");
            Scanner scanner = new Scanner(System.in);
            Entrada.llegirByte(scanner.next());
        }
        return 0;
    }

    public static int llegirInt(String missatge){
        boolean done = false;
        int variable;
        try{
            do{
                variable = Integer.parseInt(missatge);
                if (variable < 2147483647  && variable > -2147483648 ){
                    done = true;
                }else{
                    System.out.println("Aquest no és un nombre vàlid");
                    System.out.println("Introdueixi un numero entre -2.147.483.648 i 2.147.483.647");
                    Scanner scanner = new Scanner(System.in);
                    Entrada.llegirInt(scanner.next());
                }
            }while(!done);
            return variable;
        }catch(InputMismatchException exc){
            System.out.println("Aquest no és un nombre vàlid");
            System.out.println("Introdueixi un numero entre -2.147.483.648 i 2.147.483.647");
            Scanner scanner = new Scanner(System.in);
            Entrada.llegirInt(scanner.next());
        }catch(Exception exc){
            System.out.println("Aquest no és un nombre vàlid");
            System.out.println("Introdueixi un numero entre -2.147.483.648 i 2.147.483.647");
            Scanner scanner = new Scanner(System.in);
            Entrada.llegirInt(scanner.next());
        }
        return 0;
    }

    public static float llegirFloat(String missatge){
        boolean done = false;
        float variable;
        try{
            do{
                variable = Float.parseFloat(missatge);
                if (variable < 1.4e38  && variable > -1.4e-45 ){
                    done = true;
                }else{
                    System.out.println("Dins de l'else");
                    //D'aquí no surt
                    System.out.println("Aquest no és un nombre vàlid");
                    System.out.println("Introdueixi un numero entre -1.4x10^-45 i 1.4x10^38");
                    Scanner scanner = new Scanner(System.in);
                    Entrada.llegirFloat(scanner.next());
                }
            }while(!done);
            return variable;
        }catch(InputMismatchException exc){
            System.out.println("Aquest no és un nombre vàlid");
            System.out.println("Introdueixi un numero entre  -1.4x10^-45 i 1.4x10^38");
            Scanner scanner = new Scanner(System.in);
            Entrada.llegirFloat(scanner.next());
        }catch(Exception exc){
            System.out.println("Aquest no és un nombre vàlid");
            System.out.println("Introdueixi un numero entre  -1.4x10^-45 i 1.4x10^38");
            Scanner scanner = new Scanner(System.in);
            Entrada.llegirFloat(scanner.next());
        }
        return 0;

    }

    public static double llegirDouble(String missatge){
        boolean done = false;
        double variable;
        try{
            do{
                variable = Double.parseDouble(missatge);
                if (variable < 1.7E+308  && variable > 4.9E-324 ){
                    done = true;
                }else{
                    System.out.println("Aquest no és un nombre vàlid");
                    System.out.println("Introdueixi un numero entre 4.9x10^-324 i 1.7x10^+308");
                    Scanner scanner = new Scanner(System.in);
                    Entrada.llegirDouble(scanner.next());
                }
            }while(!done);
            return variable;
        }catch(InputMismatchException exc){
            System.out.println("Aquest no és un nombre vàlid");
            System.out.println("Introdueixi un numero entre 4.9x10^-324 i 1.7x10^+308");
            Scanner scanner = new Scanner(System.in);
            Entrada.llegirDouble(scanner.next());
        }catch(Exception exc){
            System.out.println("Aquest no és un nombre vàlid");
            System.out.println("Introdueixi un numero entre 4.9x10^-324 i 1.7x10^+308");
            Scanner scanner = new Scanner(System.in);
            Entrada.llegirDouble(scanner.next());
        }
        return 0;
    }

    /*#######################################################*/
    // Segona part de l'exercici:

    public static char llegirChar(String message){
        try {
            char variable;
            if(message.length()>1){
                System.out.println("Aquest no és un valor vàlid");
                System.out.println("Introdueixi un caràcter de text");
                Scanner scanner = new Scanner(System.in);
                llegirChar(scanner.next());
            }else if (message.length() == 1){
                variable = message.charAt(0);
                return variable;
            }
        }catch(Exception exc){
            System.out.println("Aquest no és un valor vàlid");
            System.out.println("Introdueixi un caràcter de text");
            Scanner scanner = new Scanner(System.in);
            llegirChar(scanner.next());
        }
        return 0;
    }

    public static String llegirString (String message){
        try{
            return message;
        }catch(Exception exc){
            System.out.println("No has introduït un string vàlid");
        }
        return "0";
    }

    public static boolean llegirSiNo(String message){

        if (message.length() == 1){
            if (message.equals("S") || message.equals("s")){
                return true;
            }else if (message.equals("N") || message.equals("n")){
                return false;
            }else {
                System.out.println(message);
                System.out.println("No has introduit un valor vàlid");
                System.out.println("Digues si (S)Acceptes o (n)Rebutges la condició");
                Scanner scanner = new Scanner(System.in);
                llegirSiNo(scanner.next());
            }
        }else{
            System.out.println("No has introduit un valor vàlid");
            System.out.println("Digues si (S)Acceptes o (n)Rebutges la condició");
            Scanner scanner = new Scanner(System.in);
            llegirSiNo(scanner.next());
        }
        return false;
    }
}
