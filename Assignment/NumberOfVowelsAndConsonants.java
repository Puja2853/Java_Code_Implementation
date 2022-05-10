package assignment;

public class NumberOfVowelsAndConsonants {

	public static void main(String[] args) {
		String str = "Java is a programming language"; 
		int vowels =0;
		int consonants =0;
		
		String str1 = str.toLowerCase().replaceAll(" ", "");
		
		for(int i = 0; i<str1.length();i++) {
			if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'u' || str1.charAt(i) =='o') {
				
				vowels++;
				
			}else {
				consonants++;
			}
			
		}
		System.out.println("Numbers of vowels are: " + vowels);
		System.out.println("Numbers of consonants are: " + consonants);
				

	}

}
