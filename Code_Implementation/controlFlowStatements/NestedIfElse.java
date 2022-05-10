package controlFlowStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		int age = 20;
		boolean votingCard = false;
		
//		int age = 20;
//		boolean votingCard = true;
		
//		int age = 10;
//		boolean votingCard = true;
		
//		int age = 10;
//		boolean votingCard = false;
		
		
		if(age > 18) {
		    if(votingCard) {
		        System.out.println("You are eligible for voting");
		    }
		    else {
		        System.out.println("Please apply for voting card");
		    }
		}
		else {
		   
		    System.out.println("You are not eligible for voting");
		}
		

	} 

}
