public class recursion {
	public static void printStars(int n){
			if(n<=0){
				return;
			}else{
			System.out.print("*");
			printStars(n-1);
		}
	}
	public static void printTriangle(int n){
		if(n<=0){
			return;
		}else{
			printTriangle(n-1);
			System.out.println("");
			printStars(n);
			}
	}
	public static int factorial(int n){
		if(n==1||n==0){
			return 1;
		}
		return factorial(n-1)*n;
	}
public static void main (String[] args){
	IO.outputIntAnswer(factorial(6));

}
}