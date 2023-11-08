package filemgmt;

import java.io.*;
import java.util.Scanner;

public class FileSearch {
    public static void main(String[] args) {
        // Step 1: Read a file and remove spaces
        try {
            String inputFileName = "example.txt"; // Replace with your input file
            String outputFileName = "output.txt"; // Replace with your output file

            removeSpaces(inputFileName, outputFileName);
            System.out.println("Spaces removed and saved to " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 2: Search for a word
        try {
            String searchWord = getSearchWordFromUser();

            String outputFileName = "output.txt"; // Use the same output file

            boolean foundFromStart = searchFromStart(outputFileName, searchWord);
            boolean foundFromEnd = searchFromEnd(outputFileName, searchWord);

            if (foundFromStart) {
                System.out.println("Word found from the start of the file.");
            } else {
                System.out.println("Word not found from the start of the file.");
            }

            if (foundFromEnd) {
                System.out.println("Word found from the end of the file.");
            } else {
                System.out.println("Word not found from the end of the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void removeSpaces(String inputFileName, String outputFileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String lineWithoutSpaces = line.replaceAll("\\s", "");
                writer.write(lineWithoutSpaces);
                writer.newLine();
            }
        }
    }

    public static String getSearchWordFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word to search for: ");
        return scanner.nextLine();
    }

    public static boolean searchFromStart(String fileName, String searchWord) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchWord)) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean searchFromEnd(String fileName, String searchWord) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(fileName, "r")) {
            long fileLength = raf.length();
            long searchWordLength = searchWord.length();
            long pointer = fileLength - searchWordLength;

            while (pointer >= 0) {
                raf.seek(pointer);
                byte b = raf.readByte();
                if (b == searchWord.charAt((int) (searchWordLength - 1))) {
                    raf.seek(pointer - searchWordLength + 1);
                    byte[] buffer = new byte[(int) searchWordLength];
                    raf.read(buffer);
                    String foundWord = new String(buffer);

                    if (searchWord.equals(foundWord)) {
                        return true;
                    }
                }
                pointer--;
            }
        }
        return false;
    }
}
