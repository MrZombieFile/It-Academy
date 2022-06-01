package nivell1.Exercici2;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class OrdenarArbreDeDirectoris {

    public static void main (String[] args) {

        System.out.println("Introdueix la ruta al directori que vols ordenar");
        Scanner scanner = new Scanner(System.in);
        String pathway = scanner.next();



        printOrdenacio(pathway);

    }
    public static void printOrdenacio(String pathway){
        try {
            File f = new File(pathway);
            ArrayList<File> names = new ArrayList<File>(Arrays.<File>asList(f.listFiles()));
            TreeSet<String> namesSortered = new TreeSet<>();
            File folder = null;
            for (File name : names) {
                if (name.isFile()) {
                    namesSortered.add(name.getName() + "(F)");
                }else if (name.isDirectory()) {
                    namesSortered.add(name.getName().toString() + "(D)");
                    folder = name;
                }
            }
            System.out.println(namesSortered);
            if (folder != null) {
                System.out.println(folder.getName() + " Es un directori, pel que ordenarem tot el que hi té dins:");
                printOrdenacio(folder.getAbsolutePath());
            }

        } catch (Exception exc) {
            System.out.println("There's an exception");
            System.out.println(exc.getMessage());
            System.out.println(exc);

        }
    }


}

