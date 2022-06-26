package nivell1.Exercici3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class T3n1E3 {

    public static void main(String[] args){

        try {
            String currentDirectory = System.getProperty("user.dir");
            FileReader fr = new FileReader(currentDirectory + "/src/nivell1/Exercici3/countries.txt");
            BufferedReader reader = new BufferedReader(fr);

            //llegeixo el document
            HashMap<String, String> llistatHashMap = llegirDocument(reader);

            reader.close();

            //Demano el nom del participant
            System.out.println("Com et dius?");
            Scanner scanner = new Scanner(System.in);
            String nomUsuari = scanner.next();

            //desenvolupo el joc
            int puntsParticipant = joc(llistatHashMap);

            //guardo els resultats en un document
            try {
                BufferedWriter output = new BufferedWriter( new FileWriter(currentDirectory + "/src/nivell1/Exercici3/results.txt", true));

                output.newLine();
                output.write(nomUsuari + " " + puntsParticipant);
                // Closes the writer
                output.close();
            }catch (Exception e) {
                e.getStackTrace();
            }

        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }

    }


    public static HashMap<String, String> llegirDocument(BufferedReader reader) throws IOException {
        HashMap<String, String> llistatHashMap = new HashMap<>();

        //Aquí llegeixo totes les línies del document
        do {
            String st = reader.readLine();
            if (st != null) {
                String[] sta = st.split(" ");
                sta[0] = sta[0].replace('_', ' ');
                sta[1] = sta[1].replace('_', ' ');
                llistatHashMap.put(sta[0], sta[1].trim());
            }
        } while (reader.readLine() != null);

        return llistatHashMap;
    }




    public static int joc(HashMap<String, String> llistatHashMap){

        int puntsParticipant = 0;
        int i = 0;
        do {
            i++;

            int number = generarRandomInt(llistatHashMap);

            String keyValue = obtenirNomPais(llistatHashMap, number);

            //Pregunto a l'usuari per la capital d'aquesst pais
            System.out.println("What's the capital city for " + keyValue + "?");

            puntsParticipant = checkIfTrue(llistatHashMap, keyValue, puntsParticipant);

        }while(i < 10);

        return puntsParticipant;
    }

    public static int generarRandomInt(HashMap<String, String> llistatHashMap){
        Random numberRandom = new Random();
        return numberRandom.nextInt(llistatHashMap.size());
    }

    public static String obtenirNomPais(HashMap<String, String> llistatHashMap, int number){
        ArrayList<String> llistaDeKeys = new ArrayList<String>();
        llistaDeKeys.addAll(llistatHashMap.keySet());
        String keyValue = llistaDeKeys.get(number);
        return keyValue;
    }

    public static int checkIfTrue(HashMap<String, String> llistatHashMap, String keyValue, int puntsParticipant){
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        if (next.equals(llistatHashMap.get(keyValue))) {
            puntsParticipant++;
            System.out.println("+1!!!!!");
        }else {
            System.out.println("Meeeeeeec!");
        }
        return puntsParticipant;
    }
}
