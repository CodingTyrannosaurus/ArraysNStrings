import java.util.Scanner;
/**
 * Really simple text compression. :D
 * 
 * @author pbhatnagar
 * If you have any questions or comments, please feel free to contact
 * me at pbhatnagar3@gatech.edu
 *
 * MAY THE FORCE OF COMPILER BE WITH YOU. :D
 */

public class TextCompression {

	public static String textCompression(String input){
		StringBuilder output = new StringBuilder();
		int counter = 1;
		Character previousChar  = null;
		for(char c : input.toCharArray()){
			if(previousChar == null){
				previousChar = c;
				continue;
			}
			if(previousChar != c){
				output.append(previousChar);
				output.append(counter);
				previousChar = c;
				counter = 1;
			}
			else
				counter++;
		}
		//have to take care of the last element that is there in previousChar and its value
		output.append(previousChar);
		output.append(counter);
		//		(output.length() == input.length())?(return input) : (return output.toString());
		// I tried using the above syntax but that is not allowed for return statements. this :/
		if(input.length() == output.length()){
			return input;
		}
		return output.toString();
	}
	
	public static void main(String[] args){
		System.out.println("Enter the string that needs to be compressed");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String result = textCompression(input);
		if(result.length() == input.length()){
			System.out.println("Sorry this is the best that could be currently done but it is not enough");
			System.out.println("here is the result sent back to you " + result);
		}
		else
			System.out.println("The magic is done. Here is your output " + result );
	}
}
