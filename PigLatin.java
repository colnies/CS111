
public class PigLatin {
	public static String translate(String original){
		original=original.toLowerCase();
		if(original.charAt(0)=='a'||original.charAt(0)=='e'||original.charAt(0)=='i'||original.charAt(0)=='o'||original.charAt(0)=='u'){
			original=original.substring(0)+"way";
			return original;
		}else{
			original=original.substring(1)+original.substring(0,1)+"ay";
			return original;
		}	
	}
	public static void main (String []args){
		System.out.println("Enter chosen words into translator");
		String x= IO.readString();
		
		String y = PigLatin.translate(x);
		System.out.println("Translated: " + y);
	}
}
