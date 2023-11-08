package threading;

//Synchronized method

class Table{  
	synchronized void printTable(int n){//method not synchronized  
		for(int i=1;i<=5;i++){  
			System.out.println(n*i);  
			try{  
				Thread.sleep(400);  
			}catch(Exception e){System.out.println(e);}  
		}  
	}  
} 

//Synchronized block
/*
class Table{
	void printTable(int n){    
		synchronized(this){//synchronized block    
			for(int i=1;i<=5;i++){    
				System.out.println(n*i);    
			try{    
				Thread.sleep(400);    
			}catch(Exception e){System.out.println(e);}    
			}    
		}
	}//end of the method    
}    
*/

/*class MyThread1 extends Thread{  
	Table t;  
	MyThread1(Table t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(5);  
	}  
}  


class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(100);  
	}  
}  
 */

class TestSynchronization1{  
	public static void main(String args[]){  
		Table obj = new Table();//only one object  
		//MyThread1 t1=new MyThread1(obj);  
		//MyThread2 t2=new MyThread2(obj); 
		Thread t1=new Thread(){  
			public void run(){  
			obj.printTable(5);  
			}  
		};  
		Thread t2=new Thread(){  
			public void run(){  
			obj.printTable(100);  
			}  
		}; 
		t1.start();  
		t2.start();  
	}  
}  
