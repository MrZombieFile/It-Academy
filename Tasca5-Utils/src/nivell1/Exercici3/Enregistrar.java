package nivell1.Exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Enregistrar {

    public static void main (String[] args) {

        String pathway = args[0];

        printOrdenacio(pathway);

    }
    public static void printOrdenacio(String pathway){
        String currentDirectory = System.getProperty("user.dir");
        try (BufferedWriter output = new BufferedWriter( new FileWriter(currentDirectory + "/emmagatzemar.txt", true))){
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


            if (folder != null) {
                output.write("\n" + folder.getName() + " Es un directori, pel que ordenarem tot el que hi té dins:");
                printOrdenacio(folder.getAbsolutePath());
            }
            //output.newLine();
            output.write(String.valueOf(namesSortered));

        } catch (Exception exc) {
            System.out.println("There's an exception");
            System.out.println(exc.getMessage());
            System.out.println(exc);

        }
    }


}

