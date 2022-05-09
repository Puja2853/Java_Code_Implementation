package assignment;

public class CharToString {

	public static void main(String[] args) {

		char[] ch = {'h','e','l','l','o'};
		String str1 = String.valueOf(ch); //method 1
		String str2 = new String(ch); //method 2

		System.out.println(str1);
		System.out.println(str2);
	}

}
