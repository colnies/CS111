
public class Sum {

	public static void main(String[] args) {
		System.out.println("Enter your first number: ");
		int firstNumber = IO.readInt();
		System.out.println("Enter your second number: ");
		int secondNumber = IO.readInt();

		int result = firstNumber+secondNumber;
		
		IO.outputIntAnswer(result);
	}

}
