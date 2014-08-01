import java.util.Arrays;
import java.util.Scanner;

// The following code checks if the string given to us is unique or not

public class UniqueString {

	
	public static boolean vectorCheck(String toCheck){
		boolean[] checker = new boolean[256];
		for(int i = 0; i < toCheck.length(); i++){
			int temp = toCheck.charAt(i);
			if(checker[temp])
				return false;
			checker[temp] = true;
					
		}
		return true;
	}
	//uses bit manipulation
	public static boolean advancedVectorCheck(String toCheck){
		int checker = 0;
		for(int i = 0; i < toCheck.length(); i++){
			int temp = toCheck.charAt(i) - 'a';
			//System.out.println(temp);
			if((checker & 1<<temp) > 0)
				return false;
			checker |= 1<< temp;
		}
		return true;
	}
	
	//uses the brute force method
	public static boolean bruteChecker(String toCheck){
		for(int i = 0; i < toCheck.length(); i++){
			for(int j = i; j <toCheck.length(); j++){
				if(toCheck.charAt(i) == toCheck.charAt(j))
					return false;
			}
		}
		
		return true;
	}
	
	//sorting method
	public static boolean sortChecker(String toCheck){
		char[] temp = toCheck.toCharArray();
		Arrays.sort(temp);
		//System.out.println(temp);
		for(int i = 0; i < temp.length-1; i++){
			if(temp[i] == temp[i+1])
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String toCheck = scan.next();
		if(sortChecker(toCheck))
			System.out.println("The characters entered are unique");
		else
			System.out.println("the elements entered are not unique");
	}
}
