import java.util.*;
public class Problem7{
	public static void main(String[] args){
		List<Integer> currentPrimes = new ArrayList<>();
		int currentIterator = 2;
		boolean wasPrime = true;
		while (currentPrimes.size() != 10001){
			for (Integer prime : currentPrimes){
				if (currentIterator % prime == 0){
					wasPrime = false;
				}
			}
			if (wasPrime){
				currentPrimes.add(currentIterator);
			}
			wasPrime = true;
			currentIterator++;
		}
		System.out.println("10001 prime is: " + (currentIterator-1));
	}
}