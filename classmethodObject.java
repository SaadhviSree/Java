/*syntax

JAVA is a case sensitive language
public class Main {
	  public static void main(String[] args) {
		    System.out.println("Hello World");
		  }
		}
Static--->if u want to call any method without creating any object,
          then use static
          *keyword that is when associated with a method, 
           making it a class-related method
          *saves the unnecessary wastage of memory which would have been used 
           by the object declared only for calling the main() method by the JVM.
Public--->*Access modifier, which specifies from where and who can access the
          method.Making the main() method public makes it globally available.
void------>to specify that a method doesn’t return anything.
main------>entry point from JVM..
           name of the Java main method.It’s not a keyword.
String[] args------>Sequence of character...
                    It stores Java command-line arguments and
                    is an array of type java.lang.String class.
*/


/*

package UNITone;
//import java.io.*;
class Box{
	//actually it is class Box extends object{
	//it is super class or base class or parent class  
	// from line 28--->that object is called 'cosmic super class'
      int length;  //instance variable
      int breadth; //instance variable
      int height;  //instance variable
}
public class classmethodObject{
	public static void main(String[] args){
		Box blackBox=new Box();
//it creates space in memory to store len, breadth, height
		blackBox.length=10;
		blackBox.breadth=8;
		//length=10; //it doesn't mean anything..so u have to create 'n'objects...
		System.out.println(blackBox.length);
		System.out.println(blackBox.height);//0 because java allocates 'zero' integer
		
	Box woodenBox=new Box();
	woodenBox.height=5;
	System.out.println(woodenBox.height);//system--->java.lang package's class
		//System.out.print(woodenBox.height);
		//System.out.print(woodenBox.height);
		 
		 
	}
	
}
*/

package oopsMaterial;
public class classmethodObject{
	public static void main(String[] args){
		String s1="JAVA";
		String s2="JAVA";
		String s3=new String("JAVA");
		String s4=new String("JAVA");
		System.out.println(s1==s2);//compare only the reference
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4)); //compare the content
	}	
	}

/*Can we execute a Java program without the main method?

Yes, we can execute a Java program without a main method by using a static block.

A static block in Java is a group of statements that gets executed 
only once when the class is loaded into the memory by ClassLoader, 
It is also known as a static initialization block, 
and it goes into the stack memory.

class StaticBlock {
    static
    {
        System.out.println(
            "This class can be executed without main");
        System.exit(0);
    }
}
 */

/*
 Can we declare the main() method without String[] args?
 Yes, we can declare the main() method without String[] args.
import java.io.*;
import javafx.application.Application;

abstract class ClassMethodObject
	extends javafx.application.Application {

	// static block
	static
	{
		System.out.println("Hello, world!");
		System.exit(0);
	}
}
//////////////////////////////////////////////////////////////////////////////////
*/


