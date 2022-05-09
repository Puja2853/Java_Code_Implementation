package assignment;

public class ArrayElementPresent {

	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50, 60};
		int num = 20;
		int x = 0;
		for(int i = 0; i < a.length; i++) {
			if(num==a[i]) {
				System.out.println("Element present");
				x++; //if x value doesn't increase then next if statement will execute
				break;
			}
		}
		if(x==0) {
			System.out.println("Not present");
		}

	}

}
