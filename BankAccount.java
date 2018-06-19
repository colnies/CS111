public class BankAccount {
	private double accBalance;
	private String accNum;
	private String name;
	private String address;
	
	public BankAccount(double i, String x, String y, String z){
		accBalance=i;
		accNum=x;
		name=y;
		address=z;
	}
	public BankAccount(String x, String y, String z){
		accBalance=0;
		accNum=x;
		name=y;
		address=z;
	}
	
	public boolean depositMoney(double x){
		if(x>0.0){
		accBalance+=x;
		return true;
		}else{
			return false;
		}
	}
	public boolean withdrawMoney(double x){
		if(accBalance>x&&x>0.0){
		accBalance-=x;
		return true;
		}else{
			return false;
		}
	}
	public static boolean transferMoney(BankAccount z, BankAccount y, double x){
		if(x<y.accBalance){
		z.depositMoney(x);
		y.withdrawMoney(x);
		return true;
		}else{
			return false;
		}
	}
	public String toString(){
		return "Name: " + name + ", Account Number: " + accNum+", Account Balance: "+ accBalance;
	}
	public String getAccountNumber(){
		return accNum;
	}
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public double getBalance(){
		return accBalance;
	}
}
