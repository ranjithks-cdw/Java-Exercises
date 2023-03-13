package exercise1;

/**
 * 
 * Prime Numbers between 1 and 100
 */
public class PrimeBetween {
	
	//	Main method
	public static void main(String[] args) {
		System.out.println("Prime between 1 and 100:");
		printPrimes(1,100);
	}
	
	//	Print prime numbers between 1 and 100
	private static void printPrimes(long from, long to) {
		for(long i=from; i<=to; i++)
			if(isPrime(i))
				System.out.print(i+" ");
	}
	
	// Check if the number is prime	
	private static boolean isPrime(long number) {
		if(number<=1)
			return false;
		if(number==2)
			return true;
		if(number%2==0)
			return false;
		for(long index=3;index<=Math.sqrt(number);index+=2)
			if(number%index==0)
				return false;
		return true;
	}
}
