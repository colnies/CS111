
public class LuckySevens {

	public static void main(String[] args) {
		
		IO.outputStringAnswer("Enter lower range value");
		int lower = IO.readInt();
		
		/*while(lower<0) {
			IO.reportBadInput();
			System.out.println("Number must be greater than 0");
			lower = IO.readInt();
		} */
		
		IO.outputStringAnswer("Enter upper range value");
		int upper = IO.readInt();
		
		while(upper<=lower) {
			IO.reportBadInput();
			System.out.println("Try again, must be smaller than lower range");
			upper= IO.readInt();
		}
		
		int term, count =0;
		for(int i = lower; i<=upper; i++) {
			term=i;
			
			while(term>0) {
				if(term%10==7) {
					count++;
				}
				term=term/10;
			}
			
		}
		IO.outputIntAnswer(count);
	}

}
