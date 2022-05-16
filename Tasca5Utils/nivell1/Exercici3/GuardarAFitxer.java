package Tasca5Utils.nivell1.Exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class GuardarAFitxer {
    /*
    public static void printOrdenacio(String pathway){
        try(FileWriter fw = new FileWriter("/home/kali/Desktop/JavaBCNActiva/Temari/ItAcademy - src/Tasca5Utils/nivell1/Exercici3/Exports.txt", true)) {
            File f = new File(pathway);
            ArrayList<File> names = new ArrayList<File>(Arrays.<File>asList(f.listFiles()));
            TreeSet<String> namesSortered = new TreeSet<>();
            File folder = null;
            for (File name : names) {
                if (name.isFile())
                    namesSortered.add(name.getName());
                else if (name.isDirectory())
                    folder = name;
            }
            System.out.println(namesSortered);
            fw.write(String.valueOf(namesSortered));
            if (folder != null) {
                System.out.println(folder.getName() + " Es un directori, pel que ordenarem tot el que hi té dins:");
                fw.write(folder.getName() + " Es un directori, pel que ordenarem tot el que hi té dins:");
                printOrdenacio(folder.getAbsolutePath());
            }
            fw.write("\n");



        } catch (Exception exc) {
            System.out.println("There's an exception");
            System.out.println(exc.getMessage());
            System.out.println(exc);

        }
    }

    public static void main (String[] args) {

        String pathway = "/home/kali/Desktop/JavaBCNActiva/Temari/ItAcademy - src/Tasca5Utils/nivell1/Exercici2/AOrdenar";
        //C:/Users/Public/Documents/ItAcademy - src/Tasca5Utils/Nivell1/Exercici2/AOrdenar

        printOrdenacio(pathway);

    }
}*/


    public static void printOrdenacio(String pathway) {
        try (FileWriter fw = new FileWriter("/home/kali/Desktop/JavaBCNActiva/Temari/ItAcademy - src/Tasca5Utils/nivell1/Exercici3/Exports.txt", true)) {
            File f = new File(pathway);
            ArrayList<File> names = new ArrayList<File>(Arrays.<File>asList(f.listFiles()));
            TreeSet<String> namesSortered = new TreeSet<>();
            File folder = null;
            for (File name : names) {
                if (name.isFile()) {
                    namesSortered.add(name.getName());
                } else if (name.isDirectory()) {
                    namesSortered.add(name.getName().toString());
                    folder = name;
                }
            }
            System.out.println(namesSortered);
            fw.write(namesSortered.toString());
            if (folder != null) {
                System.out.println(folder.getName() + " Es un directori, pel que ordenarem tot el que hi té dins:");
                printOrdenacio(folder.getAbsolutePath());
                fw.write("\n");
                fw.write(folder.getName() + " Es un directori, pel que ordenarem tot el que hi té dins:");
            }
            fw.write("\n");
            fw.write("\n");
        } catch (Exception exc) {
            System.out.println("There's an exception");
            System.out.println(exc.getMessage());
            System.out.println(exc);

        }
    }

    public static void main(String[] args) {

        String pathway = "/home/kali/Desktop/JavaBCNActiva/Temari/ItAcademy - src/Tasca5Utils/nivell1/Exercici2/AOrdenar";
        //C:/Users/Public/Documents/ItAcademy - src/Tasca5Utils/Nivell1/Exercici2/AOrdenar

        printOrdenacio(pathway);

    }


}

