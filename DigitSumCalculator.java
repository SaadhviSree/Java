package swing;

import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();

        if (isFiveDigitNumber(number)) {
            int oddSum = calculateSumOfOddDigits(number);
            int evenSum = calculateSumOfEvenDigits(number);

            System.out.println("Sum of digits at odd places: " + oddSum);
            System.out.println("Sum of digits at even places: " + evenSum);
        } else {
            System.out.println("Please enter a valid 5-digit number.");
        }

        scanner.close();
    }

    // Check if the number has 5 digits
    public static boolean isFiveDigitNumber(int number) {
        return number >= 10000 && number <= 99999;
    }

    // Calculate the sum of digits at odd places
    public static int calculateSumOfOddDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 100; // Skip one position to the left
        }
        return sum;
    }

    // Calculate the sum of digits at even places
    public static int calculateSumOfEvenDigits(int number) {
        int sum = 0;
        number /= 10; // Start with the digit at the tens place
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 100; // Skip one position to the left
        }
        return sum;
    }
}
