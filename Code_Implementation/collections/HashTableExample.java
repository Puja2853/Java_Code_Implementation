package collections;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		
		//Hashtable t = new Hashtable(); //default capacity is 11, load factor is 0.75
		//Hashtable t = new(initial capacity); //create Hashtable object with some capacity
		//Hashtable t = new Hashtable(initial capacity, fill ratio/load factor);
		
		Hashtable <Integer, String> t = new Hashtable <Integer, String>();
		t.put(101, "Puja");
		t.put(102, "john");
		t.put(103, "marry");
		t.put(104, "Tye");
		//t.put(null, "Puja"); //gives null pointer exception
		//t.put(105, null); //gives null pointer exception
		
		System.out.println(t);
		
		
		

	}

}
