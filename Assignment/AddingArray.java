package assignment;

public class AddingArray {

	public static void main(String[] args) {
		int[][][] arr1 = { { { 1, 2, 3}, { 4, 5, 6 } },  { { 7, 8, 9 }, { 10, 20, 30 } },
				{ {40, 50, 60 }, { 70, 80, 90 } } };
		
		int[][][] arr2 = { { { 1, 2, 809 }, { 4, 50, 6 } },  { { 97, 8, 9 }, { 10, 20, 30 } },
				{ {40, 50, 680 }, { 70, 809, 90 } } };
		
		int[][][] arr3 = new int[arr1.length][arr1[1].length][arr1[1][1].length]; //declaring dimension 
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j =0; j < arr1[1].length; j++) {
				for(int k =0; k < arr1[1][1].length; k++) {
					
					arr3[i][j][k] = arr1[i][j][k] + arr2[i][j][k];
					
					System.out.print(arr3[i][j][k] + " ");
					
				}
			}
		}
	}

}
