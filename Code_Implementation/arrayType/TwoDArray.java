package arrayType;

//2D array is a type of array that stores multiple data elements of the same type in matrix or table like format with a number of rows and columns.

public class TwoDArray {

	public static void main(String[] args) {
		int[][] myarray = new int[2][2]; //2 rows and 2 columns.

		myarray[0][0] = 10;
		myarray[0][1] = 20;
		myarray[1][0] = 30;
		myarray[1][1] = 40;

		System.out.println("Array elements are:");

//		System.out.println(myarray[0][0] + " " +myarray[0][1]);
//		System.out.println(myarray[1][0] + " " +myarray[1][1]);

		for (int i = 0; i < myarray.length; i++) { //row
			for (int j = 0; j < myarray[i].length; j++) { //column
				System.out.print(myarray[i][j] + " ");
			}
			System.out.println(); 
		}
	}

}
