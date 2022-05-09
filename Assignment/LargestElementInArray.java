package assignment;

public class LargestElementInArray {

	public static void main(String[] args) {
		int[] a = {10, 20, 30, 400, 50, 60};
		int max = a[0];
		for(int i=0; i < a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}

}
