package collections;

import java.util.ArrayList;
import java.util.Iterator;

//Insertion order is preserved. Duplicate allowed.

public class List {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		ArrayList list2 = new ArrayList(); //can store any type of object
		
		list1.add(89); //0
		list1.add(65); //1
		list1.add(43); //2
		list1.add(23); //3
		list1.add(79); //1
		list1.add(56); //2
		
		list2.add(10); //0
		list2.add("Nikita"); //1
		list2.add(5.8); //2
		list2.add(10); //3
		list2.add("Puja"); //4
		list2.add(5.8); //5
		
		
		//print elements in the list the way we added in a sequence
		System.out.println("list 1: " + list1);
		System.out.println("list 2: " + list2);

		System.out.println("=================================");
		
		if(list2.contains("Puja")) {
			System.out.println("Element is present");
		}else {
			System.out.println("Element is not present");
		}
		
		System.out.println("=================================");
		//in java object is parent of any type in java 
		Object o = list2.get(2);
		System.out.println(o);
		
		System.out.println("=================================");

		System.out.println("Iterating with for loop");
		for(int i =0; i < list1.size(); i++) {
			
			System.out.println(list1.get(i));
		}
		
		System.out.println("Iterating with enhanced for loop");
		for(int i:list1) {
			System.out.println(i);
		}
		
		System.out.println("Iterating with Iterator");
		Iterator<Integer> itr = list1.iterator();
		
		while(itr.hasNext()) {
			Integer it = itr.next(); //it gives next element whenever it is called one by one
			System.out.println(it);
		}
		
		
	}

}
