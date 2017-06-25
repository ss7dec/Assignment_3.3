//Assignment 3.3

// Create a program to demonstrate Constructor Chaining. Between the same class
//and between the child and parent class.

//                       Constructor Chaining - Parent-Child Class
package assignment_3_3;

public class Parent {
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

		public class Main {
		public void main(String[] args) { 
			@SuppressWarnings("unused")
			Derived d = new Derived();
		}
		}
	}
	

	
