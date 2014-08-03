import java.util.Scanner;

/**
 * we will be replacing all the spaces in the text to a %20
 * @author pbhatnagar
 * If you have any questions or comments, please feel free to contact
 * me at pbhatnagar3@gatech.edu
 *
 * MAY THE FORCE OF COMPILER BE WITH YOU. :D
 */
public class ReplaceSpaces {

	public static String replaceSpaces(String input, int length){
		StringBuilder input1 = new StringBuilder(input);
	    int lastCharIndex = input.length() - 1;
		for(int i = length -1; i >=0; i--){
			if(input1.charAt(i) == ' '){
				input1.setCharAt(lastCharIndex--, '0');
				input1.setCharAt(lastCharIndex--, '2');
				input1.setCharAt(lastCharIndex--, '%');				
			}
			else{
				input1.setCharAt(lastCharIndex--, input.charAt(i) );
			}
		}
		return input1.toString();
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string that needs to be manipulated");
		String input = scan.nextLine();
		System.out.println("Enter the actual length");
		int actualLength = scan.nextInt();
		System.out.println("I have done the damage. Here is the output " + replaceSpaces(input, actualLength));
	}
	
}
