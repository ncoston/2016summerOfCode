public class Problem2 {
	public static void main(String[] args) {
		System.out.println(getEvenFibNumberSum(4000000, 1L, 2L));
	}

	/**
	* This is just a standard recursive method for calculating an arbitrary fibonacci number sum.
	*
	*/
	public static long getEvenFibNumberSum(int limit, long previousTerm, long term) {
		if (term >= limit) {
			if (term % 2 == 0) {
				return term;
			} else {
				return 0;
			}
		}
		if (term % 2 == 0) {
			return term + getEvenFibNumberSum(limit, term, previousTerm + term);
		} else {
			return getEvenFibNumberSum(limit, term, previousTerm + term);
		}
	}
}