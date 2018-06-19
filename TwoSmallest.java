
public class TwoSmallest {

	public static void main(String[] args) {

		double min=1.7976931348623157E308;
		double min2=1.7976931348623157E308;
		
		System.out.println("Enter terminating value:");
		double termVal= IO.readDouble();
		
		int count=0;
	for(int i=0;count<2&&i<2;i++){	
		count=0;
		if(i==1){
			IO.reportBadInput();
		}
			System.out.println("Enter value(s):");
			double input=0;
			
		while(input!=termVal){
			input=IO.readDouble();
			if (input<=min && input!=termVal){
				min2=min;
				min=input;
			}
			
			else if(input>=min && input<=min2 && input!=termVal){
				min2=input;
			}
			if(input!=termVal){
				count++;
			}
		}
		continue;
	}
	
		IO.outputDoubleAnswer(min);
		IO.outputDoubleAnswer(min2);
		}
	}
