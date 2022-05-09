package consructor;

public class ConstructorOverloading {
	int sum, sub, mul;
	
	public ConstructorOverloading() {
		sum = 0;
		sub = 0;
		mul = 0;
	}
	public ConstructorOverloading(int x, int y){
		sum = x + y;
		sub = x - y;
		mul = x * y;
	}
	public ConstructorOverloading(int x, int y, int z){
		sum = x + y + z;
		sub = x - y - z;
		mul = x * y * z;
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading num = new ConstructorOverloading(34, 78);
		System.out.println(num.sum);
		System.out.println(num.sub);
		System.out.println(num.mul);
		
		ConstructorOverloading num2 = new ConstructorOverloading(98, 45, 22);
		System.out.println(num2.sum);
		System.out.println(num2.sub);
		System.out.println(num2.mul);
	}

}
