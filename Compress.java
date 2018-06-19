
public class Compress {
	public static String compress(String original){
		int count = 0;
	    String result = "";

	    for (int i=0; i < original.length(); i++) {
	        char a = original.charAt(i);
	        count = 1;

	        while (i + 1 < original.length() && original.charAt(i) == original.charAt(i+1)) {
	            count++;
	            i++;
	        }

	        if (count == 1) {
	            result = result.concat(Character.toString(a));
	        } else {
	            result = result.concat(Integer.toString(count).concat(Character.toString(a)));
	        }
	    }
	    return result;
	}
}
