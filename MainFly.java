package swing;

//Define the Flyable interface
interface Flyable {
 void takeOff();
 void fly();
 void land();
}

//Implement the Flyable interface in the Helicopter class
class Helicopter implements Flyable {
 @Override
 public void takeOff() {
     System.out.println("Helicopter is taking off.");
 }

 @Override
 public void fly() {
     System.out.println("Helicopter is flying.");
 }

 @Override
 public void land() {
     System.out.println("Helicopter is landing.");
 }
}

//Implement the Flyable interface in the Airplane class
class Airplane implements Flyable {
 @Override
 public void takeOff() {
     System.out.println("Airplane is taking off.");
 }

 @Override
 public void fly() {
     System.out.println("Airplane is flying.");
 }

 @Override
 public void land() {
     System.out.println("Airplane is landing.");
 }
}

//Implement the Flyable interface in the Bird class
class Bird implements Flyable {
 @Override
 public void takeOff() {
     System.out.println("Bird is taking off.");
 }

 @Override
 public void fly() {
     System.out.println("Bird is flying.");
 }

 @Override
 public void land() {
     System.out.println("Bird is landing.");
 }
}

public class MainFly {
 public static void main(String[] args) {
     Flyable[] flyingObjects = {new Helicopter(), new Airplane(), new Bird()};

     for (Flyable object : flyingObjects) {
         object.takeOff();
         object.fly();
         object.land();
         System.out.println();
     }
 }
}
