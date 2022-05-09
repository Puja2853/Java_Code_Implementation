package controlFlowStatements;

public class WhileLoop {

	public static void main(String[] args) {
		String str = "hello world";
        int len = str.length();
        int i = 0;
        
		while (i < len) {
            System.out.println(i + " : " + str.charAt(i));
            i++;
        }
	}
}
 
