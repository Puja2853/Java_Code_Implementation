package assignment;

public class FirstNonRepeatingCharacter{

	public static void main(String[] args) {
		String s = "I have no money at the moment and I will get some by end of the month";
		String s1 = s.toLowerCase().replace(" ", "");
		int l = 0;
		for(int i =0;i<s1.length();i++) {
			boolean condition = true;
			for(int j =0;j<s1.length();j++) {
				if(i != j && s1.charAt(i)==s1.charAt(j)) {
				condition =false;
				break;
				}		
			}
			if(condition) {
				System.out.println("First non-repeating character is: " + s1.charAt(i));
				l++;
				break;
			
			}
			
		}
		if(l == 0) {
			System.out.println("Given string has no non-repeating character");
		
		}
		
		

	}

}
