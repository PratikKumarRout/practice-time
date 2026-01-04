// challenge 1

import java.io.File;
import java.io.FileWriter;

public class Hello {

    public static void main(String[] args) {
        System.out.println("file handleing...");
        File f = new File("Practice.txt");
        try {
            
            if (!f.exists()) {
                f.createNewFile();
                System.out.println("file created successfully.");
                System.out.println("full path: " + f.getAbsoluteFile());
            } else {
                System.out.println("File already exists in this folder.");
                System.out.println("file size: " + f.length() + " bytes");
            }



        } catch (Exception e) {
            System.out.println("An error occurred while createing file.");
            e.printStackTrace();
        }
    }
}