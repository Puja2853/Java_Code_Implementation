package assignment;
//prime number is  divisible by 1 and itself
public class PrimeNumber {

	public static void main(String[] args) {
		int maxLimit = 100; // Max Limit till where we want to find the prime numbers
        boolean isPrime = true;
        String primeNumberfound = "";
        for (int i = 2; i <= maxLimit; i++) {
            isPrime = checkNumberforPrime(i);// function that would return us whether the number is prime or not
            // Once we have recived the prime number , we would move to the third boundary
            // condition
            // to print the number
            if (isPrime) {
                primeNumberfound = primeNumberfound + i + " ";// we are finding the prime numbers from method
                                                                // checkNumberforPrime and then displaying the numbers
            }
            
        }
        System.out.println("Prime NUmbers from 1 to " + maxLimit + " are:");
        System.out.println(primeNumberfound);
    }
 
    public static boolean checkNumberforPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            // if the remainder found is 0 then number to be checked is not prime and break
            // loop else we would continue the loop.
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}