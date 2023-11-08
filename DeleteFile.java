package filemgmt;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        String fileName = "example.txt";
        File file = new File(fileName);

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
