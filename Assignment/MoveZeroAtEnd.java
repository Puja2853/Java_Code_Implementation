package assignment;

public class MoveZeroAtEnd {

    public static void move(int[] arr) {

        int count = 0; //count of non-zero number

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
            	
            //arr[0]=1--> 1 !=0 --> count = 0
            //arr[1]=0--> 0 =0 --> count = 0
            //arr[2]=7--> 7 !=0 --> count = 1
            //arr[3]=8--> 8 !=0 --> count = 2
            	
               arr[count++] = arr[i];
             }
         }
        
         while(count <  arr.length) {
            arr[count++] = 0;
         }
        
         for(int j = 0; j <  arr.length; j++) {
            System.out.print(arr[j] + " ");
         }
    }

	public static void main(String[] args) {
		
		int arr[] = {1,0,7,8,6,4,0,0};
		move(arr);
		

        
	}

}
