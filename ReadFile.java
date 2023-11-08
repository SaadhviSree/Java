package filemgmt;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] content = new byte[fis.available()];
            fis.read(content);
            System.out.println(new String(content));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
