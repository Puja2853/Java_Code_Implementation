package exceptionHandling;
 
public class UnknownExceptions {

	public static void main(String[] args) {

		String str = "Puja";
		
		try {
			System.out.println(Integer.valueOf(str));
			// we use Exception if we don't know the name of exception 
		}catch(Exception e) {
			System.out.println("Message: " + e.getMessage()); 
			System.out.println("cause: " + e.getCause());
			e.printStackTrace();
		}

	}

}
 