package oopsMaterial;

/**************ARITHMETIC OPERATORS*************/
/*
public class operators {
	public static void main(String[] args) {
	int a=10,b=5,c;
	c=a+b;//a*b,a/b,a-b
	double a=11.9,b=2,c;
	c=a%b;
	System.out.println(c);
	}
}
*/
/***********Compound operator********************************
public class operators {
	public static void main(String[] args) {
	int a=11,b=2,c;
	a += 3; //Compound operator
	//or a=a+3;//assignment operator
	//a %= b; or a=a%b; 
	//a++; post increment
	//++a; pre increment
	//a--; post decrement
	//--a; pre decrement
	System.out.println(a);
	}
}
*/
/**************RELATIONAL OPERATORS(>,<,<=,>=,=,!=)************
public class operators {
	public static void main(String[] args) {
	int a=11,b=2,c=5;
	System.out.println(a>b);
	System.out.println(a==b);
	System.out.println(a!=b);
	System.out.println(a>100);
	}
	}
*/
//*************Bitwise OPERATORS************
//~NOT,& AND, \or, ^exor,<<left shift,>>right shift,>>>right shift zero fill
//In right shift, last sign bit it will take it in '1'
//In right shift with zero fill, last sign bit it will take it in '0'
public class operators {
	public static void main(String[] args) {
	int a=9,b=12;
	int c= a&b;
	System.out.println("a&b is " + c);
	c=a|b;
	System.out.println("a|b is " + c);
	c=~a;
	System.out.println("~a is " + c);
	byte z=4;
	System.out.println((byte)(z<<28));
	//promoted to int but we want in byte so 'type cast' it
	int z1=4;
	System.out.println(z1<<28);//promoted to int
	int a1=-5;
	System.out.println("right shift "+ (a1>>1));
	System.out.println("right shift with zero fill "+ (a1>>>1)); 
	//The sign bit filled with 0's. 
	}
	}

/**************BOOLEAN OPERATORS************
//~NOT,& AND, \or, ^exor,<<left shift,>>right shift,>>>right shift zero fill
public class operators {
	public static void main(String[] args) {
	int a=true,b=false;
	System.out.println(a&b);
	}
	}
*/

/**************SHORT CIRCUIT LOGICAL OPERATOR(&& ||)*********
 
 public class operators {
	public static void main(String[] args) {
	int a=12;
	System.out.println((a>20) && (a<30)); 
	//it check only one side if it is satisfied then check the second part
	//else ignore the second part returns the first part
	System.out.println((a>20) & (a<30)); //it check both sides 
	System.out.println((a>20) || (a<30));
	}
 }
*/
 /**************OPERATOR PRECEDENCE************
 public class operators {
		public static void main(String[] args) {
		int a=10,b=25;
		//double c= a*b-10/a;
		double c= (a*b-10)/a;
		System.out.println(c);
		}
 }
*/
///////////////////////EXAMPLE PROGRAM//////////////////////////////////////////
/* 
public class operators {
		public static void main(String[] args) {
		int a1=15;
		//a=a++ + ++a;//15+17=32
		a1=++a1 + a1++;//16+16=32
		//System.out.println(a);
		System.out.println(a1);
		int a=15;
		a=a++ + ++a;//15+17=32
		System.out.println(a);
		}
}	
 */
	