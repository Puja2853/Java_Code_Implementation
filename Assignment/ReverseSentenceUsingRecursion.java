package assignment;

import java.util.Scanner;

public class ReverseSentenceUsingRecursion {
	
	public static String reverseSentence(String str) {
	      if (str.isEmpty())
	        return str;
	      
	      return reverseSentence(str.substring(1)) + str.charAt(0); 
	   }
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(reverseSentence(str));

	}

}
