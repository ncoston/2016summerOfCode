/**
* My solution to problem 1 for the 2016 Summer Of Code
*/
public class Problem1 {

	public static void main(String[] args) {
		long runningSum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				runningSum += i;
			}
		}
		System.out.println("running sum result: " + runningSum);
	}

}