package exercise1;

import java.util.Scanner;

/**
 * 
 * Check if a number is Armstrong or Palindrome or Perfect Number
 */
public class SpecialNumber {
	//	Member
	public long number;
	
	//	Constructor
	public SpecialNumber(long number) {
		this.number = number;
	}

	//	Main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check speciality: ");
		long number = sc.nextLong();
		System.out.println(printSpeciality(number));
		sc.close();
	}
	
	//	Prints the speciality of a number
	private static String printSpeciality(long n) {
		SpecialNumber obj = new SpecialNumber(n);
		
		String result = n +" is";
		boolean isSpecialNumber = false;
		
		if(obj.isArmstrong(n)) {
			result += " an Armstrong number";
			isSpecialNumber = true;
		}
		
		if(obj.isPalindrome(n)) {
			result += " a palindrome number";
			isSpecialNumber = true;
		}
		
		if(obj.isPerfect(n)) {
			result += " a perfect number";
			isSpecialNumber = true;
		}
		
		if(!isSpecialNumber)
			result += " not a special number";
		return result;
	}
	
	//	Checks the number is Armstrong
	private boolean isArmstrong(long n) {
		long sumOfPowerOfDigits = 0;
		long copyOfN = n;
		int digitsOfN = numberOfDigits(n);
		while(n>0) {
			long remainder = n%10;
			sumOfPowerOfDigits += Math.pow(remainder, digitsOfN);
			n /= 10;
		}
		return sumOfPowerOfDigits==copyOfN;
	}
	
	//	Checks a number is Palindrome
	private boolean isPalindrome(long n) {
		long reverseOfN = 0;
		long copyOfN = n;
		while(n>0) {
			long remainder = n%10;
			reverseOfN = reverseOfN*10 + remainder;
			n /= 10;
		}
		return copyOfN==reverseOfN;
	}
	
	//	Checks a number is perfect number
	private boolean isPerfect(long n) {
		long sumOfFactors = 0;
		for(int i=1;i<=n/2;i++)
			if(n%i==0)
				sumOfFactors += i + (n%i);
		return sumOfFactors==n;
	}
	
	//	Calculates number of digits in a number
	private static int numberOfDigits(long n) {
		int digits = 0;
		for(;n>0;n/=10)
			digits++;
		return digits;
	}

}
