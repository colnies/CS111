
public class anagram {

	public static boolean anagram(String x, String y){
		for(int i=0;i<x.length();i++){
			if((y.indexOf(x.charAt(i))!=-1)){
				if(i<x.length()-1-i){
					return true;
				}
			}else{
				return false;		
			}
		}
		return false;
	}
}
