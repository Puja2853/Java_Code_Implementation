package AccessModifiers;

//When no access modifier is specified, java is treated as a default modifier. 
//The scope of the default modifier is limited to within the package.

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
