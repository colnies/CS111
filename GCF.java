public class GCF {
	public static void gcf(int num1,int num2){
		int hcf =0;
		
        for(int i=1; i<=num1 || i<=num2; i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                hcf=i;
            }
        }
        num1=num1/hcf;
        num2=num2/hcf;
        System.out.println("Simplified Fraction is: "+num1+"/" + num2);	
	}
	public static void main(String[] args) {
		System.out.println("Enter numerator:");
		int num = IO.readInt();
		System.out.println("Enter denominator:");
		int denom = IO.readInt();
		
		int small= Math.min(num, denom);
		int big= Math.max(num,denom);	
		
		gcf(small,big);
	}
}
