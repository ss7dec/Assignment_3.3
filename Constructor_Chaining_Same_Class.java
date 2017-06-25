//Assignment 3.3

// Create a program to demonstrate Constructor Chaining. Between the same class
//and between the child and parent class.

//                       Constructor Chaining - Same Class

package assignment_3_3;

//* Constructor chaining can be done in two ways:
//Within same class: It can be done using this() keyword for constructors in same class
//From base class: by using super() keyword to call constructor from the base class.
//This process is used when we want to perform multiple tasks in a single constructor 
//rather than creating a code for each task in a single constructor we create
//  a separate constructor for each task and make their chain which makes the program more readable.



public class Constructor_Chaining_Same_Class {
	public Constructor_Chaining_Same_Class(){
        System.out.println("In default constructor...");
    }
    public Constructor_Chaining_Same_Class(int i){
        this();
        System.out.println("In single parameter constructor...");
    }
    public Constructor_Chaining_Same_Class(int i,int j){
        this(j);
        System.out.println("In double parameter constructor...");
    }
     
    public static void main(String a[]){
    	@SuppressWarnings("unused")
		Constructor_Chaining_Same_Class ch = new Constructor_Chaining_Same_Class(10,20);

   }
    
}
