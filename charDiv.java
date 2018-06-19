public class charDiv {
	public static void stringSeparate(String s){
		for (int i =0; i<s.length();i++){
			System.out.println(s.charAt(i));
		}
	}	
public static void main (String[]args){
		System.out.println("Enter string");
		String s = IO.readString();
	stringSeparate(s);
	}
}
