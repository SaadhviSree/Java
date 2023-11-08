package main;

import java.util.Scanner;

public class MaximumFinder {

    // Generic function to find the maximum value from an array of any type
    public static <T extends Comparable<T>> T findMaximum(T[] elements) {
        if (elements == null || elements.length == 0) {
            return null; // Return null for empty or null arrays
        }

        T maximum = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i].compareTo(maximum) > 0) {
                maximum = elements[i];
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements from the user
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        // Read elements from the user
        Integer[] intArray = new Integer[numElements];
        Double[] doubleArray = new Double[numElements];
        String[] stringArray = new String[numElements];

        System.out.println("Enter " + numElements + " integers:");
        for (int i = 0; i < numElements; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.println("Enter " + numElements + " doubles:");
        for (int i = 0; i < numElements; i++) {
            doubleArray[i] = scanner.nextDouble();
        }

        System.out.println("Enter " + numElements + " strings:");
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < numElements; i++) {
            stringArray[i] = scanner.nextLine();
        }
        scanner.close();

        // Find maximum values
        Integer maxInt = findMaximum(intArray);
        Double maxDouble = findMaximum(doubleArray);
        String maxString = findMaximum(stringArray);

        // Output the results
        System.out.println("Maximum Integer: " + maxInt);
        System.out.println("Maximum Double: " + maxDouble);
        System.out.println("Maximum String: " + maxString);
    }
}
