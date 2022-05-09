package arrayType;

public class ThreeDArray {

	public static void main(String[] args) {
		
		int[][][] arr = { { { 1, 2, 3 }, { 4, 5, 6 } },  { { 7, 8, 9 }, { 10, 20, 30 } },
				{ {40, 50, 60 }, { 70, 80, 90 } } }; 
	
		for (int i = 0; i < 3; i++) {  //3 tables, 2 rows and 3 columns
			for (int j = 0; j < 2; j++) { 
				for (int k = 0; k < 3; k++) { 
					System.out.print(arr[i][j][k] + "\t"); 
				}   
				System.out.println(); 
			} 
			System.out.println(); 
		} 

	}}
 