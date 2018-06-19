
public class MergeSorter {
	
	public static void mergeSort(int[]x){
		int []temp=new int[x.length];
		mergeSort(x,temp,0,x.length-1);
	}
	private static void mergeSort(int[]x,int[]temp, int left, int right){
		if(left<right){
				int center=(right+left)/2;
				mergeSort(x,temp,0,center);
				mergeSort(x,temp,center+1,right);
				merge(x,temp,left,center+1,right);
		}
	}
	public static void merge(int[]x, int[]temp, int left, int right, int rightEnd){
		int k=left;
		int leftEnd=right-1;
		int num=rightEnd-left+1;
		
		while(left<=leftEnd&&right<=rightEnd){
			if(x[left]<=x[right]){
				temp[k++]=x[left++];
			}else{
				temp[k++]=x[right++];
			}
		}while(left<=leftEnd){
			temp[k++]=x[left++];
		}while(right<=rightEnd){
			temp[k++]=x[right++];
		}
	for(int i=0;i<num;i++,rightEnd--){
		x[rightEnd]=temp[rightEnd];
		}
	}
	public static void main(String[]args){
		int[]x=new int [10];
		for(int i=0;i<10;i++){
			System.out.println("Enter number for array");
			int y=IO.readInt();
			x[i]=y;
		}
		mergeSort(x);
		for(int i=0;i<10;i++){
			System.out.print(x[i]+" ");
		}
	}
}
