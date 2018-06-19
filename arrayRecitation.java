
public class arrayRecitation {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<arr.length;i++){
			for(int j=0; j<arr[0].length/2;j++){
				int temp=arr[j][i];
				arr[i][j]=arr[i][arr[0].length-1-j];
				arr[i][arr[0].length-1-j]=temp;
			}
		}

	}

}
