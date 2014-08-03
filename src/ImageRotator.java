import java.util.Scanner;

/**
 * rotating that image. Good practice to revise indexing.  I think i am getting bored with listening to the same music. :/
 * I am assuming that the image is square so that I can do this inplace and I am implementing right rotation. 
 * @author pbhatnagar
 * If you have any questions or comments, please feel free to contact
 * me at pbhatnagar3@gatech.edu
 *
 * MAY THE FORCE OF COMPILER BE WITH YOU. :D
 */
public class ImageRotator {
	
	public int[][] rotateMe(int[][] input){
		
		return input;
	}

	public static void printMe(int[][] input){
		System.out.println();
		for(int i = 0; i < input.length; i++){
			for(int j = 0; j < input.length; j++){
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of square image");
		int size = scan.nextInt();
		int[][] input = new int[size][size];
		scan.nextLine();
		String[] inputArray;
		for(int i = 0; i < size; i++){
			System.out.print("Enter the " + i +" line separated with spaces");
			String inputLine = scan.nextLine();
			System.out.println(inputLine);
			inputArray = inputLine.split(" ");
			for(int j = 0; j < size; j++){
				input[i][j] = Integer.parseInt(inputArray[j]);
			}
		}
		
		System.out.println("You entered the following ");
		printMe(input);
	}
}
