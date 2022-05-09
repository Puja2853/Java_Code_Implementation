package assignment;

public class PalindromeString {

	public static void main(String[] args) {
		String str="oopoo";
		String rev="";
		
		int len = str.length(); // len = 4
		for(int i = len - 1; i >= 0; i--) {
			rev= rev + str.charAt(i);
			
			//first iteration, i=4, str.charAt(4)= o, rev= ""+ o, rev=o
			//second iteration, i=3, str.charAt(3)= o, rev= o + o, rev=oo
			//third iteration, i=2, str.charAt(2)= p, rev= oo + p, rev=oop
			//fourth iteration, i=1, str.charAt(1)= o, rev= oop + o, rev=oopo
			//first iteration, i=0, str.charAt(0)= o, rev= oopo + o, rev=oopoo
			
		}
		if(str.equals(rev)) {
			System.out.println(str + " is palindrome" );
		}
		else {
			System.out.println(str + " is not palindrome" );
		}
	}

}
