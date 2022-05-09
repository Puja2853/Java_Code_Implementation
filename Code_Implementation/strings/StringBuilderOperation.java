package strings;

//Same as StringBuffer but it is not thread safe i.e non-synchronized.
public class StringBuilderOperation {

	public static void main(String[] args) {

		StringBuilder sd = new StringBuilder();

		sd.append("Puja ");
		
		System.out.println("Capacity of string sd: " + sd.capacity());
		System.out.println("Lenght of sd: " + sd.length());
		


	}

}
 