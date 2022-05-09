package assignment;

import java.util.Scanner;

public class EvenOrOddNumber {

	private void isEven(int num){
		if(num % 2 == 0) {
			System.out.println(num + " is even number");
		}else {
			System.out.println(num + " is odd number");
		}
		
	}

	@SuppressWarnings("resource") //instruct the compiler to ignore or suppress, specified compiler warning in annotated element and all program elements inside that element
	public static void main(String[] args) {
		
		EvenOrOddNumber obj = new EvenOrOddNumber();
		
		Scanner sc = new Scanner(System.in);
		
		obj.isEven(sc.nextInt());

	}

}
