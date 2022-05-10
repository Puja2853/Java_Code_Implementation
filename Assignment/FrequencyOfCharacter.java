package assignment;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		String str = "I have no money at the moment";
		String str1 = str.toLowerCase().replace(" ", "");
		
		for(int i = 0; i < str1.length(); i++) {
			int freq =0;
			for(int j = 0; j < str1.length(); j++) {
				if(str1.charAt(i)==str1.charAt(j)) {
					freq++;
				}
					
			}
			System.out.println(" Frequence of " + str1.charAt(i) + " is " + freq);
		}

	}

}
