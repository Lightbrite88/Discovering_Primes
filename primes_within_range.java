import java.util.ArrayList;
import java.util.Scanner;
public class primes_within_range {

	public static void main(String[] args) {
		//open input scanner
		Scanner in = new Scanner(System.in);
		
		//Defensive program for selection of range
		System.out.println("Where should the primes start from (pick a natural number larger than 1)?");
		long min = 2;
		long max = 2;
		try {
			min = in.nextLong();
			if (min<2) {
				System.out.println("Invalid input for value from minimum prime.");
				System.out.println("Minimum prime set to 2.");
				min = 2;
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("Invalid input for value from minimum prime.");
			System.out.println("Minimum prime set to 2.");
			min = 2;
		}
		System.out.println("Where should the primes go up to (pick a natural number larger than your minimum)?");
		//ensure max>min
		try {
			max = in.nextLong();
			if (max<min) {
				System.out.println("Invalid input for value from maximum prime.");
				System.out.println("Minimum prime set to minimum.");
				max = min;
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("Invalid input for value from maximum prime.");
			System.out.println("Minimum prime set to minimum.");
			max = min;
		}
		//Close scanner
		in.close();
		//Creation of prime list
		long numPrimesFound = 0;
		ArrayList<Long> primes = new ArrayList<Long>();
		boolean isPrime;
		//check factors up to square root of checked number
		for (long index = min; index<=max; index++) {
			isPrime = true;
			
			long maxFactorOfIndex = (long)Math.sqrt(index);
			long factorToCheck = maxFactorOfIndex;
			while (factorToCheck>1) {
				if (index%factorToCheck == 0) {
					isPrime = false;
					break;
				} else {
					factorToCheck--;
				}	
			}
			//add to list of primes if while loop exited naturally
			if (isPrime) {
				numPrimesFound++;
				primes.add(index);
			}	
		}
		//print results
		if (numPrimesFound==0) {
			System.out.printf("No primes found in the range from %d to %d.", min, max);
		} else {
			System.out.printf("The following primes in the range from %d to %d are:\n", min, max);
			for (int idx = 0; idx < primes.size(); idx++) {
				System.out.println(primes.get(idx) + ", ");
			}
		}

	}

}
