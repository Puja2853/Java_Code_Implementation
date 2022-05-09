package AccessModifiers;

class DefaultAccessModifier {
	String fname = "Puja";
	String lname = "Kadam";
	int age = 22;

	public static void main(String[] args) {
		DefaultAccessModifier myObj = new DefaultAccessModifier();

		System.out.println("Name: " + myObj.fname + " " + myObj.lname);
		System.out.println("Age: " + myObj.age);
	}
} 
