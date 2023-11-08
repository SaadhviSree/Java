package swing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class DuplicateNumberException extends Exception {
	private static final long serialVersionUID = 1L;
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class DuplicateNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numberSet = new HashSet<>();

        while (true) {
            System.out.print("Enter a number (or 'q' to quit): ");
            String input = scanner.next();

            if ("q".equalsIgnoreCase(input)) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                if (numberSet.contains(number)) {
                    throw new DuplicateNumberException("Duplicate number detected: " + number);
                }
                numberSet.add(number);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a valid number.");
            } catch (DuplicateNumberException e) {
                System.err.println(e.getMessage());
                break;
            }
        }

        //System.out.println("No duplicate numbers detected.");
        scanner.close();
    }
}

