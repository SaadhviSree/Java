package oopsMaterial;

/////////////////////FOR LOOP////////////////////
//syntax for 'for loop':  
//for(initialization;condition;increment or decrement){...}
/*
public class loop {
	public static void main(String[] args) {
for(int i=1;i<=5;i++){  //i = iterator or loop variable
	 System.out.println(i);
	//System.out.println('*');
	 //System.out.print(i);
}
}
}
*/
///////////////////////Another example for 'FOR LOOP'///////////////////////////////
/*

 public class loop {
		public static void main(String[] args) {
			int i;
	 for(i=1;i<=5;i++){  //i = iterator or loop variable
	 //int i,j; ///this is also possible
	 //for(i=1,j=2;i<=5;i++){   ///this is also possible
		 System.out.println(i);
		// System.out.println('*');
		 //System.out.print(i);
	 }
	 System.out.print("outside the loop is: " + (i));
	 }
	 }
*/
//////////////////suppose/////////////////////////////////
/*
public class loop {
	public static void main(String[] args) {
for(int i=1;i<=5;i++){  //i = iterator or loop variable
	 System.out.print(i);
}
System.out.print("outside the loop is: " + (i));  
////it will show 'java.lang.Error:'
//because it is placed in outside of the loop so it doesnt know the 'i'
}
}
*/
/////////////////////////////WHILE LOOP/////////////////////////////

/*public class loop {
	public static void main(String[] args) {
		int i=1;  ////initialization
while(i<=5){  //condition
	 System.out.print(i);
	 i++; ///increment
   }
}
}
*/
///////////////////SUPPOSE-initialize within while loop--shows error/////////////////
/*
public class loop {
	public static void main(String[] args) {
////initialization
while(i<=5){  //condition
	 int i=1;
	 System.out.print(i);
	 i++; ///increment
   }
}
}
//////if u are not mention increment line..then it will go for infinite loop
*/
/////////////////////////////DO-WHILE////////////////////////
/*
public class loop {
	public static void main(String[] args) {
		int i=1; ////initialization
do {
	System.out.print(i);
	 i++;    ///increment
}while(i<=5);//condition
   }
}
*/
///In DO-WHILE loo--->if the condition is not satisfied ....it will execute atleast once
///but in while looop---->if the condition is not satisfied then it will not execute...
/////////////////////////SAMPLE PROGRAM for WHILE LOOP/////////////////////////
/*
import java.util.Scanner;
public class loop {
	public static void main(String[] args) {
		int n;
		int i=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("how many stars u want?");
		n=scanner.nextInt();
		
		while(i<=n) {
		System.out.print("*");
		i++;
	}
}    //if entered zero..it will not execute one star
}
*/
/////////////////////////SAMPLE PROGRAM for DO-WHILE/////////////////////////
/*
import java.util.Scanner;
public class loop{
public static void main(String[] args) {
int n;
int i=1;
Scanner scanner=new Scanner(System.in);
System.out.println("how many stars u want?");
n=scanner.nextInt();

do{
	System.out.print("*");
	i++;
}while(i<=n);
}
}   //if entered zero..it will execute one star-->but while loop not execute star
*/
/////************************NESTED LOOP*******************//////////////////////
/*
import java.util.Scanner;
public class loop{
public static void main(String[] args) {
	for(int i=1;i<=5;i++){  //for row control
		for(int j=1;j<=5;j++){  //for printing star 
			System.out.print("*");
			//System.out.print(j); //for printing sequence of numbers 
		}
		System.out.print("\n");  //for go to next line
}
}
}
*/
/////////////////////////NESTED LOOP for pattern generation///////////////////////////////////
/*
 import java.util.Scanner;
public class loop{
public static void main(String[] args) {
	for(int i=1;i<=5;i++){  
			for(int j=1;j<=i;j++){  //for pattern generation
			System.out.print(j); 
		}
		System.out.print("\n"); 
}
}
}
*/
///////////////////////////JUMP STATEMENTS-break////////////////////////////////
//For given 'n' number, find the nearest number divisible by 10, that is less than or equal to 'n'

/*
import java.util.Scanner;
public class loop{
public static void main(String[] args) {
	int n1;
	Scanner scanner=new Scanner(System.in);
	System.out.println("how many stars u want?");
	n1=scanner.nextInt();
	while(n1>=0) {  //or while(true) {
		if(n1%10==0) {
			System.out.println(n1);
			break;  
//if break is not present..it will show sequence of divisible by 10 numbers
///if the condition is satisfied then print answer...if not then go to decrement section
		}
		n1--; 
		}
}
}
///////////////ANOTHER EXAMPLE/////////////////////////////////////////////////////////
//////////FIND THE SUM OF ALL INPUT NUMBERS ENTERED//////////////////////////////////
/*
import java.util.Scanner;
public class loop{
public static void main(String[] args) {
	double n2, sum=0;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the numbers.Enter the negative number to exit:\n");
	while(true) {
		n2=scanner.nextDouble();
		if(n2<0) {
			break;  
		}
		sum += n2;  // or sum=sum+n2 //compound assignment
	}
	System.out.println("sum of the number is "+ (sum));
}
}
*/
///////////////////////////LABEL-for avoid confusion////////////////////////////////////////////////

/*
 import java.util.Scanner;
public class loop{
public static void main(String[] args) {
	outerloop:   //labels
	for(int i=1;i<=5;i++){  //for row control
		innerloop:  //labels
		for(int j=1;j<=5;j++){  //for printing star 
			if(i==3 && j==3)
			//break outerloop;
			break innerloop;   //labelled break
			System.out.print("*"); 
		}
		System.out.print("\n");  //for go to next line
}
}
}
*/
///////////////////JUMP STATEMENTS-continue//////////////////////

//import java.util.Scanner;
public class loop{
public static void main(String[] args) {
	for(int i=1;i<=10;i++){  
			if(i==7) 
				continue;   //skipping 7 in output
		System.out.println(i); 
}
}
}

////////////////////ARRAY IN LOOPS//////////////////////////
/*
import java.util.Scanner;
public class loop{
public static void main(String[] args) {
	int[] d=new int[6];
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the 6 elements of the array: ");
	for(int i=1;i<d.length;i++)
		d[i]=scanner.nextInt();
		for(int i=1;i<d.length;i++)
	System.out.println(d[i]);
}
}
*/
/////////////////////////FOR EACH LOOP////////////////////////////////////////
/*
import java.util.Scanner;
public class loop{
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6};
	int sum=0;
	for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);
	for(int x:arr) {   ///foreach loop
		sum +=x;
	}
	System.out.println("sum is: "+ sum);
}
}
*/