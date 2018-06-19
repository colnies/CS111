
public class speedingTickets {

	public static void main(String[] args) {
		System.out.println("How fast were you going?");
		int speed = IO.readInt();
		
		if (speed<=60){
			System.out.println ("Your fine is nothing");
		}
		else if (speed>60 && speed <=75){
			System.out.println("Your fine is $100");
		}
		else if (speed>75 && speed<=90){
			System.out.println("Your fine is $200");
		}
		else if (speed>90){
			System.out.println("Your fine is $500");
		}
	
	}

}
