package oopsMaterial;
/*
 * method--->carries out a specific task
 * method input---->parameters/arguments
 */

public class methoddemo {
   static int Box(int len,int brd,int ht){  //method definition
		int vol;   //method body
		vol=len*brd*ht;  //method body
		return vol;  //returns int--->line 10  //method body
	}
	public static void main(String[] args) {
		int vol=Box(10,6,3);  //passing arguments
		System.out.println(vol); //method call
	}

} 

///it shows error 
//because if u want to call any method without creating any object..
//then use 'static' in front of method definition

///////////////////////////////STATIC///////////////////////////////////////////////
/*
public class methoddemo {
	static int Box(int len,int brd,int ht){  //method definition
		int vol;   //method body
		vol=len*brd*ht;  //method body
		return vol;  //returns int--->line 28  //method body 
		//if u r not using return in line 30---> then in line 27 change 'int' to 'void'
	}
	public static void main(String[] args) {
		
		//int vol=Box(10,6,3);  //passing arguments
		// System.out.println(vol); //method call
		             //or
		 System.out.println(Box(10,6,3)); //method call //passing arguments
		 System.out.println(); //method call
	}
}
*/
/////////////////////////other way-STATIC VOID////////////////////////////////////////////////
/*
public class methoddemo {
	static void Box(int len,int brd,int ht){  //method definition
		int vol;   //method body
		vol=len*brd*ht;  //method body
		System.out.println("volume is: "+ vol); //returns int--->line 7   //method body
	}
	public static void main(String[] args) { 
		Box(10,6,3);  //method call
		Box(1,2,5);   //once method is defined..then we can call 'n' times
	}
}
*/
//program will execute only if u call any method
//otherwise it is dummy code
//in line 51...main is also a method...JVM already call that main method 
//that is y we saw the outputs

/////////////////////////////////////////////////////////////////////////////////////////
/*
public class methoddemo {
	static int Box(int len,int brd,int ht){  //method definition
		int vol;   //method body
		vol=len*brd*ht;  //method body
		return vol;  //returns int--->line 65  //method body 
		//if u r not using return in line 68---> then in line 65 change 'int' to 'void'
	}
	static void printLine() {
		System.out.println("---***---");
	}
	public static void main(String[] args) {
		 printLine();
		 System.out.println("hello"); //method call //passing arguments
		 System.out.println(Box(10,6,3)); 
		 printLine();
	}
}
*/
///////////////////////////////////////////////////////////////////////////////////////////
/*
class Box{
    int length;  //instance variable
    int breadth; //instance variable
    int height;  //instance variable
    
}
    void setDim(int l,int b, int h){
    	length=l;
    	breadth=b;
    	height=h;
}
    int volume() {
    	return length*breadth*height;
    }
    
public class classmethodObject{
	public static void main(String[] args){
		Box blackBox=new Box();
		blackBox.setDim(1,2,3);
		System.out.println("volume of blackbox is:" blackBox.volume());
	}
}
*/
////////////////////////////CONSTRUCTOR////////////////////////////////////////////////////////
/* 
class Box1{
    int length;  //instance variable-->should not directly access data from inside of class
    int breadth; //instance variable
    int height;  //instance variable
    
//instance variable-->should not directly access data from 
//inside of class ...So create one method before main class
 
Box1(int l,int b, int h){  //constructor
	//we can define 'method' with the same name of 'class' is called "constructor"
	//method name== class name ---->constructor
	//constructor not return anything..
	//it will do only initialization
	length=l;
	breadth=b;
	height=h;
}
    void setDim1(int l,int b, int h){
    	length=l;
    	breadth=b;
    	height=h;
}
    int volume() {
    	return length*breadth*height;
    } 
    }
public class methoddemo{
	public static void main(String[] args){
		Box1 blackBox=new Box1(1,2,3);
		//if u want change parameters..then use this line 137
		//blackBox.setDim1(1,2,3); 
		System.out.println("volume of blackbox is:" + blackBox.volume());
	}
}
*/
/////////////////////////////this pointer//////////////////////////////////////////
/*
class Box1{
    int length;  //instance variable-->should not directly access data from inside of class
    int breadth; //instance variable
    int height;  //instance variable   
    
Box1(int l,int b, int h){  //constructor
    	//we can define 'method' with the same name of 'class' is called "constructor"
    	//method name== class name ---->constructor
    	//constructor not return anything..it will do only initialization
    	length=l;
    	breadth=b;
    	height=h;
    }
        void setDim1(int l,int b, int h){  //this pointer
        	this.length=l;
        	this.breadth=b;
        	this.height=h;
    }
        //or
         
        //void setDim1(int length,int breadth, int height){  //this pointer
        //	this.length=length;
        //	this.breadth=breadth;
        //	this.height=height;
   // } //suppose instance variable == parameter name..then use this pointer
        
        int volume() {
        	return length*breadth*height;
        } 
        }
    public class methoddemo{
    	public static void main(String[] args){
    		Box1 blackBox=new Box1(1,2,3);
    		//if u want change parameters..then use this line 178
    		//blackBox.setDim1(1,2,3); 
    		System.out.println("volume of blackbox is:" + blackBox.volume());
    	}
    }
 */
 /////////////////////////////garbage collection///////////////////////////////
 
/*
**Java programs perform automatic memory management
*so we have to remove unneccesary memory allotment
**But in Java, the programmer need not care for all those objects 
*which are no longer in use. 
*Garbage collector destroys these objects. 
*/

/*
    class Box2{
        int length;  //instance variable-->should not directly access data from inside of class
        int breadth; //instance variable
        int height;  //instance variable   
        
        Box2(int l,int b, int h){  //constructor
        	//we can define 'method' with the same name of 'class' is called "constructor"
        	//method name== class name ---->constructor
        	//constructor not return anything..it will do only initialization
        	length=l;
        	breadth=b;
        	height=h;
        }
            void setDim1(int l,int b, int h){  //this pointer
            	this.length=l;
            	this.breadth=b;
            	this.height=h;
        }
            
            int volume() {
            	return length*breadth*height;
            } 
            }
        public class methoddemo{
        	public static void main(String[] args){
        		Box2 blackBox=new Box2(1,2,3);
        		//blackBox =null;  //1.dereference 
        		System.out.println("volume of blackbox is:" + blackBox.volume());
        		Box2 woodBox=new Box2(4,5,7);
        		System.out.println("volume of woodbox is:" + woodBox.volume());
        		woodBox = blackBox;  //2.dereference 
 //new Box=(1,2,4);    
 // new object is created but it is not referenced
 //it is called ananymous object...this will handled by garbage collector
        	}
        }
   */
        
        
/////*************************finalize()*********************************//
/*
finalize() method in Java is used to release all the resources 
used by the object before it is deleted/destroyed by the Garbage 
collector. 
finalize is not a reserved keyword, it's a method.
Once the clean-up activity is done by the finalize() method, 
garbage collector immediately destroys the Java object.
 */
/*
class Box3{
    int length;  //instance variable-->should not directly access data from inside of class
    int breadth; //instance variable
    int height;  //instance variable   
Box3(int l,int b, int h){  //constructor
	//we can define 'method' with the same name of 'class' is called "constructor"
	//method name== class name ---->constructor
	//constructor not return anything..it will do only initialization
	length=l;
	breadth=b;
	height=h;
}
    void setDim1(int l,int b, int h){
    	length=l;
    	breadth=b;
    	height=h;
}
    int volume() {
    	return length*breadth*height;
    } 
    protected void finalize() {
    }
    }
public class methoddemo{
	public static void main(String[] args){
		Box3 blackBox=new Box3(1,2,3);
		System.out.println("volume of blackbox is:" + blackBox.volume());
	}
}
*/
//////////////////////////////METHOD OVERLOADING///////////////////////////////////////
/*
public class methoddemo{
	static int max(int a,int b) {  //suppose if not static..it will show error
		return a>b?a:b;
	}
	static double max(double a,double b) { 
		return a>b?a:b;
	}
	static char max(char a,char b) { 
		return a>b?a:b;
	}
	public static void main(String[] args){
		System.out.println(max(4,8));
		System.out.println(max(5.3,9.1));
		System.out.println(max('n','q'));
		System.out.println(Math.abs(-4.8));
		System.out.println(Math.abs(10));
	}
}
*/
///////////////////SAMPLE PROGRAM FOR METHOD OVERLOADING/////////////////////////
/*
public class methoddemo{
	static void test() {  
		System.out.println("NO ARGUMENT");
	}
	static void test(int a) { 
		System.out.println("ONE ARGUMENT");
	}
	static void test(int a,int b) { 
		System.out.println("TWO ARGUMENTS");
	}
	public static void main(String[] args){
		test();
		test(2);
		test(4,6);
	}
}
*/
//////////////////////////CONSTRUCTOR OVERLOADING////////////////////////////////////

/*
    class Box2{
    int length;  
    int breadth; 
    int height;  
    
    Box2(int l,int b, int h){  //constructor with 3 arguments
    	length=l;
    	breadth=b;
    	height=h;
    }
    Box2(){        //constructor with no arguments
    	length=-1; //if it is -1, then we can understand..it is not initialize
    	breadth=-1;
    	height=-1;
    }
    Box2(int l){    //constructor with one argument 'L'
    	length=breadth=height=l; 
    	
    }
        void setDim1(int l,int b, int h){  
        	this.length=l;
        	this.breadth=b;
        	this.height=h;
    }
        
        int volume() {
        	return length*breadth*height;
        } 
        }
    public class methoddemo{
    	public static void main(String[] args){
    		Box2 blackBox=new Box2(1,2,3);
    		System.out.println("volume of blackbox is:" + blackBox.volume());
    		Box2 woodBox=new Box2(4,5,7);
    		System.out.println("volume of woodbox is:" + woodBox.volume());
    		Box2 b3=new Box2();  //no parameter is passed so it goes to line 325 empty constructor 
    		Box2 b4=new Box2(12); //goes to line 320
    		System.out.println("b4.height " + b4.height);
    }
    }
    */
    ////////////////////////////////PASSING OBJECT/////////////////////////////
/*
class Box2{
    int length;  
    int breadth; 
    int height;  
    
    Box2(int l,int b, int h){  //constructor with 3 arguments
    	length=l;
    	breadth=b;
    	height=h;
    }
    Box2(){        //constructor with no arguments
    	length=-1; //if it is -1, then we can understand..it is not initialize
    	breadth=-1;
    	height=-1;
    }
    Box2(int l){    //constructor with one argument 'L'
    	length=breadth=height=l; 
    	
    }
    Box2(Box2 b){  //copy constructor 
    	length=b.length;
    	breadth=b.breadth;
    	height=b.height;
    }
        void setDim1(int l,int b, int h){  
        	this.length=l;
        	this.breadth=b;
        	this.height=h;
    }
        
        int volume() {
        	return length*breadth*height;
        } 
      //passing object
        boolean isEqual(Box2 b) {      //passing b4 object from line 408
     if(length==b.length && breadth==b.breadth && height==b.height)
    	 return true;
	return false;   //else part
        }
        }
    public class methoddemo{
    	public static void main(String[] args){
    		Box2 blackBox=new Box2(1,2,3);
    		System.out.println("volume of blackbox is:" + blackBox.volume());
    		Box2 woodBox=new Box2(4,5,7);
    		System.out.println("volume of woodbox is:" + woodBox.volume());
    		Box2 b3=new Box2();  //no parameter is passed so it goes to line 325 empty constructor 
    		Box2 b4=new Box2(12); //call by reference //goes to line 320 
    		//call by reference--> when u create 'new'..it will store in heap storage
    		//so it will pass only reference
    		System.out.println("b4.height " + b4.height);
    		System.out.println("blackBox==b4 " + blackBox.isEqual(b4));
    }
    }
*/
//////////////////////////CALL BY VALUE/////////////////////////////
/*
public class methoddemo{
	static void increment(int a) {   
		//this 'a' is used within this method.. so it is local variable
		a++;
	}
	public static void main(String[] args){
		int a=10;       //local variable....we can use 'a' within this class
		increment(a);   //call by value 
		//call by value refers to calling a method by passing the value in the parameter
		//it can pass only the value.
		System.out.println(a);
	}
}
*/
////////////////////////////Returning of Objects/////////////////////////

/*
//Class 1
class ObjectReturnDemo {
	int a;

	// Constructor
	ObjectReturnDemo(int i) { a = i; }

	// Method returns an object
	ObjectReturnDemo incrByTen()
	{
		ObjectReturnDemo temp
			= new ObjectReturnDemo(a + 10);
		return temp;
	}
}

//Class 2
//Main class
public class methoddemo {

	// Main driver method
	public static void main(String args[])
	{

		// Creating object of class1 inside main() method
		ObjectReturnDemo ob1 = new ObjectReturnDemo(2);
		ObjectReturnDemo ob2;

		ob2 = ob1.incrByTen();

		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob2.a: " + ob2.a);
	}
}
*/
/////////////////////////////RECURSION//////////////////////////////////////////
/*public class methoddemo{
	static int fact(int n) {
		if(n==0)
			return 1;
		else
		  return n*fact(n-1);
	}
		public static void main(String args[]) {
		int n=5;
		System.out.println(fact(n));
		}
	}
*/