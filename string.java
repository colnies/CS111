
public class string {
	
	public static int countLetters(String s){
		int count=0;
	for(int i=0;i<s.length();i++){
		char c= s.charAt(i);
	if(Character.isLetter(c))
		count++;	
	}
	return count;	
}
	
	public static String capitalize(String orig){
		String rv="";
		int index = orig.indexOf(" ");
		
		while (index>0){
			String curr = orig.substring(0,index+1);
			curr = curr.substring(0, 1).toUpperCase()+curr.substring(1);
			rv=rv+curr;
			
			orig = orig.substring(index+1);
			index =orig.indexOf(" ");
		}
		return rv;
	}
	
}

