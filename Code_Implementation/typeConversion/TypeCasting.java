package typeConversion;

public class TypeCasting {

	public static void main(String[] args) {
		
		//Widening Casting
		int num = 7;
	    double d = num; // Automatic casting: int to double
	    
	    System.out.println(num);      // 7
	    System.out.println(d);   // 7.0
	    
	    //Narrowing Casting
	    double num2 = 89.799d;
	    int num3 = (int) num2; // Manual casting: double to int

	    System.out.println(num2);   // 89.799
	    System.out.println(num3);	// 89
	}

} 
