package controlFlowStatements;

public class WhileLoop {

	public static void main(String[] args) {
		String str = "hello world";
        int i = 0;
        
		while (i < str.length()) {
            System.out.println(i + " : " + str.charAt(i));
            i++;
        }
	}
}
 
