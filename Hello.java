// cahllenge 1

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("note.txt");
            writer.write("Your Text Here\n");
            writer.write("Your Text Here\n");
            writer.write("Your Text Here\n");
            writer.close();

            FileWriter search = new FileWriter("search.txt");
            search.write("Java is powerfull.\n");
            search.write("it's cool\n");
            search.write("cool to use java\n");
            search.write("Nice cool Java\n");
            search.close();

            Scanner reader = new Scanner(new File("search.txt"));

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.contains("Java")) {
                    System.out.println(line + " ");
                }
            }

            reader.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
