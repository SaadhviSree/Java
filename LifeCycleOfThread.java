package threading;
//Implementation Of a Thread
//Extending Thread Class
class Multi extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
Multi t1=new Multi();  
t1.start(); //starting a thread 
 }  
} 

//Output
/*thread is running... */

//Implementing Runnable Interface
class Multi3 implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
Multi3 m1=new Multi3();  
Thread t1 =new Thread(m1); 
t1.start();  //starting a thread
 }  
} 
