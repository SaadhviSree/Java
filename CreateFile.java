package filemgmt;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "This is some content for the file.";

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
