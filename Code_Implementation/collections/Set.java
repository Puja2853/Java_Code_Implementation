package collections;

import java.util.HashSet;
import java.util.TreeSet;

//Set: Interface, HashSet: implementation, TreeSet: implementation(sorted)

public class Set {

	public static void main(String[] args) {
		
		System.out.println("========Hash Set==========");
		
		HashSet<String> set = new HashSet<String>(); //data is unordered due to hashing
		
		set.add("Puja");
		set.add("Balaji");
		set.add("Nikita");
		set.add("Laxmi");
		set.add("Mahesh");
		set.add("Vidya");
		set.add("Puja");
		set.add("Puja");
		//duplicate not allowed
		for(String str:set) {
			System.out.println(str);
		}
		
		System.out.println("========Tree Set==========");
		
		TreeSet<Integer> tree = new TreeSet<Integer>(); //data is unordered and sorted 
		tree.add(34);
		tree.add(34);
		tree.add(66);
		tree.add(67);
		tree.add(76);
		tree.add(76);
		tree.add(76);
		tree.add(76);
		//duplicate not allowed and sorted 
		for(Integer i:tree) {
			System.out.println(i);
		}

	}

}
