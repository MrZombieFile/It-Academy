package Tasca5Utils.nivell1.Exercici1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Stream;

public class OrderAlphabetic {

    public static void main (String[] args) {
        Path dir = Paths.get("/home/kali/Desktop/JavaBCNActiva/Temari/ItAcademy - src/Tasca5Utils/Nivell1/Exercici1/AOrdenar");
        //Path dir = Paths.get("C:/Users/Public/Documents/ItAcademy - src/Tasca5Utils/Nivell1/Exercici1/AOrdenar");

        try {
            File f = new File("/home/kali/Desktop/JavaBCNActiva/Temari/ItAcademy - src/Tasca5Utils/nivell1/Exercici1/AOrdenar");
            ArrayList<String> names = new ArrayList<String>(Arrays.asList(f.list()));
            System.out.println(names);
            TreeSet<String> namesSortered = new TreeSet<>();
            for(String name : names) {
                namesSortered.add(name);
            }
            System.out.println(namesSortered);
        } catch (Exception exc) {
            System.out.println("There's an exception");
            System.out.println(exc.getMessage());
            System.out.println(exc);

        }
    }
}
