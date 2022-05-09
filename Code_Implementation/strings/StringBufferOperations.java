package strings;

public class StringBufferOperations {
	public static void main(String[] args)
	{
		// Creating an object of StringBuffer class and passing random string
		
		StringBuffer sb = new StringBuffer("Java");
		System.out.println("Original string: " + sb);
		
		sb.append(" is a programming language.");
		System.out.println("After appending: " + sb);
		
		sb.delete(0, 4); 
		sb.insert(0, "Python");
		System.out.println(sb);
		
		System.out.println("Reverse of string: " + sb.reverse());
		
		 
		
	}
}

