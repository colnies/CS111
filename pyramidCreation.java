
public class pyramidCreation {

	public static void main(String[] args) {
		System.out.println("What is the height of the pyramid?");
		int height= IO.readInt();
		int j;
		int i;
	for (i=1;i<height;i++){
		for(j=0;j<i;j++){
			System.out.print("*");
			}
		System.out.println();
	}
	for (i=height-1;i>=1;i--){
		for (j=0;j<i;j++){
			System.out.print("*");
		}
		System.out.println();
	}

}
}
