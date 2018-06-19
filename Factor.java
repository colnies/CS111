
public class Factor {

	public static void main(String[] args) {
		
		System.out.println("Enter the first term: ");
		int firstTerm= IO.readInt();
		System.out.println("Enter the second term");
		int secondTerm = IO.readInt();
		
		System.out.println("(x-" + firstTerm + ") * (x-" + secondTerm + ")");
		System.out.println("Is this your term?");
		String answer = IO.readString();
		
		if (answer.equals("yes")){
			System.out.println("Whew, Thank God");
			System.out.println("Okay, now lets solve your equation");
			
			int firstFactor = firstTerm+secondTerm;
			int secondFactor = firstTerm*secondTerm;
			IO.outputStringAnswer("x^2 + " + firstFactor + "x + " + secondFactor);
		}
		else{
			System.out.println("Run the program again");
			return;
		}
	}

}
