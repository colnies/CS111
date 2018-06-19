
public class stringRecitation {

	public static void main(String[] args) {
		System.out.println("Enter palindrome: ");
		String input = IO.readString();
		
		for(int i=0; i<=input.length()-1;i++){
			if(input.charAt(i)==input.charAt(input.length()-1-i)){
				if(i==input.length()-1){
					System.out.println("This is a palindrome");
				}
			}
			else{
				System.out.println("Not a palindrome");
				return;
			}
					
		}

	}

}
