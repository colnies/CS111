
public class exam {

	public static void main(String[] args) {
		
		int [][] array= {{0,1,2,3},{4,5,6},{7,8,9}};
		
		//#3
		
		//Count Vars//
		 int counter=0;
	     double sum = 0;
	     
	     	//Outer Loop: Looping through array row//
	        for(int i=0;i<array.length;i++){
	        	
	        	//Inner Loop: Looping through individual arrays
	            for(int j=0;j<array[i].length;j++){
	            	
	                sum = sum+array[i][j];
	                counter++;
	            }
	        }

	       /* return sum / counter; Normally would be the output
	        */	
	       System.out.println(sum/counter);
		}

	}
