import java.util.Scanner;

/**
 * For figuring out if the chars are unique or not, then I could traverse the String and bruteForce check and that will be O(n^2)
 * could use a hashMap/HashSet and do the same in O(1)
 * If I am not allowed to use any other data structure, then I could just have a boolean vector array or a bit manipulation and check for
 * every character
 * Java uses unicode so keep that in mind
 * @author pbhatnagar
 * If you have any questions or comments, please feel free to contact
 * me at pbhatnagar3@gatech.edu
 *
 * MAY THE FORCE OF COMPILER BE WITH YOU. :D
 */
public class UniqueStrings {

	public static boolean uniqueChecker(String input){
		int checker = 0;
		int index = 0;
		for(char c : input.toCharArray()){
			index = c - 'a';
			if((checker & (1<< index)) > 0)
				return false;
			checker |= (1 << index);
		}
		return true;
	}

	public static void main(String[] args) {
		while(true){
			System.out.println("Enter a string to check for uniqueness");
			Scanner scan = new Scanner(System.in);
			String input = scan.next();
			System.out.println("Result after awesome computation is " + uniqueChecker(input) );
			System.out.println("***************");
		}
	}
}
