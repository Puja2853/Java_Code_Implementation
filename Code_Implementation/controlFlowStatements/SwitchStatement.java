package controlFlowStatements;

public class SwitchStatement {

	public static void main(String[] args) {
		String Company = "Capgemini";
		switch (Company){
		    case "Capgemini":
		        System.out.println("Company name is Capgemini");
		        break;
		    case "TCS":
		        System.out.println("Company name is TCS");
		        break;
		    case "Cognizant":
		        System.out.println("Company name is Cognizant");
		        break;
		    default:
		        System.out.println("Company name is not Valid");
		} 

	}

}
