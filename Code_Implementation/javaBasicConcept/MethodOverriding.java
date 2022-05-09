package javaBasicConcept;
//same name same parameter

//Implementing a class
class Test {
//Implementing a method
	public void greet(){
		System.out.println("Hello, how are you?");
	}
	}
public class MethodOverriding extends Test{
	
	// Overriding the parent method
	@Override
	public void greet() {
		System.out.println("Hello, how was your day?"); //this will get printed since this method is overridden
	}

	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.greet();
	
	}

}
