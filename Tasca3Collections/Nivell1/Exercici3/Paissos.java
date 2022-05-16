package Tasca3Collections.Nivell1.Exercici3;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Paissos {
    public static HashMap<String, String> jsonFileToHashMap(){
        try (FileReader fr = new FileReader("/home/kali/Desktop/JavaBCNActiva/Temari/ItAcademy - src/Tasca3Collections/Nivell1/Exercici3/countries.txt")){
        //try (FileReader fr = new FileReader("C:/Users/Public/Documents/ItAcademy - src/Tasca3Collections/Nivell1/Exercici3/countries.txt")){
            int c;
            String arxiu = "";
            do{
                c = fr.read();
                if (c != -1) {
                    if (c!= 123 && c!=125) {
                        if (c!=34) {
                            char lletra = (char) c;

                            arxiu += lletra;
                        }
                    }
                }
            }while (c!=-1);


            ArrayList<String> arxiuArray = new ArrayList<String>(Arrays.asList(arxiu.split(",")));
            HashMap<String, String> json = new HashMap<String, String>();


            for (int i = 0; i < arxiuArray.size(); i++){
                String[] arxiuArrayBi = arxiuArray.get(i).split(":");
                json.put(arxiuArrayBi[0], arxiuArrayBi[1]);
            }
            return json;
        }catch(Exception exc){

        }
        return null;
    }

    public static void guardarAArxiu(String nomParticipant, int puntsParticipant){
        try(FileWriter fw = new FileWriter("/home/kali/Desktop/JavaBCNActiva/Temari/ItAcademy - src/Tasca3Collections/Nivell1/Exercici3/puntuacions.txt", true)){
        //try(FileWriter fw = new FileWriter("C:/Users/Public/Documents/ItAcademy - src/Tasca3Collections/Nivell1/Exercici3/puntuacions.txt", true)){
        fw.write("\"" + nomParticipant + "\":" + "\"" + puntsParticipant + "\"");
        }catch(Exception exc){

        }
    }

    public static void main (String[] args) {
        HashMap<String, String> hashMapDePaissos = Paissos.jsonFileToHashMap();

        System.out.println("Com et dius?");
        Scanner scanner = new Scanner(System.in);
        String nomParticipant = scanner.next();

        //Ara s'ha de guardar el nom del participant a un arxiu
        int puntsParticipant = 0;
        int u = 0;

        do{
            u++;
            Random random = new Random();
            int x = random.nextInt(hashMapDePaissos.size());

            //System.out.println(hashMapDePaissos.get(x));

            ArrayList<String> llistaDeKeys = new ArrayList<String>();
            llistaDeKeys.addAll(hashMapDePaissos.keySet());
            String keyValue = llistaDeKeys.get(x);
            System.out.println(keyValue);

            //Check to see if there's a correlation between reponse and key:value and
            //if so, aggregate a point to the name of the participant


            //System.out.println(hashMapDePaissos.get(keyValue).trim());

            String next = scanner.next();
            //System.out.println(next);


            if (next.equals(hashMapDePaissos.get(keyValue).trim())) {
                puntsParticipant++;
                System.out.println("+1!!!!!");
            }else {
                System.out.println("Meeeeeeec!");
            }
        }while(u < 10);

        guardarAArxiu(nomParticipant, puntsParticipant);
    }
}

