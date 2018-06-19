
public class compIntersect {

	public static void main(String[] args) {
	
		System.out.println("Enter the constant d: ");
			int d = IO.readInt();
		System.out.println("Enter the constant f: ");
			int f = IO.readInt();
		System.out.println("Enter the constant g: ");
			int g = IO.readInt();
		
		System.out.println(d + "x^2 + " + f + "x + " + g);
		System.out.println("Is this your quadratic?");
		String answer= IO.readString();
		
		if(answer.equals("yes")){
			System.out.println("Enter the constant m: ");
				int m = IO.readInt();
			System.out.println("Enter the constant b: ");
				int b = IO.readInt();
				
			System.out.println("Is this your linear equation?");
			System.out.println(m + "x + " + b);
			String twoAnswer = IO.readString();
			
			if (twoAnswer.equals("yes")){
				System.out.println("Correct");
				
			}
			else{
				System.out.println("Reload the program");
				return;
			}
			
		}
			else{
				System.out.println("Reload the program");
					return;
			}
					
					
					
					
					
					
			
		
	}
}
