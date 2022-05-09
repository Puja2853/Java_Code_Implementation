package javaBasicConcept;

public class VariableTypeAndIfStatement {
	
	static byte a = 100; // static variable 
	public String name; //// Declared Instance Variable
	
	 public VariableTypeAndIfStatement(){ 
	 
	        this.name = "Java control statements example."; // initializing instance variable
	    }
	
	public static void main(String[] args) {
		int b = 10; //Local variable [This variable is local to this main method only]
		
		VariableTypeAndIfStatement obj = new VariableTypeAndIfStatement(); //creating object to access instance variable
		System.out.println("This is " + obj.name);
		System.out.println();
	
		
		if(a > b) {
			System.out.println("a is greater");
		}else {
			System.out.println("b is greater");
		}

}
}