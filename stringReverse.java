
public class stringReverse {
	public static void main(String[]args){
		String x =IO.readString();
		String tmp;
		String[]xSplit=x.split(" ");
	for(int i=0;i<xSplit.length;i++){
		char[] temp=xSplit[i].toCharArray();
		
		tmp="";
		for(int j=temp.length-1;j>=0;j--){
			tmp+=temp[j];
		}
		xSplit[i]=tmp;
	}
	for(int k=0;k<xSplit.length;k++){
		System.out.print(xSplit[k]+" ");
	}
}
}
