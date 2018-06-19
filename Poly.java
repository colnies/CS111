
public class Poly {

	public static void main(String[] args) {
		System.out.println ("Enter the first root: ");
		int firstRoot = -1*(IO.readInt());
		System.out.println("Enter the second root: ");
		int secondRoot = -1*(IO.readInt());
		System.out.println("Enter the third root: ");
		int thirdRoot = -1*(IO.readInt());
		
		int sumRoot = (firstRoot+secondRoot+thirdRoot);
		int multRoot = (firstRoot*secondRoot*thirdRoot);
		int root = ((firstRoot+secondRoot)*thirdRoot)+(firstRoot*secondRoot);
		
		System.out.println("x^3 + " + "(" + sumRoot + "x^2) + " + "(" + root + "x) + " + "(" + multRoot +")");

	} 

}
