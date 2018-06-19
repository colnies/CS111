
public class objectRecitation {
	public class employee{
		private double accBalance;
		private int rate;
		private String employeeName;
	
	public employee(String name, int hourly, double balance){
		employeeName=name;
		rate=hourly;
		accBalance=balance;
	}
	public employee(String name, int hourly){
		employeeName=name;
		rate=hourly;
		accBalance=0;
	}
	public void work(int hours){
		accBalance+=hours*rate;
	}
	public void spend(double money){
		accBalance-=money;
	}
	public void printInfo(){
		System.out.println("Name: " +employeeName);
		System.out.println("Account Balance: "+accBalance);
		System.out.println("Hourly: "+ rate);
	}
}
	public static void main(String[]args){

		
		
		
		
		
	}
}
