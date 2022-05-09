package controlFlowStatements;

public class If_Else_If {

	public static void main(String[] args) {
		int x = 60;
		int y = 67;
		int z = 59;

		if( x == y && x == z && y == z ) {
			System.out.print("All numbers are equal");
		}else if( x > y && x > z) {
			System.out.print("Value of x is maximum");
		}else if( x < y && x < z ) {
			System.out.print("Value of x is minimum");
		}else {
			System.out.print("x is neither maximum nor minimum");
		}
	}
}


