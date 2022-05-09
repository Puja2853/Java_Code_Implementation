package assignment;

public class ArrayAvg {

	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50, 60};
		int sum = 0;
		
		int a1 = a.length;
		
		for(int i =0; i < a1; i++) {
			sum = sum + a[i];
		}
		 
		System.out.println(sum / a1);

	}

}
