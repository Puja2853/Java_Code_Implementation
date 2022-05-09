package assignment;

import java.util.ArrayList;
import java.util.List;

public class JoinList {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(12);
		li.add(172);
		li.add(199);
		li.add(812);
		li.add(345);
		
		List<Integer> li2 = new ArrayList<Integer>();
		li2.add(99);
		li2.add(12);
		li2.add(99);
		li2.add(81);
		li2.add(35);
		
		List<Integer> li3 = new ArrayList<Integer>();
		li3.addAll(li);
		li3.addAll(li2);
		
		System.out.println(li3);
		
	}

}
