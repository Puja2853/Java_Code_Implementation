package controlFlowStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		int age = 20;
		String gender = "male";
		if(age > 18) {
		    if(gender == "male") {
		        System.out.println("You can shop in the men's section on the 3rd Floor");
		    }
		    else {
		        // person is a female
		        System.out.println("You can shop in the women's section on 2nd Floor");
		    }
		}
		else {
		    // person is not an adult
		    System.out.println("You can shop in the kid's section on 1st Floor");
		}
		

	} 

}
