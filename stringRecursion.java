
public class stringRecursion {
	public static String backward(String x){
		if(x.equals("")){
			return x;
		}else{
			return x.charAt(x.length()-1)+backward(x.substring(0,x.length()-1));
		}
	}
	public static void main(String[] args) {
		String s=backward(IO.readString());
		System.out.println(s);

	}

}
