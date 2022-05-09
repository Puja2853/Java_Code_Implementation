package exceptionHandling;

public class MultipleException {

	public static void main(String[] args) {
		String str = null; //we are creating a string literal str pointing to null string object.
		
		try {
			System.out.println(str.equals("Test"));//null.equals("Test")
			
		}catch(NullPointerException | ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
		}
	}

}
 