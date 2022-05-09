package assignment;

public class ConcatenateArray {

	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40, 50, 60};
		int[] b = {70, 80, 90, 100, 200, 300};
		
		int a1 = a.length;
		int b1 = b.length;
		int c1 = a1 + b1;
		
		int[] c = new int[c1];
		
		for(int i = 0; i < a1; i++) { 
			c[i] = a[i]; 			
		}
		
		for(int i = 0; i < b1; i++) { 
			c[a1 + i] = b[i]; 			
		}
		
		for(int element : c) {
			System.out.print(element + " ");
		}
		}
	}

	


