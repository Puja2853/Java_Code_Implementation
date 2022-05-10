package controlFlowStatements;

public class DoWhile {

	public static void main(String[] args) {
		int arr[]={0,1,2,3,4,5,9};
		int i=0;

		do{
			System.out.println(arr[i]);
			i++;

		}while(i<arr.length);

	}
}

