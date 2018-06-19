public class grader {
	
	public static void printGradebook(double[][]gb,int count, String[] roster){
		for(int i =0; i<roster.length&& roster[i]!=null;i++){
			System.out.print(roster[i] + ": ");
			for(int j=0; j<gb[i].length;j++){
			System.out.print(" "+ gb[i][j]);
			}
		System.out.println();
		}
	}public static int findStudent(String[] roster, String name){
			for (int i=0; roster[i] != null && i<roster.length;i++){
				if(roster[i].equals(name))
					return i;
			}
			return -1;
		
	}
		
	
	public static double assignAvg (double[][] gb, int assign){
		double sum=0;
		for(int i=0;i<gb.length;i++){
			sum=sum+gb[i][assign];
		}
		return sum/gb.length;
	}public static void changeGrade (double[][] gb, String[] roster, String name, double grade, int assign){
		int stud =findStudent(roster, name);
		if(assign>1&& assign<gb[1].length && stud>-1)
		gb[findStudent(roster, name)][assign-1]=grade;
	}
	public static void main(String[] args) {
	
		int choice=0;
		double [] gradebook= new double[30];
		int count =0;
		
		while(choice!=5){
		System.out.println("Menu");
		System.out.println("1. Change grade");
		System.out.println("2. Add grade");
		System.out.println("3. Average student");
		System.out.println("4. Print out grades");
		System.out.println("5. Exit");
		
		choice = IO.readInt();
		
		if (choice ==1){
			System.out.println("Which assignment?");
			int numassignment= IO.readInt();
			System.out.println("What grade?");
			double grade= IO.readDouble();
			
			if(numassignment>0 && numassignment<= count+1){
			gradebook[numassignment-1] = grade;
			}
			else {
				System.out.println("Invalid Assignment");
			}
		}else if (choice == 2){
			if(count == gradebook.length){
				System.out.println("Error. out of space");
			}else{
				System.out.println("What is the grade?");
				double grade = IO.readDouble();
				gradebook[count]= grade;
				count++;
			}		
		}else if (choice==3){
			double sum=0;
			for(int i=0; i<=count;i++){
				sum= sum+gradebook[i];
			}
			System.out.print("Average: ");
			IO.outputDoubleAnswer(sum/count);
		}else if (choice == 4){
			
		}else if(choice==5){
			break;
		}else if (choice !=5){
			System.out.println("Not a valid choice.");
			}
		}
	}
	
}
