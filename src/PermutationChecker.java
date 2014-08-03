import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * This method takes two Strings and check if these are permutations of one another. 
 * This thing will take atleast O(n)
 * @author pbhatnagar
 * If you have any questions or comments, please feel free to contact
 * me at pbhatnagar3@gatech.edu
 *
 * MAY THE FORCE OF COMPILER BE WITH YOU. :D
 */
public class PermutationChecker {

	public static boolean checkMeOut(String input1, String input2){
		if(input1.length() != input2.length())
			return false;
		final Map<Character, Integer> checker = new HashMap<Character, Integer>();
		for(Character c : input1.toCharArray()){
			if(!checker.containsKey(c))
				checker.put(c, 1);
			else
				checker.put(c, checker.get(c) + 1);
		}
		for(Character c : input2.toCharArray()){
			if(!checker.containsKey(c))
				return false;
			if(checker.containsKey(c)){
				if(checker.get(c) == 1)
					checker.remove(c);
				else
					checker.put(c, checker.get(c) - 1);
			}						
		}
		//There can be a case that input 2 can be a subset of input 1 therefore we will have to check
		//Therefore will check for the size of HashMap
		if(checker.size() != 0)
			return false;
		return true;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String 1");
		String input1 = scan.next();
		System.out.println("Enter String 2");
		String input2 = scan.next();
		System.out.println("Awesome computation finished. The fact that these are permutations is " + checkMeOut(input1, input2));
	}
}
