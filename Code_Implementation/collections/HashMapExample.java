package collections;
import java.util.*; 

//If we want to represent a group of elements or data in key and value pairs then we use map interface. 
//Duplicate keys are not allowed but duplicate values are allowed

public class HashMapExample{  
	
	@SuppressWarnings("rawtypes")
	public static void main(String args[]){  
		
		HashMap<Integer,String> map=new HashMap<Integer,String>(); 
		
		map.put(1,"Mango");  
		map.put(2,"Apple");    
		map.put(3,"Banana");
		map.put(2,"Apple");    
		map.put(3,"Banana");
		map.put(4,"Grapes");
		map.put(5,"Mango");  
		map.put(6,"Apple");    
		map.put(3,"Chiku");   

		System.out.println("Iterating Hashmap...");  
		for(Map.Entry m : map.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		} 
		
		System.out.println("size of map is: " + map.size());
		System.out.println(map.containsKey(2));//true
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
	}  
}  


