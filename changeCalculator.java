
public class changeCalculator {

	public static void main(String[] args) {
		System.out.println("What is the cost of the purchase?");
		double purchaseCost = IO.readDouble();
		System.out.println("How much is the customer giving");
		double customerMoney=IO.readDouble();
		
		int dollar20=0;
		int dollar10=0;
		int dollar5=0;
		int dollar1=0;
		int cent25=0;
		int cent10=0;
		int cent5 =0;
		int cent1=0;
		
		double dif= customerMoney-purchaseCost;
	if (dif<=0){
		System.out.println("Incorrect Inputs");
	}
	
	else {
	System.out.println("The change is: ");
		while(dif>=20){
			dif=dif-20;
			dollar20++;
		}
		while (dif>=10){
			dif=dif-10;
			dollar10++;
		}
		while (dif>=5){
			dif=dif-5;
			dollar5++;
		}
		while (dif>=1){
			dif=dif-1;
			dollar1++;
		}
		while(dif>=0.25){
			dif=dif-0.25;
			cent25++;
		}
		while (dif>=.10){
			dif=dif-.10;
			cent10++;
		}
		while (dif >= .05){
			dif=dif-.05;
			cent5++;
		}
		while (dif>=.01){
		dif=dif-.01;
		cent1++;
		}
	if (dollar20>0){
	System.out.println(dollar20 + " $20 bills");
	}
	if (dollar10>0){
	System.out.println(dollar10 + " $10 bills");
	}
	if (dollar5>0){
	System.out.println(dollar5 + " $5 bills");
	}
	if (dollar1>0){
	System.out.println(dollar1 + " $1 bills");
	}
	if (cent25>0){
	System.out.println(cent25 + " quarters");
	}
	if(cent10>0){
	System.out.println(cent10 + " dimes");
	}
	if(cent5>0){
	System.out.println(cent5 + " nickels");
	}
	if (cent1>0){
		System.out.println(cent1 + " pennies");
			}
		}
	}
}
