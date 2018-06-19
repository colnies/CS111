public class NthPrime {
	
	public static boolean isPrime(int n) {
	    for(int i = 2; i < n; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
public static void main(String[] args) {

		System.out.println("Enter value n:");
			int n =IO.readInt();
			int z;
			int count=0;
		while(n<0){
			IO.reportBadInput();
			System.out.println("Enter value n:");
			n =IO.readInt();
		}
	    for(z =2; count < n; z++) {
	        if (isPrime(z)) {
	            ++count;
	        }
	    }
	    IO.outputIntAnswer(z-1);
	}
}

