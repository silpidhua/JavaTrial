package interview.question;

public class SquareRoot {
	public static float findSquareRoot(int n) {
		float currentEstimate, newEstimate=n/4;
		do {
			currentEstimate = newEstimate;
			float estimatedSquare =  currentEstimate* currentEstimate;
			System.out.println(estimatedSquare);
			newEstimate = currentEstimate-((estimatedSquare-n) /(2*currentEstimate));
			System.out.println("New Estimate:"+newEstimate);
		}while(newEstimate*newEstimate != n) ;
		
		 return newEstimate;
	}
	public static void main(String[] args) {
		System.out.println("squareRoot:"+findSquareRoot(64));
		SquareRoot obj = new SquareRoot();
		System.out.println(obj.findSquareRoot(9));
		//System.out.println(Math.sqrt(9));

	}

}
