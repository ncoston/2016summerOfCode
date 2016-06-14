import java.math.*;
public class Problem6{
	public static void main(String[] args){
		System.out.println("answer: " +  (squareOfSums(100) - sumOfSquaresUpTo(100)));
	}

	private static long sumOfSquaresUpTo(long number){
		long currentNumber = 0L;
		for (int i = 1; i <= number; i++){
			currentNumber += i * i;
		}
		return currentNumber;
	}

	private static double squareOfSums(long number){
		long currentNumber = 0L;
		for (int i = 1; i <= number; i++){
			currentNumber += i;
		}
		return Math.pow(currentNumber,2);
	}
}