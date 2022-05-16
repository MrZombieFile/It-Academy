package Tasca5Utils.nivell1.Exercici4;

import java.io.BufferedReader;
import java.io.FileReader;

public class LlegirFitxerDeText {

    public static void llegir(String direccio) {
        try(BufferedReader fr = new BufferedReader(new FileReader(direccio))){
            String line;
            while((line = fr.readLine()) != null) {
                System.out.println(line);
            }
        }catch(Exception exc){

        }

    }

    public static void main (String[] args){
        String direccio = "/home/kali/Desktop/JavaBCNActiva/Temari/ItAcademy - src/Tasca5Utils/nivell1/Exercici3/Exports.txt";

        llegir(direccio);
    }


}
