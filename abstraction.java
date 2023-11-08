package oopsMaterial;

////////////////////////ABSTRACTION-Single inheritance/////////////////////
/*
abstract class vehicle{
	abstract void ride();
}

class car extends vehicle{
	void ride(){
		System.out.println("car is riding");
	}
}

class abstraction{
	public static void main(String[] args){
		car c= new car();
		c.ride();
	}
}

*/
////////////////////////ABSTRACTION-Multilevel inheritance/////////////////////

abstract class vehicle{
	abstract void ride();
}

class car extends vehicle{
	void ride() {
		System.out.println("car is riding");	
	}
}

class bike extends car{
	void show(){
		System.out.println("Bike is riding");
	}
}

class abstraction{
	public static void main(String[] args){
		//car c=new car();
		//bike b=new bike();
		//c.ride();
		//b.show();
		int a=3,b=4,c;
		c = a + b + a++ + b++ + ++a + ++b;
		System.out.println(c);
		float m = 3;
		System.out.println(m);
		
		
	}
}