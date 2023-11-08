package swing;

public class NumberPrinter {
    public static void main(String[] args) {
        Object lock = new Object();
        
        Thread oddThread = new Thread(new OddNumberPrinter(lock));
        Thread evenThread = new Thread(new EvenNumberPrinter(lock));
        
        oddThread.start();
        evenThread.start();
    }
}

class OddNumberPrinter implements Runnable {
    private final Object lock;
    
    public OddNumberPrinter(Object lock) {
        this.lock = lock;
    }
    
    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd: " + i);
                lock.notify();
                
                try {
                    if (i < 19) {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

class EvenNumberPrinter implements Runnable {
    private final Object lock;
    
    public EvenNumberPrinter(Object lock) {
        this.lock = lock;
    }
    
    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
                lock.notify();
                
                try {
                    if (i < 20) {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
