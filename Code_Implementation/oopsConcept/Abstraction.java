package oopsConcept;

import java.util.Scanner;

public class Abstraction implements AbstractMath {

	@Override
	public void add() {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any 2 values for addition");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a+b;

		System.out.println("addition is " + c);	
	} 
	@Override
	public void sub() {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any 2 values for substraction");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a-b;

		System.out.println("substraction is " + c);
	}
	
	@Override
	public void mul() {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any 2 values for multiplication");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a*b;

		System.out.println("multiplication is " + c);
	}
	@Override
	public void div() {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any 2 values for division");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a/b;

		System.out.println("division is " + c);
	}
	public static void main(String[] args) {
		
		AbstractMath obj = new Abstraction();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();


	}

}
