//Assignment 3.3

// Create a program to demonstrate Constructor Chaining. Between the same class
//and between the child and parent class.

//                       Constructor Chaining - Same Class
package assignment_3_3;

class Base {
	Base() {
	    System.out.println("Base Class Constructor Called ");
	  }
	}
	 
	class Derived extends Base {
	  Derived() {
	    System.out.println("Derived Class Constructor Called ");
	  }
	}
	 
	class Main {
	  public static void main(String[] args) {  
	    Derived d = new Derived();
}
	  
	}
