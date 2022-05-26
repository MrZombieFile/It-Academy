package nivell1.Exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
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

            HashMap<String, String> llistatHashMap = new HashMap<>();

            //Aquí llegeixo totes les línies del document
            do{
                String st = reader.readLine();
                if (st != null){
                    String[] sta = st.split(" ");
                    sta[0] = sta[0].replace('_', ' ');
                    sta[1] = sta[1].replace('_', ' ');
                    llistatHashMap.put(sta[0],sta[1].trim());
                    }
            }while(reader.readLine() != null);
            reader.close();

            //Demano el nom del participant
            System.out.println("Com et dius?");
            Scanner scanner = new Scanner(System.in);
            String nomUsuari = scanner.next();

            int puntsParticipant = 0;
            int i = 0;
            do {
                i++;
                Random numberRandom = new Random();
                int number = numberRandom.nextInt(llistatHashMap.size());

                ArrayList<String> llistaDeKeys = new ArrayList<String>();
                llistaDeKeys.addAll(llistatHashMap.keySet());
                String keyValue = llistaDeKeys.get(number);
                System.out.println("What's the capital city for " + keyValue + "?");

                String next = scanner.next();
                //System.out.println(llistatHashMap.get(i));

                if (next.equals(llistatHashMap.get(keyValue))) {
                    puntsParticipant++;
                    System.out.println("+1!!!!!");
                }else {
                    System.out.println("Meeeeeeec!");
                }

            }while(i < 10);


            try {
                BufferedWriter output = new BufferedWriter( new FileWriter(currentDirectory + "/src/nivell1/Exercici3/results.txt", true));


                output.newLine();
                output.write(nomUsuari + " " + puntsParticipant);
                // Closes the writer
                output.close();
            }

            catch (Exception e) {
                e.getStackTrace();
            }

        }catch(Exception exc){
            System.out.println(exc.getMessage());
        }







    }

}
