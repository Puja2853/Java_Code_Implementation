package javaBasicConcept;

public class Operators {

	public static void main(String[] args) {
		
		//Unary Operator 
		int x=10;
		System.out.println(x++);//10 --> x = 11  
		System.out.println(++x);//12  
		System.out.println(x--);//12 --> x = 11  
		System.out.println(--x);//10
		System.out.println();
		
		//Arithmetic Operator
		byte b = 100;
		short s = 5000;
		System.out.println(b - s);
		System.out.println(b + s);
		System.out.println(b * s);
		System.out.println(b / s);
		System.out.println(b % s);
		System.out.println();
		
		//Assignment Operators
		float f = 5.99f;    
		double d = 19.99d;
		f += d;
		d -= f;
		System.out.println(f);
		System.out.println(d);
		System.out.println();
		
		//Relational Operators
		int num1 = 100, num2 = 897;
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println();
		
		//Logical Operators
		int m=10;  
		int n=5;  
		int c=20;  
		boolean y=false; 
		System.out.println(m<n && m++ < c);//false && true = false  
		System.out.println(m>n||m<c);//true || true = true
		System.out.println(!y);//true
		System.out.println();
		
		//Ternary Operator
		int n1 = 5, n2 = 10, res;
		res = (n1 > n2) ? (n1 + n2) : (n1 - n2);
		System.out.println(res);
		System.out.println();
		
		//Bitwise Operators
		int a = 5;
        int r = 7;
        System.out.println("a&r = " + (a & r)); // 0101 & 0111=0101 = 5
        System.out.println("a|r = " + (a | r)); // 0101 | 0111=0111 = 7
        System.out.println("a^r = " + (a ^ r)); // 0101 ^ 0111=0010 = 2
		System.out.println();
		
		//Shift operator
		int number = 8;
		System.out.println(number << 2); // 2 bit left shift operation..32
		System.out.println(number >> 2); // 2 bit right shift operation..2
		
	    }
	}


