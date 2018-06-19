
public class BigORecitation {
	public static boolean search(int x){
		double[]arr=new double[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=Math.random();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x){
				return true;
			}
		}
		return false;
	}
	
	public static int gradebook(){
		int count=0;
		int arr[][]=new int[5][6];
		for(int i=0;i<arr.length;i++){
			int min=100;
			int total=0;
			int average=0;
			
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]<min){
					min=arr[i][j];
					total+=arr[i][j];
				}
			}
			average=(total-min)/(arr[0].length-1);
			if(average>=70){
				count++;
			}
		}
		return count;
	}
}
