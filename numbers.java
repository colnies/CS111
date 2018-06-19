
public class numbers {

	public static void main(String[] args) {
		System.out.println("What is your number?");
			int number=IO.readInt();
			
			
		while(number>0){
			int first=number%10;
			System.out.println(first);
			number=number/10;
		}
			
			
			
			
			
			
			
			
		

	}

}
