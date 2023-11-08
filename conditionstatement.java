package oopsMaterial;
import java.util.Scanner;
/*
///////////////conditional/decision making/control flow statement///////////////////////
///////////////if else and switch are selection statement///////////////////////////////
public class conditionstatement {
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=scanner.nextInt();
		if(num>0) {
			System.out.println(num +" is positive");
		}
		else
		{
			if(num==0) {  //nested if
				System.out.println(num +" is neutral");
			}
			System.out.println(num +" is negative");	
		}
	}
}
*/
///////////////else if ladder////////////////////////////////////////////
/*
public class conditionstatement {
public static void main(String[] args) {
	int num;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number: ");
	num=scanner.nextInt();
	if(num>0) {
		System.out.println(num +" is positive");
	}
	else if(num==0) {  //else if ladder
			System.out.println(num +" is neutral");
		}
	else {
	System.out.println(num +" is negative");	
	}
}
}
*/
////////////////////CONDITIONAL or TERNARY OPERATOR//////////////////
////////////////////To reduce the lines of code/////////////////////
/*
public class conditionstatement {
public static void main(String[] args) {
	int a=45,b=10,max;
	max=(a>b) ? a : b; //first checks the condition 
	//if it is true print the after '?' value..
	//if it is not true, print after ':' value....
	System.out.println(max);
}
}
*/
////////////////////////SWITCH STATEMENT//////////////////////////
public class conditionstatement {
public static void main(String[] args) {
	int a,b;
    Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the first number: ");
	a=scanner.nextInt();
	System.out.println("Enter the second number: ");
	b=scanner.nextInt();
	char operator;
	System.out.println("Enter the operator +,-,*,%: "); //if u have many operator then prefer switch
	operator=scanner.next().charAt(0);
	scanner.close();
	switch(operator) {
	case '+':
		System.out.println(a + "+" + b + "="+ (a+b));
		break;
	case '-':
		System.out.println(a + "-" + b + "="+ (a-b));
		break;
	case '*':
		System.out.println(a + "*" + b + "="+ (a*b));
		break;
	case '%':
		System.out.println(a + "%" + b + "="+ (a%b));
		break;
	default:
		System.out.println("U have entered incorrect operator");
		break; //it is meaningless because it is last statement
	////suppose if u remove any one break...then system will print consecutive lines also...
	}
}
}
		
		
		
	
	