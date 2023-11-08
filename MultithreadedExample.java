package swing;

public class MultithreadedExample {
    public static void main(String[] args) {
        Thread thread1 = new MyThread("Today is hot,");
        Thread thread2 = new MyThread("humid,");
        
        // Start both threads
        thread1.start();
        thread2.start();
    }
}

class MyThread extends Thread {
    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(message + " ");
            try {
                // Sleep for a random period to simulate concurrent execution
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
