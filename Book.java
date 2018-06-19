/* Brandon Tu

Class can get and set information about books (book name, author, page numbers, etc.) 
Then create objects with this class and get / set information about the books.

 */

public class Book {

	//Declaring variables
	 String bookname, author, isbn; float price; int pages; 
	 
	 // Constructors
	 public Book(){
		 bookname = ""; 
		 author = ""; 
		 isbn = ""; 
		 price = 0; 
		 pages = 0;
	 }
	 
	public Book(String name, String auth, String ISBN, float cost, int page){ 
		bookname = name;
		author= auth;
		isbn= ISBN;
		price= cost;
		pages=page;
	}
	
	//Getters
	public int getLength() {
		return pages;
	}
	
	public float getPrice() {
		return price;
	}
	
	public static void main(String[] args) {
		
		//Creating class objects and initializing them
		
		Book x= new Book("Book 1", "Piero Smith", "1111111", (float)2.4, 350);
		Book y= new Book("Book 2", "Colin Sullivan", "22222", (float)8, 30);
		Book z= new Book("Book 3", "Brian John", "222222", (float)16, 400);
		
		//Calculating total price of books
		float sum= x.getPrice()+y.getPrice()+z.getPrice();
		
		//Calculating average book length
		int avg= (x.getLength()+y.getLength()+z.getLength())/3;
		
		//Print Statements
		System.out.println("The total price of the books is: "+ sum);
		System.out.println("The average amount of pages in the books is: " + avg);
	}

}
