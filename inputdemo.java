package oopsMaterial;

import java.util.Scanner; 

//**************getting input from user****************
/*
public class inputdemo {
		public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.println("what is your name?");
		String name=scanner.nextLine(); //waiting for press enter 
		System.out.println("Hello "+ name);
		System.out.println("what is your rating from 1 to 5?");
		int rating=scanner.nextInt(); //waiting for press enter 
		System.out.println("you rated us "+ rating);
		}
}
*/
/*///first get string then number-->it doesnt make any issue but....
 //first get string then number again get string--->it make an issue
*/
/*
public class inputdemo {
	public static void main(String args[]){
	Scanner scanner=new Scanner(System.in);
	System.out.println("what is your name?");
	String name=scanner.nextLine(); //waiting for press enter 
	System.out.println("Hello "+ name);
	System.out.println("what is your rating from 1 to 5?");
	int rating=scanner.nextInt(); //waiting for press enter 
	System.out.println("you rated us "+ rating);
	System.out.println("what is your emailid?");
	String emailid=scanner.nextLine(); //waiting for press enter 
	System.out.println("my email is "+ emailid);
	}
}

*/
///it will not ask to enter mailid so......
 

public class inputdemo {
	public static void main(String args[]){
	Scanner scanner=new Scanner(System.in);
	System.out.println("what is your name?");
	String name=scanner.nextLine(); //waiting for press enter 
	System.out.println("Hello "+ name);
	System.out.println("what is your rating from 1 to 5?");
	int rating=scanner.nextInt(); //waiting for press enter 
	scanner.nextLine();//it just count this is also the line...so will ask emailid to type
	System.out.println("you rated us "+ rating);
	System.out.println("what is your emailid?");
	String emailid=scanner.nextLine(); 
	//will not waiting for press enter because 
	//before that we enter number..obviously we press enter so...see line 45(after int statement) 
	System.out.println("my email is "+ emailid);
	scanner.close();
	}
}

