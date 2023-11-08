package oopsMaterial;
/*
public class array {
	public static void main(String[] args) {
		int mark[]=new int[5];//one-dimensional array
		//(or) int[] mark=new int[5];//one-dimensional array
		//new-----> allocates memory to store the values
		mark[0]=10;
		mark[1]=11;
		mark[2]=12;
		System.out.println(mark[3]);//show zero because we are not mention it 
		                          //so it take default values
		
	}	
}
*/
//////////////////////////////////////////////////////////////////////////////////////////
/*
public class array {
	public static void main(String[] args) {
		int mark[]={1,2,3,4,5,6};
		//(or)int[] mark={1,2,3,4,5,6};
		System.out.println(mark[3]);//one-dimensional array
	}
}
*/
/////////////////////////////////////////////////////////////////////////////////////////

public class array {
	public static void main(String[] args) {
		int mark[][]={
				{12,13,14},
				{15,16,17},
				{18,19,20}
		};
		System.out.println(mark[0][1]);//two-dimensional array
	}
}

/////////////////////////////////////////////////////////////////////////////////////////
/*
 public class array {
	public static void main(String[] args) {
		int mark[][]=new int[2][3];
		mark[0][1]=23;
		mark[1][2]=44;
		System.out.println(mark[0][1]);//two-dimensional array
	}
 }
*/
///////////////////////////////////////////////////////////////////////////////////////////
/*
public class array {
	public static void main(String[] args) {
		int mark[][]=new int[4][]; //not mentioning the columns... 
		//so that we can enter 'n' numbers
		mark[0]=new int[4];
		mark[1]=new int[5];
		mark[2]=new int[6];
		mark[3]=new int[7];
		System.out.println(mark[0]);//two-dimensional array
	}
 }
 */
//Array elements are initialized to 0 if they are a numeric type 
//( int or double ), false if they are of type boolean , 
//or null if they are an object type like String 
///these are applicable for only small list of numbers...so we go for 'loop' concept/////////
//////////////////////////////////////////////////////////////////////////////////////
