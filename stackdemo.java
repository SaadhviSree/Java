package oopsMaterial;

public class stackdemo {
		int s[]=new int[10];
		int tos;
		
		//private int s[]=new int[10];
		//private int tos;    //goto stack.java
		
		stackdemo() {
			tos=-1;
		}
void push(int item) {
	if(tos==9)   //or if(tos==s.length) 
		System.out.println("stack is full");
	else
		s[++tos]=item;
}
int pop() {
	if(tos>=0)
		return s[tos--];
	else {
		System.out.println("stack is empty");
		return -1;
	}
}
	}