
public class multTable {
	public static void mult(int num){	
		
		for(int count2=1;count2<=num; count2++){
			for(int count=1; count <= num; count++){
				System.out.print(count*count2+ " ");	
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter value:");
		int num = IO.readInt();
		mult(num);
	
	}
}	