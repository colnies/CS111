
public class volumeSphere {

	public static void main(String[] args) {
		System.out.println("Enter radius: ");
		double radius = IO.readDouble();
		
		if (radius <=0){
			System.out.println("Error, negative radius");
		}
		
		double volume;
		volume = (double)4/3*Math.PI*Math.pow(radius, 3);
		System.out.println("Volume: ");
		System.out.println(volume);
		
		
	}

}
