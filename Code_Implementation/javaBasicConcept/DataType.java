package javaBasicConcept;

public class DataType {

	public static void main(String[] args) {
		//Primitive Data Types
		System.out.println("Size of byte: " + (Byte.SIZE/8) + " bytes.");
		System.out.println("Size of short: " + (Short.SIZE/8) + " bytes.");
		System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
		System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
		System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
		System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
		System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");      
		
		//Non-primitive Data Types[String, Array, Class, Interface]
		String str = "Hello";     
		int arr[] = {1, 2, 3, 6, 9}; 
		System.out.println(str.length());
		System.out.println(arr[3]);
	}

}
