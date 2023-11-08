/*
 * The object cloning is a way to create exact copy of an object. 
 * The clone() method of Object class is used to clone an object.
 * The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create. 
 * If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.
 * The clone() method is defined in the Object class.
 */

/*
 * Why use clone() method ?
 * The clone() method saves the extra processing task for creating the exact copy of an object. 
 * If we perform it by using the new keyword,
 * it will take a lot of processing time to be performed that is why we use object cloning.
 */
package oopsMaterial;

class objectcloning implements Cloneable{  
int rollno;  
String name;  
  
objectcloning (int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
}  
  
public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  
  
public static void main(String args[]){  
try{  
	objectcloning s1=new objectcloning(100,"IoT");  
  
	objectcloning s2=(objectcloning)s1.clone();  
  
System.out.println(s1.rollno+" "+s1.name);  
System.out.println(s2.rollno+" "+s2.name);  
  
}catch(CloneNotSupportedException c){}  
  
}  
}  