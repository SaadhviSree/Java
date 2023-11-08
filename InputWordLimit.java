package filemgmt;

import java.io.*;
import java.util.Scanner;

public class InputWordLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        if (wordCount(userInput) <= 6) {
            writeToFile("output2.txt", userInput);
            System.out.println("Input has been written to the file.");
        } else {
            System.out.println("Word limit has been exceeded.");
        }
    }

    public static int wordCount(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }

    public static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
