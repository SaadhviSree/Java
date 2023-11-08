package oopsMaterial;

class Account { 
	//private data members to hide the data
	private long acc_no; 
	private String name,email; 
	private float amount; 
	//public getter and setter methods 
	public long getAcc_no() { 
	    return acc_no; 
	} 
	public void setAcc_no(long acc_no) { 
	    this.acc_no = acc_no; 
	} 
	public String getName() { 
	    return name; 
	} 
	public void setName(String name) { 
	    this.name = name; 
	} 
	public String getEmail() { 
	    return email; 
	} 
	public void setEmail(String email) { 
	    this.email = email; 
	} 
	public float getAmount() { 
	    return amount; 
	} 
	public void setAmount(float amount) { 
	    this.amount = amount; 
	} 
	   
	} 
	public class encapsulation { 
	public static void main(String[] args) { 
	    //creating instance of Account class 
	    Account acc=new Account(); 
	    //setting values through setter methods 
	    acc.setAcc_no(7310805450L); 
	    acc.setName("IoT Cyber"); 
	    acc.setEmail("IoTcybergmail.com"); 
	    acc.setAmount(100000f); 
	    //getting values through getter methods 
	    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount()); 
	} 
	}

//////////////////////////ACCESS Specifier///////////////////////////////////////////
	
          ///////////private modifier vs protected modifier ///////////////// 
	
/*The private modifier specifies that the member can only be accessed in its own class. 
 * The protected modifier specifies that the member can only be accessed within 
 * its own package (as with package-private) and, in addition, by a subclass of its 
 * class in another package.
*/

/*
What is the difference between public,private and protected access modifiers?
public - the property or method can be accessed from everywhere. This is default. 
protected - the property or method can be accessed within the class and by classes derived from that class.
private - the property or method can ONLY be accessed within the class.

final-we cant change anything hereafter
//
 * If u put final infront of the class, method,then we cant inherit anything
 */
	/*
Example for 'final'

class encapsulation
{
public static void main(String args[])

{	
	final double PI=3.14;
	System.out.println(PI);
}
}
*/