
public class Score {

	public static void main(String[] args) {
		double max=0.0;  
		double min=10.0;  
		double numScore;  
		double sum=0;  
		
		System.out.println("How many judges are on the panel?");
		int NumJudges = IO.readInt(); 
			if (NumJudges < 3){ 
				IO.reportBadInput();
				System.out.println("Enter correct amount of judges");
				NumJudges=IO.readInt();
			} 

	for (int x=0;x<NumJudges;x++){  
		System.out.println("Enter your score:"); 
		numScore = IO.readDouble(); 
		
		while (numScore > 10 || numScore < 0){  
		IO.reportBadInput(); 
		System.out.println("Please enter another score");
		numScore=IO.readDouble();
		} 


		if (numScore < min){ 
		min = numScore; 
		} 
		if (numScore > max){  
		max = numScore; 
		} 

		sum=sum+numScore; 
		} 
		sum=(sum-min-max)/(NumJudges-2); 
		IO.outputDoubleAnswer(sum); 
	} 
}