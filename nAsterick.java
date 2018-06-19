
public class nAsterick {

	public static void main(String[] args) {
		
		int i;
		int j;
		System.out.print("What size do you want your triangle?");
		int n =IO.readInt();
		
		for(i=0;i<n;i++){
			for (j=0;j<=i;j++)
				System.out.print("*");
				System.out.println();
			
		}


	}

}
