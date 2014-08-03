/**
 * Reverse a string in Java and do that in place
 * There are two ways of doing this. 
 * 	You can do it out of place with a normal traversal.
 * 	You can do this in place theoretically. I say theoretically since we are using Java and strings are immutbable in Java so there is no
 *  point doing it in-place.
 * 
 * @author pbhatnagar
 * If you have any questions or comments, please feel free to contact
 * me at pbhatnagar3@gatech.edu
 *
 * MAY THE FORCE OF COMPILER BE WITH YOU. :D
 */
public class ReverseStrings {

	public static String reverseMe(String input){
		char buffer = '0';		
		for(int i = input.length() - 1; i < input.length()/2; i++){
			buffer = input.charAt(i);
			// we can do the in-place swapping
		}
		
		return input;
	}
}
