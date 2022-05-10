package assignment;

public class MoveZeroAtFront {

	public static void main(String[] args) {
		
		int arr[] = {1,0,7,8,6,4,0,0};
		
		for(int i=0; i < arr.length; i++){
			
			if(arr[i] == 0){ 
				
				int count = arr[i]; 
				
				for(int j=0; j <= i ; j++){
					
					arr[j] += count; 
					count = arr[j] - count; 
					arr[j] -= count;				
				}
			}
		}
		
		for(int i = 0;i<arr.length;i++) { 
			
			System.out.print(arr[i] + " ");
	}


        
	}

}