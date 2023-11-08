package main;

import java.util.Random;
import java.util.Scanner;

class NumberGenerator implements Runnable {
    private int numberOfIntegers;

    public NumberGenerator(int numberOfIntegers) {
        this.numberOfIntegers = numberOfIntegers;
    }

    public void run() {
        Random random = new Random();
        for (int i = 0; i < numberOfIntegers; i++) {
            int number = random.nextInt(100); // Generates a random integer between 0 and 99
            System.out.println("Generated Number: " + number);
            if (number % 2 == 0) {
                SquareThread.square(number);
            } else {
                CubeThread.cube(number);
            }
            try {
                Thread.sleep(1000); // Sleeps for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareThread {
    static void square(int number) {
        System.out.println("Square: " + (number * number));
    }
}

class CubeThread {
    static void cube(int number) {
        System.out.println("Cube: " + (number * number * number));
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of random integers to generate: ");
        int numberOfIntegers = scanner.nextInt();
        scanner.close();

        NumberGenerator numberGenerator = new NumberGenerator(numberOfIntegers);
        Thread thread = new Thread(numberGenerator);
        thread.start();
    }
}
