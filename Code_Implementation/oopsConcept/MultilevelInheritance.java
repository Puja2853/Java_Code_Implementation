package oopsConcept;

import java.util.Scanner;

class Shapes {
	Scanner sc = new Scanner(System.in);
	int l = sc.nextInt(); 
	int b = sc.nextInt();

	public int area() {
		return l * b;
	}
}
class Rectangle extends Shapes {
	public int parameter() { 
		return 2*(l + b);
	}
}
class Square extends Rectangle {
	public double diagonal() {
		return Math.sqrt((l*l) + (b*b));
	}
}
public class MultilevelInheritance {
	public static void main(String[] arguments) {
		Square sq = new Square();
		System.out.println(sq.area());
		System.out.println(sq.parameter());
		System.out.println(sq.diagonal());
	}
}