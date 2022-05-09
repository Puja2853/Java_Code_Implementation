package exceptionHandling;

public class ExceptionhandlingWithThrows {
	
	public static void demo() throws Exception{
		String str = null;
		throw new NullPointerException("not valid");
		//System.out.println(str.length());
	}
	
	public static void main(String[] args) {
		
		try {
			demo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

} 
