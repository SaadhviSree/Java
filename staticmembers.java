package oopsMaterial;
////////////////////STATIC METHODS///////////////////
/*
public class staticmembers {
	   public static void sample(){
	      System.out.println("Hello");
	   }
	   public static void main(String args[]){
	      staticmembers.sample();
	   }
	}
*/

////////////////////STATIC FIELD///////////////////
/*
public class staticmembers {
   public static int data = 20;
   public static void main(String args[]){
      System.out.println(staticmembers.data);
   }
   Java Arrays with Answers
   27
}
*/
////////////////////////////Static Blocks///////////////////////
public class staticmembers {
	   static{
	      System.out.println("Hello this is a static block");
	      System.out.println("This is main12 method");
	   }
	   public static void main(String args[]){
	      System.out.println("This is main method");
	      System.out.println("This is main13 method");
	   }
	}