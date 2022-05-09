package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByValues {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "Pune");
		map.put(3, "Mumbai");
		map.put(1, "Nagpur");
		map.put(5, "Latur");

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	//	map.forEach((key,value)-> System.out.println(key + "=" + value));
		
		System.out.println("After Sorting by value");
		List<Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
		
		list.sort(Entry.comparingByValue());
		list.forEach(System.out::println);

	}

}
