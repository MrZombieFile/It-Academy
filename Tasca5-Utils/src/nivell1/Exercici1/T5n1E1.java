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
            String dir = null;
            if (args.length > 0)
                dir = args[0];

            File f = new File(dir);
            ArrayList<String> names = new ArrayList<String>(Arrays.asList(f.list()));
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
