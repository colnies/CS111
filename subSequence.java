public class subSequence {

		public static String longestSub(String input){
			
			int longSubStart=0;
			int longSublength=1;
			int currSubStart=0;
			int currSubLength=1;
			String subSeq="";
			for(int i= 1; i<input.length();i++){
				if(input.charAt(i)==input.charAt(i-1)){
					currSubLength++;
					if(currSubLength>longSublength){
						longSublength=currSubLength;
						longSubStart=currSubStart;
					}else{
						currSubStart=i;
						currSubLength=1;
				}
					
					for(int j=0;j<longSublength;j++){
						subSeq+=input.charAt(longSubStart);
					}
				return subSeq;			
				}
			}
			return subSeq;
	}
}
