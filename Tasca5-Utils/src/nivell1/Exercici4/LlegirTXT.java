package nivell1.Exercici4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LlegirTXT {

    public static void main(String[] args){

        System.out.println("Introdueix la ruta absoluta a l'arxiu .txt que vols llegir");
        Scanner newScanner = new Scanner(System.in);
        String path = newScanner.next();

        try(FileInputStream fis=new FileInputStream(path)){

            Scanner sc=new Scanner(fis);
            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


    }


}
