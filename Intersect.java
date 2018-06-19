
public class Intersect {

	public static void main(String[] args) {
	
		System.out.println("Enter the constant d: ");
			double d = IO.readDouble();
		System.out.println("Enter the constant f: ");
			double f = IO.readDouble();
		System.out.println("Enter the constant g: ");
			double g = IO.readDouble();
		
		System.out.println("Enter the constant m: ");
			double m = IO.readDouble();
		System.out.println("Enter the constant b: ");
			double b = IO.readDouble();
				
		if (d==0 && f==m && g==b){
				System.out.println("The lines intersect at every point");
			}
		else if (d==0 && f==m && g!=b){
				System.out.println("The lines are parallel and do not intersect at all");
			}
		else if (d==0 && f!=m){
				double interOne = (g-b)/(m-f);
				double interOneY= ((m*interOne)+b);
				System.out.println("The intersection(s) is/are: ");
				System.out.println("(" + interOne + "," + interOneY + ")");
			}
			
		else{
			double fm = f-m;
			double gb = g-b;
			
			double sqrt1= (( fm * fm) - (4 * d * gb));
			
			if(sqrt1<0){
				System.out.println("The intersection(s) is/are: ");
				System.out.println("None");
			}
			
			else {
			
			double x1 = ((-1*(fm)) + Math.sqrt(sqrt1))/(2 * d);
			double x2 = ((-1*(fm)) - Math.sqrt(sqrt1))/(2 * d);
			
			double y1= ((m*x1)+b);
			double y2= ((m*x2)+b);
			
			System.out.println("The intersection(s) is/are: ");
			System.out.println("(" + x1 + "," + y1 + ")");
			System.out.println("(" + x2 + "," + y2 + ")");
			}
		}	
	}
}
