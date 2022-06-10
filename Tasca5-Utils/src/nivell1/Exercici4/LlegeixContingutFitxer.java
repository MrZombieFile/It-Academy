package nivell1.Exercici4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.Scanner;

public class LlegeixContingutFitxer {


    public static void main(String[] args){


        String pathToRead = args[0];

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
