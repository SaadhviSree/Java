package threading;

public class HiAndWelcome {
    public static void main(String[] args) {
        Thread hiThread = new Thread(() -> {
            while (true) {
                System.out.println("hi");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread welcomeThread = new Thread(() -> {
            while (true) {
                System.out.println("welcome");
                try {
                    Thread.sleep(2000); // Sleep for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        hiThread.start();
        welcomeThread.start();
    }
}
