import java.util.*;
public class Problem3 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please provide the number you want to find the prime factorization of");
			return;
		}
		System.out.println(findHighestPrimeFactorFast(Long.valueOf(args[0])));
	}

	/**
	 * This function is just a little function that (rather inneficiently) finds the highest prime factor of a number. it could probably be parrallelized, have a list of found primes already, etc.
	 * etc. etc. but it's fine as is. Takes in a long number, does a double for loop, and returns the prime factor that is the largest.
	 *
	 * @param the number we want to find the prime factor of.
	 * @return the long-valued highest prime factor of the number.
	 */
	public static Long findHighestPrimeFactorSlow(Long number) {
		Long currentHighestFactor = 0L;
		List<Long> primesSoFar = new LinkedList<>(); // our list for keeping primes that we've found so far.
		for (Long i = 2L; i < (number / 2) ; i++) { //Gotta use Longs because int isn't big enough
			if (number % i == 0) { //Good, this means this is a factor of our number we want
				boolean isPrime = true;
				if (i == 2) {
					primesSoFar.add(i); // some special cases for 1 and 2
					isPrime = true;
				} else {
					for (Long prime : primesSoFar) { // we only need to make sure that the primes we've found so far don't divide the number, since all other numbers can be expressed as composites of primes
						if (i % prime == 0) {
							isPrime = false;
							break;
						}
					}
				}
				if (isPrime) {
					if (i > currentHighestFactor) {
						currentHighestFactor = i; //keep increasing our highest factor (the check before this should be meaningless, but I left it in for completeness sake.)
					}
					primesSoFar.add(i); //don't forget to add it to our primes list.
				}
			}
			if (i % 10000000 == 0) {
				System.out.println("On index: " + i);
			}
		}
		return currentHighestFactor;
	}

	/**
	 * So, after giving it some more thought, this is a much better way of doing it (thus the name). I've left the slow solution in case anyone is curious about the first thing I tried.
	 * yay math.
	 *
	 * @param the number we want to find the prime factor of.
	 * @return the long-valued highest prime factor of the number.
	 */
	public static Long findHighestPrimeFactorFast(Long number) {
		Long currentHighestFactor = 0L;
		Long divisor = 2L;
		while (number > 1) {
			while (number % divisor == 0) {
				currentHighestFactor = divisor;
				number /= divisor; // here's the magic, we're decreasing our iterator size as we go along, so if the number is nicely divisible by some low primes, it makes this go reeeealllyyy fast.
				//It's not quite as magical for a prime number (re: really slow), but well, they gave us a number divisible by 2 in the problem. so meh.
			}
			divisor ++;
			if (divisor * divisor > number) {
				if (number > 1) {
					currentHighestFactor = number;
				}
				break;
			}
		}
		return currentHighestFactor;
	}
}