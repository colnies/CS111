
public class star {
	public static void main(String[]args){
		System.out.println("Enter number");
		int input =IO.readInt();
		for(int i=0; i<=input;i++){
			for(int j=i;j>0;j--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
