import java.io.File;
import java.io.FileWriter;

public class Hello {
    public static void main(String[] args) {
        try {
            File newFile = new File("note.txt");
            FileWriter writer = new FileWriter(newFile);
            if (!newFile.exists()) {
                System.out.println("creating the file...." + newFile.getName());
                try {
                    newFile.createNewFile();
                    System.out.println("file created successfully.");
                    System.out.println("file path: " + newFile.getAbsolutePath());
                    writer.write("Hello from java");
                    writer.close();
                    System.out.println("file written successfully...");
                } catch (Exception e) {
                    System.out.println("can't create file , error.....");
                }
            } else {
                System.out.println("file already exists.....");
                System.out.println("file path: " + newFile.getAbsolutePath());
                writer.write("Hello from java....");
                writer.close();
                System.out.println("file written done.");
            }
        } catch (Exception e) {
            System.out.println("something not good , error....");
        }
    }
}
