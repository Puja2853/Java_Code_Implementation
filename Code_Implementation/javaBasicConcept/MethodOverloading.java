package javaBasicConcept;

//same name but different parameters
public class MethodOverloading {
	
	private float mul(float a, float b) {
		return a*b;
	}
	
	private int mul(int a, int b, int c) {
		return a*b*c;
	}
	
	private long mul(long a, long b, long c, long d) {
		return a*b*c*d;
	}
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.mul(39, 48));
		System.out.println(obj.mul(5, 7, 98));
		System.out.println(obj.mul(34, 56, 836, 238));
	}

}
