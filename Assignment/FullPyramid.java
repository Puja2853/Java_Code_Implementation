package assignment;

public class FullPyramid {

	public static void main(String[] args) {

		int row =6;
		System.out.println("Full pyramid: ");
		for (int i=0; i<row; i++){  //rows 

			for (int j= row-i; j>1; j--){  //for space

				System.out.print(" ");  
			}   

			for (int j=0; j<=i; j++ ){ //columns  

				System.out.print("* ");   
			}   

			System.out.println();   
		} 
		
		System.out.println("Inverted full pyramid: ");
		
		for (int i= 0; i<= row-1; i++) { 
			
			for (int j=0; j<=i; j++) {  
				
				System.out.print(" ");  
			}  
			
			for (int k=0; k<=row-1-i; k++){ 
				
				System.out.print("* ");  
			}  
			System.out.println();  
		}  
	}

}
