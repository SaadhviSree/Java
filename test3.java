package threading;

class ThreadGroupDemo implements Runnable{    
    public void run() {    
          System.out.println("Thread name : "+Thread.currentThread().getName());           
    }    
   public static void main(String[] args) {    
      ThreadGroupDemo runnable = new ThreadGroupDemo();    
          ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup1");  
          ThreadGroup tg2 = new ThreadGroup("Parent ThreadGroup2");  
              
          Thread t1 = new Thread(tg1, runnable,"one");    
          t1.start();    
          Thread t2 = new Thread(tg1, runnable,"two");    
          t2.start();    
          Thread t3 = new Thread(tg2, runnable,"three");    
          t3.start();    
          Thread t4 = new Thread(tg2, runnable,"four");    
          t4.start();  
          System.out.println("Thread Group Name: "+tg1.getName());    
          tg1.list();    
    
    }    
   }    