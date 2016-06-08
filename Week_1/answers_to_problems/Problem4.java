import java.lang.Math.*;
public class Problem4 {
	public static void main(String[] args) {
		System.out.println(findPalindromeNumber(3));

	}

	public static double findPalindromeNumber(int numberOfSumDigits) {
		double currentHighest = 0;
		for (double i = (Math.pow(10.0, numberOfSumDigits) - 1); i > (Math.pow(10.0, numberOfSumDigits - 1)); i--) {
			for (double y = (Math.pow(10.0, numberOfSumDigits - 1)); y < (Math.pow(10.0, numberOfSumDigits)); y++) {
				Double number = i * y;
				String inputString = String.valueOf(number.intValue());
				if (inputString.equals(reverseString(inputString))) {
					if (number > currentHighest) {
						currentHighest = number;
					}
				}
			}
		}
		return currentHighest;
	}

	public static String reverseString(String inputString) {
		if (inputString == null || inputString.isEmpty()) {
			return "";
		}
		if (inputString.length() == 1) {
			return inputString;
		}
		return inputString.substring(inputString.length() - 1) + reverseString(inputString.substring(0, inputString.length() - 1));
	}
}