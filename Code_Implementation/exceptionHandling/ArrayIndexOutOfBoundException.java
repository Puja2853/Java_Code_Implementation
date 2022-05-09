package exceptionHandling;

//When normal flow of program is disrupted and application crashes
public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6};

		try {
			System.out.println(arr[45]);
		}catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
		}finally {
			System.out.println("Try other index number");
		}

	}

}
 