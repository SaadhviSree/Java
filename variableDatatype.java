package oopsMaterial;
/*
public class First{ //class name starts with capital -->convention
	public static void main(String args[]){
//variable declaration
	int ticketPrice;//camelcase--->second name starts with capital
	ticketPrice = 900; //variable assigning
//int ticketPrice = 900; //variable intialization
//int ticket_Price = 900; //acceptable
//int $ticketPrice = 900; //acceptable
//int ticket678Price = 900; //acceptable
//int 678ticketPrice = 900; //not acceptable
//int #ticketPrice = 900; //not acceptable
	System.out.println(ticketPrice);
	}
	}
*/
//////////////////////////////////////////////////////////////////////
/*for declaring boolean
public class variableDatatype{ 
	public static void main(String args[]){
	int ticketPrice = 900;
	boolean paid=true;
	char c= 't';
	System.out.println(paid);
	System.out.println(c);
	System.out.println("ticketprice is  "+ticketPrice+ "   only" );
	}
	}
*/
//////////////////////LITERALS///////////////////////////////////////////
/*
public class variableDatatype{ 
	public static void main(String args[]){
//literals---->are 900, true, t
	int ticketPrice = 900;//number literal
	boolean paid=true;
	char c= 't';//it can be $,1,0,yyy //character literal
	System.out.println("hello\nworld");// escape sequence--for printing nextline
	//within double quotation are "string literal"
	}
}
*/
///////////////////////////////////////////////////////////////////////
/*
public class variableDatatype{ 
	public static void main(String args[]){
	int ticketPrice = 0xA;//number literal
	System.out.println(ticketPrice);
	}
}
*/
////////widening-TYPE CASTING/////////////////////////

public class variableDatatype{ 
	public static void main(String args[]){
	int n;//4bytes
	byte m=54;//1byte
	n=m;//automatic type conversion or implicit type conversion
	System.out.println(n);
	}
}

