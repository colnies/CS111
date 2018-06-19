
public class WordCount {
	public static int letterCount(String x){
		int count=0;
		for(int i=0;i<x.length();i++){
			char c= x.charAt(i);
		if(Character.isLetter(c))
			count++;	
		}
		return count;	
	}
		
	public static int countWords(String original, int minLength){
		int count=0;
		int index = original.indexOf(" ");
	while (index>=0){
			String curr = original.substring(0,index+1);
		if(letterCount(curr)>=minLength){
				count++;
			}
		original = original.substring(index+1);
		index =original.indexOf(" ");
	}if(letterCount(original)>=minLength&&index<=0){
		count++;
	}if(minLength>=0){
	return count;
}else{
	IO.reportBadInput();
	return count;
	}
}	
}

