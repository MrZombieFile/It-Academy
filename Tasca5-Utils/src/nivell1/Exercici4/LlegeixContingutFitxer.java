package nivell1.Exercici4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class LlegeixContingutFitxer {


    public static void main(String[] args){

        System.out.println("Introdueix la ruta a l'arxiu que vols llegir ");

        Scanner scanner = new Scanner(System.in);
        String pathToRead = scanner.next();

        try (FileReader fr = new FileReader(pathToRead); BufferedReader br = new BufferedReader(fr)) {
            int i = 0;
            String line;
            while ((line = br.readLine()) != null) {
                if (line != null) {
                    System.out.println(line);
                }
            }

        }catch(Exception exc){
            System.out.println("There's an exception" + exc.getMessage());
        }



    }


}
