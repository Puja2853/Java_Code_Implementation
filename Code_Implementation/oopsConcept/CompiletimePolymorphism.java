 package oopsConcept;

public class CompiletimePolymorphism {

		public static int div(int a, int b)
		{
			return a*b;
		}

		public static int div(int a, int b, int c)
		{
			return a*b*c;
		}

		public static void main(String args[]){ 
			
			System.out.println(div(34,4));

			System.out.println(div(66,3,9));
		}
	}

 
