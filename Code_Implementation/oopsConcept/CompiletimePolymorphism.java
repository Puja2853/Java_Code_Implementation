 package oopsConcept;

public class CompiletimePolymorphism {

		public static String add(String a, String b)
		{
			return a.concat(b);
		}

		public static String add(String a, String b, String c)
		{
			return a.concat(b).concat(c);
		}

		// Driver code
		public static void main(String args[])
		{ 
			
			System.out.println(add("Puja", " Kadam"));

			System.out.println(add( "Puja"," Balaji", " Kadam"));
		}
	}

 
