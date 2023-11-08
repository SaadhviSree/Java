package oopsMaterial;
/*
class Outer{
	int num;   //we can declare variables
	void outerDisplay() {  //we can call methods
		System.out.println("outer display");
	}
class Inner{
	int x; //we can declare variables
	void innerDisplay() {  //we can call methods
		System.out.println("inner display");
	}
}
}
public class innerclass {

	public static void main(String[] args) {
		Outer o=new Outer();  //we can create object for outer class
		o.num=10;  //we can set values
		o.outerDisplay();//we can invoke that method
		//Inner i=new Inner();  
        //we can't create object for inner class 
		//becoz this is paced within outer class
		//line 21 shows error so.......use line 25
		Outer.Inner i=o.new Inner();
		i.innerDisplay();
		}
}
*/
////////////////////////////////FOR STATIC////////////////////////////////
class Outer{
	int num;   //we can declare variables
	void outerDisplay() {  //we can call methods
		System.out.println("outer display");
	}
static class Inner{
	int x; //we can declare variables
	void innerDisplay() {  //we can call methods
		System.out.println("inner display");
	}
}
}
public class innerclass {

	public static void main(String[] args) {
		Outer o=new Outer();  //we can create object for outer class
		//it was saved in binfolder like outer class files
		o.num=10;  //we can set values
		o.outerDisplay();//we can invoke that method
		//Inner i=new Inner();  
        //we can't create object for inner class 
		//becoz this is paced within outer class
		//line 21 shows error so.......use line 53
		Outer.Inner i=new Outer.Inner();  //it's changed becoz of static line 36
		//it was saved in binfolder like outer@inner class files
		i.innerDisplay();
		}
}
