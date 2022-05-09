package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashmapToList {

	public static void main(String[] args) {
	    Map<Integer, String> map = new HashMap<>();
        map.put(1, "Puja");
        map.put(2, "Balaji");
        map.put(3, "Kadam");
        map.put(4, "Laxmi");
        map.put(1, "Puja");

        List<Integer> keyList = new ArrayList(map.keySet());
        List<String> valueList = new ArrayList(map.values());

        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valueList);

	}

}
