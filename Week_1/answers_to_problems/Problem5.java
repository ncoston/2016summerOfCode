public class Problem5{
	public static void main(String[] args){
		int currentIteration = 20; //the problem asks us to check even divisibility up to 20, so I might as well start our checks at 20. micro optimization. 
		while (!checkIfNumberIsDivisibleByAnyUpTo(20, currentIteration)){
			currentIteration++;
		}
		System.out.println("final answer: " + currentIteration);
	}

	private static boolean checkIfNumberIsDivisibleByAnyUpTo(int upTo, long number){
		for (int i = 2; i <= upTo; i++){
			if (number % i != 0){
				return false;
			}
		}
		return true;
	}
}