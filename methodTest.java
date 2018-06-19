
public class methodTest {

	public static int multiply (int x, int y){
		int product = 0;
		int count = 0;
		for (count=0; count<y;count++){
			product= product+x;
		}
		return product;
	}
	public static void main(String[] args) {
		int c= methodTest.multiply(9,12);
		System.out.println(c);

	}

}
