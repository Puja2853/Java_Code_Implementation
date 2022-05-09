package oopsConcept;

class Test {
	//Implementing a method
	public String add(String a, String b){
		return a+b;
	}
}

//Defining a child class
public class RuntimePolymorphism extends Test {

	// Overriding the parent method
	@Override
	public String add(String a, String b){ 
		return a+b;
	}
	// Driver code
	public static void main(String args[]){
		
		Test test = new RuntimePolymorphism();
		System.out.println(test.add("Hello " , "world !"));
	}
}



