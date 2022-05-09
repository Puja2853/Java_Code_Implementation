package strings;

public class stringOperation {
	
	public static void main(String[] args) {
		
		String str1 = "Puja";
		String str2 = "Kadam";
		String str3 = "Kadam";
		String str4 = "Balaji";
		 
		String str = str1 + str2;
		System.out.println("Concatenation of str1 and str2 is: " + str);
		
		String str5 = str4.concat(str3);
		System.out.println("Concatenation of str4 and str3 is:" + str5);
		
		System.out.println("Lenght of str1: " + str1.length());
		System.out.println("Lenght of str2: " + str1.length());
		System.out.println("Lenght of str: " + str.length());
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.startsWith("Pu"));
		System.out.println(str5.charAt(3));
		
		

	}

}
