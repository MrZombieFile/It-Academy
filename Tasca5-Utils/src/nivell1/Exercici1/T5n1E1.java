package nivell1.Exercici1;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class T5n1E1 {

    public static void main (String[] args) {
        try {
            System.out.println("Introdueix el path al directori que vols ordenar");
            Scanner scanner = new Scanner(System.in);
            Path dir = null;
            if (scanner.hasNext()) {
                dir = Paths.get(scanner.next());
            }


            System.out.println(dir);

            File f = new File(String.valueOf(dir));
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
