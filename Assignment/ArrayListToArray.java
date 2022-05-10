package assignment;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> city = new ArrayList<>();

		// Add elements in the list
		city.add("Pune");
		city.add("Mumbai");
		city.add("Latur");
		city.add("Nashik");
		city.add("Latur");
		city.add("Satara");
		city.add("Nagpur");
		city.add("Latur");
		
		System.out.println("ArrayList: " + city);

		// Convert ArrayList into the string array		
		String[] arr = city.toArray(new String[city.size()]); 
		System.out.println("Array: ");
		
		for(String item:arr) {
			System.out.println(item);
		}
		
	        
	       
	}

}
