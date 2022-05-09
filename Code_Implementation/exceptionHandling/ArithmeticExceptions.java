package exceptionHandling;

public class ArithmeticExceptions {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		
		try {
			System.out.println(arr[3]/0);
		}catch(ArithmeticException exception) {
			System.out.println(exception);
		}
	}
}
 