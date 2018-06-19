
public class drawCircle {
	public static void main (String[] args){
		System.out.println("Input a size");
		int size = IO.readInt();
		Picasso.moveDown(5);
		Picasso.moveRight(5);
		Picasso.drawCircle(size);
		
		
		Picasso.moveUp(2);
		Picasso.moveRight(1);
		Picasso.drawCircle(1);
	
	
	
		
		Picasso.moveLeft(2);
		Picasso.drawCircle(1);
		
		Picasso.moveDown(4);
		Picasso.drawLineRight(2);
	
	
	
	
	
	
	
	}
}