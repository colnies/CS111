
public class recitation {
	public static void main (String[]args){
		System.out.println("Enter your first number");
		int firstNumber= IO.readInt();
		System.out.println("Enter your second number");
		int secondNumber = IO.readInt();
		System.out.println("Enter your third number");
		int thirdNumber = IO.readInt();
		
		double avg = (double)((firstNumber+secondNumber+thirdNumber)/3);
		
		System.out.println("Enter your name");
		String name = IO.readString();
		System.out.println(name + ", the average of your numbers is " + avg);
		
		
	}
}