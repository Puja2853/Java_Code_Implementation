package assignment;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 20; // a= 22
		int b = 22;//b=20
		int a1=20;
		int b1=22;
		// a = a+b  = 20+22 = 42
		// b=a-b = 42 -22 = 20
		// a=a-b =42-20=22
		a =a+b; // 20+22=42
		b=a-b;  //42-22=20
		a=a-b; //42-20=22
		System.out.println("with add and sub: a=" + a + " " + "b=" + b);
		a1 =a1*b1; // 20*22 = 440
		b1=a1/b1;  //440/22=20
		a1=a1/b1; //440/20=22
		System.out.println("with mul and div: a1=" + a1 + " " + "b1=" + b1);
		}



	}


