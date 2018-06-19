
public class Elevator {
	private int maxFloor;
	private int currFloor;
	private int capacity;
	private int numberOfRiders;


	public Elevator(int maxFloor,int capacity){
		this.maxFloor=maxFloor;
		this.capacity=capacity;
		numberOfRiders=0;
		currFloor=0;
	}
	public void moveUp(int floors){
		if(currFloor+floors>maxFloor){
			System.out.println("Floor not available");
		}else{
			currFloor+=floors;
		}
	}
	public void moveDown(int floors){
		if(currFloor-floors<0){
			System.out.println("Floor not available");
		}else{
			currFloor-=floors;
		}
	}
	
	public void print(){
		
	}
}


