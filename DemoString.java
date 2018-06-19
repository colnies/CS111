/* Brandon Tu

Program plays around with String objects and alters them various ways

*/

public class DemoString {

	public static void main(String[] args) {
		
		int length; //declaring length var
		String newTestString; //declaring new String var
		
		String testString= "This is a Test"; //initiates testString
		String bigTestString= testString.toUpperCase(); //Declares a String object then initiates it as upper case testString
		String smallTestString= testString.toLowerCase(); //Declares a String object then initiates it as lowercase testString
		
		newTestString = bigTestString + smallTestString; //Initiates newTestString as the concatenation of big+smallTestStrings
		length= testString.length(); //Initiates int length from the String object length call
		
		System.out.println(testString); //Prints testString with a newline
		System.out.println("String in uppercase: " + bigTestString); //Prints string concatenated with bigTestString and a newline
		System.out.println("String in lowercase: " + testString.toLowerCase()); //Prints string concatenated with the result of testString.toLowerCase() and a newline
		System.out.println("NewTestString is: " + newTestString); //Prints string concatenated with newTestString
		System.out.println("Length of String is: " + length); //Prints string concatenated with the value assigned to length

	}

}
