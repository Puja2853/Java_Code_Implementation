package AccessModifiers;

// public modifier is used to access everywhere and even outside the package

public class PublicAccessModifier {
	
	// public variable
    public int salary;
    public String name = "Radhika";

    // public method
    public void display() {
    	System.out.println("Name of employee is " + name);
        System.out.println("Salary of employee is " + salary);
        
    }
	public static void main(String[] args) {
		// accessing the public class
		PublicAccessModifier obj = new PublicAccessModifier();

        // accessing the public variable
        obj.salary = 30000;
        // accessing the public method 
        obj.display();

	}

}
