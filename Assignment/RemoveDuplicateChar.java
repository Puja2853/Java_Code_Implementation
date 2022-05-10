package assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	static void remove(char str[], int n){
		HashSet<Character> s = new LinkedHashSet<>(n - 1);
		// HashSet doesn't allow repetition of elements
		for (char i : str) { //adding string char to set s. 
			s.add(i);
		}

		for (char j : s) { //iterating set s.
			System.out.print(j);
		}
	}
		public static void main(String[] args)
		{
			char str[] = "repetition of elements".toCharArray();
			int n = str.length;

			remove(str, n);
		}
	}
