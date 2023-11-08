package swing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileContentsInOneLine {
    public static void main(String[] args) {
        String filePath = "D://Eclipse//JavaSwing//src//swing//sample.txt"; // Replace with the path to your file

        try {
            String fileContents = readFileContents(filePath);
            System.out.println("File Contents in a Single Line:");
            System.out.println(fileContents);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFileContents(String filePath) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line);
            }
        }
        return contentBuilder.toString();
    }
}
